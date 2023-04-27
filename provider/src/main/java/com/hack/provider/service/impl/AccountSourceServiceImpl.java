package com.hack.provider.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hack.feign.entity.AccountSource;
import com.hack.provider.service.AccountSourceService;
import com.hack.provider.mapper.AccountSourceMapper;
import org.springframework.stereotype.Service;

/**
* @author 谷梁蔚竹
* @description 针对表【account_source】的数据库操作Service实现
* @createDate 2023-04-20 08:01:33
*/
@Service
public class AccountSourceServiceImpl extends ServiceImpl<AccountSourceMapper, AccountSource>
implements AccountSourceService{

}
