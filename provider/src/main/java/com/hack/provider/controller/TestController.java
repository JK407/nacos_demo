package com.hack.provider.controller;

import com.hack.provider.config.DataProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Test操作
@RestController
@RefreshScope
public class TestController {

    @Autowired
    DataProperties dataProperties;
    @Value("${server.port}")
    private String port;

//    @Value("${data.env}")
//    private String env;

    @GetMapping("/index")
    public String index(){
        return "提供服务"+port;
    }


    @GetMapping("/config")
    public String getConfig(){
        return  "读取的远程的配置信息："+ dataProperties.getEnv();
    }
}
