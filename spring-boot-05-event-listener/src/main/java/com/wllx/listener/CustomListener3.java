package com.wllx.listener;

import com.wllx.enent.CustomEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/10/04 23:05:56
 * @Version: 1.0
 * @Tel/QQ: 691033
 */

/**
 * 不需要实现ApplicListener接口
 * 先声明当前类是Component组件需要加载
 * 通过@EventListener 声明是一个监听组件
 */
@Component
public class CustomListener3 {
    @EventListener
    public void enentListener(CustomEvent event){
        event.printMessage("CustomListener3 监听到了");
    }
}
