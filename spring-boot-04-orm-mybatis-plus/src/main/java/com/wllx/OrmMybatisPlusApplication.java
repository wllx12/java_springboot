package com.wllx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wllx.mapper")
public class OrmMybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrmMybatisPlusApplication.class, args);
    }

}
