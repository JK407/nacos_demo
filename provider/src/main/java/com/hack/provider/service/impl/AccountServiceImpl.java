package com.hack.provider.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hack.feign.entity.Account;
import com.hack.provider.service.AccountService;
import com.hack.provider.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 谷梁蔚竹
* @description 针对表【account】的数据库操作Service实现
* @createDate 2023-04-20 08:01:33
*/
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account>
implements AccountService{

    @Autowired
    AccountMapper accountMapper;

    public List<Account> getAllAccounts(){
        return accountMapper.getAllAccounts();
    };

}
