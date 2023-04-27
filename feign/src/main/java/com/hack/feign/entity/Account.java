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
@TableName("account")
//账户表
public class Account {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("captain_id")
    private Integer captainId ;
    @DecimalMin(value = "0.00", inclusive = false)
    @DecimalMax(value = "10000.00", inclusive = false)
    @TableField("balance")
    private BigDecimal balance ;

    @TableField(value = "created_time",fill = FieldFill.INSERT)
    private LocalDateTime createdTime;

    @TableField(value = "updated_time",fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updatedTime ;
}
