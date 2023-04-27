package com.hack.provider.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hack.feign.entity.Merchant;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
* @author 谷梁蔚竹
* @description 针对表【merchant】的数据库操作Mapper
* @createDate 2023-04-20 08:01:33
* @Entity com.hack.provider.domain.Merchant
*/
@Mapper
public interface MerchantMapper extends BaseMapper<Merchant> {


    List<Merchant> getMerchantByName(@RequestParam("name") String name);
}
