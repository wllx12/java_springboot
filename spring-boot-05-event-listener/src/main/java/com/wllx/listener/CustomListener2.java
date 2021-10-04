package com.wllx.listener;

import com.wllx.enent.CustomEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/10/04 22:22:30
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
public class CustomListener2 implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent event) {
        event.printMessage("CustomListener2 监听到了");
    }
}
