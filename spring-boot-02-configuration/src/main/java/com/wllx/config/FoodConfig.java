package com.wllx.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/09/22 15:20:51
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@ConfigurationProperties(prefix = "food")
@Data
public class FoodConfig {

    private String rice;

    private String meat;

    private String[] sauce;


}
