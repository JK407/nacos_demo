package com.hack.provider.handler;


import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

/**
 * 这个注解 表示就是要把处理器 丢到IOC容器中  这一点千万不能忘记 ！
 */
@Component
/**
 * @author ctgu
 * @date 2022/5/18 8:55
 */
public class MyMetaObjectHandler implements MetaObjectHandler {
    /**
     * 插入时候的填充策略
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {

        //随机生成0-1.0的随机数，并自动添加到commissionRate字段
        BigDecimal randomCommissionRate = new BigDecimal(new Random().nextDouble());
        this.setFieldValByName("commissionRate",randomCommissionRate,metaObject);
        this.setFieldValByName("createdTime", LocalDateTime.now(),metaObject);
        this.setFieldValByName("updatedTime",LocalDateTime.now(),metaObject);



    }

    /**
     * 更新时候的填充策略
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {
//        log.info("start update fill");
        this.setFieldValByName("updatedTime",LocalDateTime.now(),metaObject);

    }
}
