package com.wllx.config;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/10/06 16:36:27
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@Component
public class ListenerConfig {
    @EventListener(WebServerInitializedEvent.class)
    public void onWebserverReady(WebServerInitializedEvent event){
        System.out.println("ListenerConfig-----当前Web容器的实现类是"+event.getWebServer().getClass().getName());
    }
}
