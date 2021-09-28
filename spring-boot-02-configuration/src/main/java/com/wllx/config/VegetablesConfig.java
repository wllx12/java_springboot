package com.wllx.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/09/22 22:33:59
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@Configuration
@ConfigurationProperties(prefix = "vegetables")
@PropertySource("classpath:vegetables.properties")
public class VegetablesConfig {
    private String potato;
    private String eggplant;
    private String greenpeper;


    public String getPotato() {
        return potato;
    }

    public void setPotato(String potato) {
        this.potato = potato;
    }

    public String getEggplant() {
        return eggplant;
    }

    public void setEggplant(String eggplant) {
        this.eggplant = eggplant;
    }

    public String getGreenpeper() {
        return greenpeper;
    }

    public void setGreenpeper(String greenpeper) {
        this.greenpeper = greenpeper;
    }
}
