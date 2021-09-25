package com.wllx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/09/23 22:00:52
 * @Version: 1.0
 * @Tel/QQ: 691033
 */

/**
 * @Controller 是视图层用的注解
 * @RestController 是返回json数据时用的注解
 */
@Controller
public class FTLController {
    @RequestMapping("/ftlh")

    public String index(Model model){
        model.addAttribute("now",new Date().toString());
        return "/freemarker/index";
    }


}
