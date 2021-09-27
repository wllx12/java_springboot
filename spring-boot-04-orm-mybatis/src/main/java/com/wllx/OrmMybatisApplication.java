package com.wllx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@MapperScan("com.wllx.dao")
@MapperScan("com.wllx.tkmapper")
public class OrmMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrmMybatisApplication.class, args);
    }

}
