package com.hack.provider.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hack.feign.entity.Captain;
import com.hack.feign.entity.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
* @author 谷梁蔚竹
* @description 针对表【customer】的数据库操作Mapper
* @createDate 2023-04-20 08:01:33
* @Entity com.hack.provider.domain.Customer
*/
@Mapper
public interface CustomerMapper extends BaseMapper<Customer> {


    List<Customer> getCustomerByCaptainName(@RequestParam("name") String name);

    boolean addCustomer(@RequestBody Customer customer);

    Customer getCustomerByName(@RequestParam("name") String name);


    //name == merchantName
    List<Customer> findOneByCaptainId(@RequestParam("id") int id);
}
