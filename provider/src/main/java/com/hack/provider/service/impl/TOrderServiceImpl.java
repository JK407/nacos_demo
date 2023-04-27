package com.hack.provider.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hack.feign.entity.Order;
import com.hack.provider.service.TOrderService;
import com.hack.provider.mapper.TOrderMapper;
import org.springframework.stereotype.Service;

/**
* @author 谷梁蔚竹
* @description 针对表【t_order】的数据库操作Service实现
* @createDate 2023-04-20 08:01:33
*/
@Service
public class TOrderServiceImpl extends ServiceImpl<TOrderMapper, Order>
implements TOrderService{

}
