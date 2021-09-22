package com.wllx.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/09/22 15:20:51
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@ConfigurationProperties(prefix = "food")
public class FoodConfig {

    private String rice;

    private String meat;

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
}
