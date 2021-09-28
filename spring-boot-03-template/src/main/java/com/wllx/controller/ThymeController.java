package com.wllx.controller;

import com.wllx.bean.Restaurant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/09/24 11:12:46
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@Controller
public class ThymeController {
    @RequestMapping("/thyme")
    public String index(Model model){
        Restaurant ra=new Restaurant();
        ra.setBoss("琳琳");
        ra.setChef("欣欣");
        model.addAttribute("ra",ra);
        model.addAttribute("name","<h1>thymeleaf</h1>");
        return "/thymeleaf/index";
    }
    @RequestMapping("/welcome")
    public String welcome(){
        return "/thymeleaf/welcome";
    }
}

