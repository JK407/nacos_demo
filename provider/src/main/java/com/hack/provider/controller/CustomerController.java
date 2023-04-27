package com.hack.provider.controller;


import com.hack.feign.entity.Captain;
import com.hack.feign.entity.Customer;
import com.hack.feign.utils.Result;
import com.hack.provider.service.CaptainService;
import com.hack.provider.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//客户操作
@Transactional
@RestController
@RefreshScope
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @Autowired
    CaptainService captainService;
    @GetMapping("/getCustomerByCaptainName")
    public Result getCustomerByCaptainName(@RequestParam("name") String name){
        List<Customer> customers= customerService.getCustomerByCaptainName(name);
        if (customers.isEmpty()){
            return Result.error("团长不存在！");
        }
        return Result.ok(customers);
    }

    @GetMapping("/addCustomer")
    public Result addCustomer(@RequestParam("name") String name,
                              @RequestBody Customer customer){
        Captain captainList = captainService.getCaptainByName(name);
        if (captainList == null) {
            return Result.error("团长不存在");
        }
        // 判断团长是否已经存在于该商家下
        List<Customer> customerList = customerService.findOneByCaptainId(captainList.getId());
        for (Customer c : customerList) {
            if (c.getName().equals(customer.getName())) {
                return Result.error("该客户已经存在于该团长下");
            }
        }
        // 添加客户，并设置客户的团长信息
        customer.setCaptainId(captainList.getId());
        customerService.addCustomer(customer);
        return Result.ok("添加客户成功！");
    }
}
