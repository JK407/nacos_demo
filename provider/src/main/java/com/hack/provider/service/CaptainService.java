package com.hack.provider.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.hack.feign.entity.Captain;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
* @author 谷梁蔚竹
* @description 针对表【captain】的数据库操作Service
* @createDate 2023-04-20 08:01:33
*/
public interface CaptainService extends IService<Captain> {
    List<Captain> getCaptainsByMerchantName(@RequestParam("name") String name);

    void addCaptain(@RequestBody Captain captain);

    Captain getCaptainByName(@RequestParam("name") String name);

    List<Captain> findByMerchantId(@RequestParam("id") int id);

}
