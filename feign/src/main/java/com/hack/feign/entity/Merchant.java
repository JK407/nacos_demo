package com.hack.feign.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("merchant")
//商家表
public class Merchant {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private String address;
    private String phone;
    @TableField(value = "created_time",fill = FieldFill.INSERT)
    private LocalDateTime createdTime;

    @TableField(value = "updated_time ",fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updatedTime ;
}
