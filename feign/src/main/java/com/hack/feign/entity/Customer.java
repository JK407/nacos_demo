package com.hack.feign.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("customer")
//客户表
public class Customer {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("captain_id")
    private Integer captainId ;
    private String name;
    private String phone;
    @TableField(value = "created_time",fill = FieldFill.INSERT)
    private LocalDateTime createdTime;

    @TableField(value = "updated_time ",fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updatedTime ;
}
