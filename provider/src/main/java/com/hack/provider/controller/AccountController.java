package com.hack.provider.controller;

import com.hack.feign.utils.Result;
import com.hack.provider.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//账户表操作
@RestController
@RefreshScope
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    //得到所有的账户信息
    @GetMapping("/getAllAccounts")
    public Result getAll(){
        return Result.ok(accountService.getAllAccounts());
    }
}
