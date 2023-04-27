package com.hack.provider.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "data")   //前缀名，访问data.env数据
public class DataProperties {
    private String env;
}
