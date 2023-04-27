package com.hack.provider.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hack.feign.entity.Captain;
import com.hack.feign.entity.Customer;
import com.hack.provider.service.CustomerService;
import com.hack.provider.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 谷梁蔚竹
* @description 针对表【customer】的数据库操作Service实现
* @createDate 2023-04-20 08:01:33
*/
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer>
implements CustomerService{
    @Autowired
    CustomerMapper customerMapper;

    @Override
    public List<Customer> getCustomerByCaptainName(String name) {
        return customerMapper.getCustomerByCaptainName(name);
    }

    @Override
    public void addCustomer(Customer customer) {

        Customer customer1 = customerMapper.getCustomerByName(customer.getName());
        // 判断该客户是否已经存在于其他商团长
        if (customer1 != null && !customer1.getCaptainId().equals(customer.getCaptainId())) {
            throw new RuntimeException("该客户已经加入其他团长");
        }
        // 添加团长
        customerMapper.addCustomer(customer);
    }

    @Override
    public Customer getCustomerByName(String name) {
        return customerMapper.getCustomerByName(name);
    }

    @Override
    public List<Customer> findOneByCaptainId(int id) {
        return customerMapper.findOneByCaptainId(id);
    }
}
