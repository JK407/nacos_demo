package com.hack.provider.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hack.feign.entity.Order;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 谷梁蔚竹
* @description 针对表【t_order】的数据库操作Mapper
* @createDate 2023-04-20 08:01:33
* @Entity com.hack.provider.domain.TOrder
*/
@Mapper
public interface TOrderMapper extends BaseMapper<Order> {


}
