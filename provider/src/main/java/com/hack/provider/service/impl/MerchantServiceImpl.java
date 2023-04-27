package com.hack.provider.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.hack.feign.entity.Merchant;
import com.hack.provider.service.MerchantService;
import com.hack.provider.mapper.MerchantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
* @author 谷梁蔚竹
* @description 针对表【merchant】的数据库操作Service实现
* @createDate 2023-04-20 08:01:33
*/
@Service
public class MerchantServiceImpl extends ServiceImpl<MerchantMapper, Merchant>
implements MerchantService{
    @Autowired
    MerchantMapper merchantMapper;

    public List<Merchant> findByName(@RequestParam("name") String name){
        return merchantMapper.getMerchantByName(name);
    }


}
