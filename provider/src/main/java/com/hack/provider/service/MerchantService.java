package com.hack.provider.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.hack.feign.entity.Merchant;
import com.hack.provider.mapper.MerchantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
* @author 谷梁蔚竹
* @description 针对表【merchant】的数据库操作Service
* @createDate 2023-04-20 08:01:33
*/
public interface MerchantService extends IService<Merchant> {
    List<Merchant> findByName(@RequestParam("name") String name);


}
