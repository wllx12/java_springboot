package com.wllx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/10/10 01:06:02
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@Controller
public class MyErrorController {
    @RequestMapping("/error404")
    public String error404(){

        return "error404";
    }
    @RequestMapping("/testError")
    public String error() throws Exception {
        throw new Exception("测试异常");
    }
}
