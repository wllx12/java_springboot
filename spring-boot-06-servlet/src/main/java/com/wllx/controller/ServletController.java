package com.wllx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/10/08 17:30:28
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@RestController
public class ServletController {
    @RequestMapping("/servlet")
    public String servlet(){
        System.out.println("=================ServletController======================");
        return "hello world";
    }
}
