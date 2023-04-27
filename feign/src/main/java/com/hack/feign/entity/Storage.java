package com.hack.feign.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("storage")
//存放货物表
public class Storage {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("captain_id")
    private Integer captainId ;

    @TableField("customer_id")
    private Integer customerId ;

    private String product_name;

    private int product_num;

    @TableField(value = "created_time",fill = FieldFill.INSERT)
    private LocalDateTime createdTime;

    @TableField(value = "updated_time ",fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updatedTime ;
}
