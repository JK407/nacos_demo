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
@TableName("account_source ")
//账户金额来源表
public class AccountSource {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("account_id")
    private Integer accountId;
    @TableField("order_id")
    private Integer orderId;

    @DecimalMin(value = "0.00", inclusive = false)
    @DecimalMax(value = "10000.00", inclusive = false)
    @TableField("amount")
    private BigDecimal amount ;

    @TableField(value = "created_time",fill = FieldFill.INSERT)
    private LocalDateTime createdTime;

    @TableField(value = "updated_time ",fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updatedTime ;
}
