package com.hack.provider.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hack.feign.entity.Captain;
import com.hack.feign.utils.Result;
import com.hack.provider.service.CaptainService;
import com.hack.provider.mapper.CaptainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
* @author 谷梁蔚竹
* @description 针对表【captain】的数据库操作Service实现
* @createDate 2023-04-20 08:01:33
*/
@Service
public class CaptainServiceImpl extends ServiceImpl<CaptainMapper, Captain>
implements CaptainService{
    @Autowired
    CaptainMapper captainMapper;

    @Override
    public List<Captain> getCaptainsByMerchantName(@RequestParam("name")  String name) {
        List<Captain> captainList =  captainMapper.getCaptainsByMerchantName(name);
        return captainList;
    }

    @Override
    public void addCaptain(@RequestBody Captain captain) {

        Captain existCaptain = captainMapper.getCaptainByName(captain.getName());
        // 判断该团长是否已经存在于其他商家
        if (existCaptain != null && !existCaptain.getMerchantId().equals(captain.getMerchantId())) {
            throw new RuntimeException("该团长已经加入其他商家");
        }
        // 添加团长
        captainMapper.addCaptain(captain);
    }

    @Override
    public Captain getCaptainByName(@RequestParam("name") String name) {
        return captainMapper.getCaptainByName(name);
    }

    @Override
    public List<Captain> findByMerchantId(@RequestParam("id") int id) {
        return captainMapper.findOneByMerchantId(id);
    }
}
