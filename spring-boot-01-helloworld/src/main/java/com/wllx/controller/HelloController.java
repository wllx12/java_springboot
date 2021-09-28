package com.wllx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/09/29 01:40:22
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello duing";
    }
}
