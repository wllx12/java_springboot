package com.wllx.controller;

import com.wllx.enent.CustomEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/10/04 00:18:30
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@RestController
public class EventController {
    @Autowired
    private ApplicationEventPublisher publisher;

    @RequestMapping("/event")
    public String event(){
        publisher.publishEvent(new CustomEvent(this));
        return "Success";
    }
}
