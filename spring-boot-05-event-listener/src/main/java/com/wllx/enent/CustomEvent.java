package com.wllx.enent;

import org.springframework.context.ApplicationEvent;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/10/04 00:10:41
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
public class CustomEvent extends ApplicationEvent {

    public CustomEvent(Object source) {
        super(source);
    }

    public void printMessage(String msg){
        System.out.println("自定义事件，打印信息："+msg);
    }
}
