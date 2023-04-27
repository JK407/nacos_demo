package com.hack.feign.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Random;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("captain ")
//团长表
public class Captain {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("merchant_id")
    private Integer merchantId;
    private String name;
    private String phone;

    @DecimalMin(value = "0.00", inclusive = false)
    @DecimalMax(value = "1.00", inclusive = false)
    @TableField(value = "commission_rate",fill = FieldFill.INSERT)
    private BigDecimal commissionRate;


    @TableField(value = "created_time",fill = FieldFill.INSERT)
    private LocalDateTime createdTime;

    @TableField(value = "updated_time ",fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updatedTime ;

}
