package com.wllx.listener;

import com.wllx.enent.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/10/04 22:22:30
 * @Version: 1.0
 * @Tel/QQ: 691033
 */

/**
 * 通过component 声明是需要加载的监听器
 */
@Component
public class CustomListener2 implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent event) {
        event.printMessage("CustomListener2 监听到了");
    }
}
