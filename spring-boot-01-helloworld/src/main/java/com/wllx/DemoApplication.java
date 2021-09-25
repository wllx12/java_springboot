package com.wllx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: SpringBoot入口类
 * @Author: wllx
 * @Date: 2021/09/21 15:51:52
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
//        使用SpringApplic的静态方法启动springboot  参数程序的入口类  main函数的args参数
        SpringApplication.run(DemoApplication.class,args);
    }
}
