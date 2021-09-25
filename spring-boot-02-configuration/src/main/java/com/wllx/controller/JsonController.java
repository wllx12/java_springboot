package com.wllx.controller;

import com.wllx.bean.Food;
import com.wllx.bean.Vegetables;
import com.wllx.config.FoodConfig;
import com.wllx.config.VegetablesConfig;
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
    @Value("${info.username}")
    private String username;
    @Value("${info.password}")
    private String password;


    @Autowired
    private FoodConfig foodConfig;
    @Autowired
    private VegetablesConfig vegetablesConfig;


    @RequestMapping("/json")
    public Food json(){
        Food food=new Food();
        food.setMeat(foodConfig.getMeat());
        food.setRice(foodConfig.getRice());
        food.setSauce(foodConfig.getSauce());
        return food;
    }

    @RequestMapping("/vegetables")
    public Vegetables vegetables(){
        Vegetables vegetables=new Vegetables();
        vegetables.setPotato(vegetablesConfig.getPotato());
        vegetables.setEggplant(vegetablesConfig.getEggplant());
        vegetables.setGreenpeper(vegetablesConfig.getGreenpeper());

        return vegetables;
    }
    @RequestMapping("/jasypt")
    public String jasypt(){
        return username +
                "\t" +
                password;
    }




}
