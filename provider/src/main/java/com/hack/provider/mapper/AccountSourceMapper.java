package com.hack.provider.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hack.feign.entity.AccountSource;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 谷梁蔚竹
* @description 针对表【account_source】的数据库操作Mapper
* @createDate 2023-04-20 08:01:33
* @Entity com.hack.provider.domain.AccountSource
*/
@Mapper
public interface AccountSourceMapper extends BaseMapper<AccountSource> {


}
