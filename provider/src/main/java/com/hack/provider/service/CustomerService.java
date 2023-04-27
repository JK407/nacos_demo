package com.hack.provider.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.hack.feign.entity.Captain;
import com.hack.feign.entity.Customer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
* @author 谷梁蔚竹
* @description 针对表【customer】的数据库操作Service
* @createDate 2023-04-20 08:01:33
*/
public interface CustomerService extends IService<Customer> {

    List<Customer> getCustomerByCaptainName(@RequestParam("name") String name);

    void addCustomer(@RequestBody Customer customer);

    Customer getCustomerByName(@RequestParam("name") String name);


    List<Customer> findOneByCaptainId(@RequestParam("id") int id);
}
