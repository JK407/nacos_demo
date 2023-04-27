package com.hack.provider.controller;

import com.hack.feign.entity.Captain;
import com.hack.feign.entity.Merchant;
import com.hack.feign.utils.Result;
import com.hack.provider.service.CaptainService;
import com.hack.provider.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//团长操作
@Transactional
@RestController
@RefreshScope
@RequestMapping("/captain")
public class CaptainController {

    @Autowired
    CaptainService captainService;

    @Autowired
    MerchantService merchantService;


    //根据商家名字得到所管理的团长信息
    @GetMapping("/getCaptain")
    public Result getCaptainsByMerchantName(@RequestParam("name") String name){
        // 根据商家名称查询商家信息
        List<Merchant> merchantList = merchantService.findByName(name);
        if (merchantList.isEmpty()) {
            return Result.error("商家不存在");
        }
        return Result.ok(captainService.getCaptainsByMerchantName(name));
    }


    //根据商家名字增加团长
    //当团长在另外一个商家管理下返回异常
    @GetMapping("/addCaptain")

    //传入merchantID和captain实体类
    public Result addCaptain(@RequestParam("name") String name,
                             @RequestBody Captain captain) {
        // 根据商家名称查询商家信息
        List<Merchant> merchantList = merchantService.findByName(name);
        if (merchantList.isEmpty()) {
            return Result.error("商家不存在");
        }
        Merchant merchant = merchantList.get(0);

        // 判断团长是否已经存在于该商家下
        List<Captain> captainList = captainService.findByMerchantId(merchant.getId());
        for (Captain c : captainList) {
            if (c.getName().equals(captain.getName())) {
                return Result.error("该团长已经存在于该商家下");
            }
        }

        // 添加团长，并设置团长的商家信息
        captain.setMerchantId(merchant.getId());
        captainService.addCaptain(captain);

        return Result.ok("添加团长成功");
    }
}
