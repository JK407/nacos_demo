package com.hack.provider.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hack.feign.entity.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author 谷梁蔚竹
* @description 针对表【account】的数据库操作Mapper
* @createDate 2023-04-20 08:01:33
* @Entity com.hack.provider.domain.Account
*/
@Mapper
public interface AccountMapper extends BaseMapper<Account> {
    List<Account> getAllAccounts();

}
