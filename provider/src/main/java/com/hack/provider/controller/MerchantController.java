package com.hack.provider.controller;

import com.hack.feign.entity.Merchant;
import com.hack.feign.utils.Result;
import com.hack.provider.mapper.MerchantMapper;
import com.hack.provider.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//商家操作
@Transactional
@RestController
@RefreshScope
@RequestMapping("/merchant")
public class MerchantController {
    @Autowired
    MerchantService merchantService;

    //添加商家
    @PostMapping("/add")
    public Result addMerchant(@RequestBody Merchant merchant){
        //判断是否存在商户
        List<Merchant> merchants = merchantService.findByName(merchant.getName());
        //使用isEmpty判断列表是否为空
        if (merchants.isEmpty()){
            merchantService.save(merchant);
            return Result.ok("商户添加成功");
        }
        return Result.error("商户已存在");
    }


    //通过商家名称查找商家信息
    @GetMapping("/getMerchantByName")
    public Result getMerchantByName(@RequestParam("name") String name){
        List<Merchant> merchant = merchantService.findByName(name);
        if (merchant.isEmpty()) {
                return Result.error("未找到商家：" + name);
        }
        return Result.ok(merchant);
    }
}
