package com.hack.provider.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.hack.feign.entity.Account;

import java.util.List;

/**
* @author 谷梁蔚竹
* @description 针对表【account】的数据库操作Service
* @createDate 2023-04-20 08:01:33
*/
public interface AccountService extends IService<Account> {
    List<Account> getAllAccounts();

}
