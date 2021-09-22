package com.wllx.controller;

import com.wllx.bean.Food;
import com.wllx.config.FoodConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/09/22 14:18:11
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@RestController
public class JsonController {
//    @Value("${food.rice}")
//    private String rice;
//    @Value("${food.meat}")
//    private String meat;
    @Autowired
    private FoodConfig foodConfig;
    @RequestMapping("/json")
    public Food json(){
        Food food=new Food();
        food.setMeat(foodConfig.getMeat());
        food.setRice(foodConfig.getRice());
        return food;
    }
}
