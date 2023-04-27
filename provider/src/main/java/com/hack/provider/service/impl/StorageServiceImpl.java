package com.hack.provider.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hack.feign.entity.Storage;
import com.hack.provider.service.StorageService;
import com.hack.provider.mapper.StorageMapper;
import org.springframework.stereotype.Service;

/**
* @author 谷梁蔚竹
* @description 针对表【storage】的数据库操作Service实现
* @createDate 2023-04-20 08:01:33
*/
@Service
public class StorageServiceImpl extends ServiceImpl<StorageMapper, Storage>
implements StorageService{

}
