package com.wllx;

import com.wllx.config.FoodConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/09/22 09:34:18
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@SpringBootApplication
@EnableConfigurationProperties({FoodConfig.class})
public class DemoApplication {
    public static void main(String[] args) {
//        使用SpringApplic的静态方法启动springboot  参数程序的入口类  main函数的args参数
        SpringApplication.run(DemoApplication.class,args);
    }
}
