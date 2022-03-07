package com.wllx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBoot09CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot09CacheApplication.class, args);
    }

}
