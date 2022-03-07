package com.wllx.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthContributor;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/10/12 17:47:38
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@Component
public class CustomHealth implements HealthIndicator {

    @Override
    public Health health() {
        int errorCode=1;
        if(errorCode!=0){
            return Health.down().withDetail("ErrorCode",errorCode).build();
        }
        return Health.up().build();
    }
}
