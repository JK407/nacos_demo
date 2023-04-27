package com.hack.provider.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hack.feign.entity.Account;
import com.hack.feign.entity.Captain;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
* @author 谷梁蔚竹
* @description 针对表【captain】的数据库操作Mapper
* @createDate 2023-04-20 08:01:33
* @Entity com.hack.provider.domain.Captain
*/
@Mapper
public interface CaptainMapper extends BaseMapper<Captain> {
    List<Captain> getCaptainsByMerchantName(@RequestParam("name") String name);

    boolean addCaptain(@RequestBody Captain captain);

    Captain getCaptainByName(@RequestParam("name") String name);


    //name == merchantName
    List<Captain> findOneByMerchantId(@RequestParam("id") int id);

}
