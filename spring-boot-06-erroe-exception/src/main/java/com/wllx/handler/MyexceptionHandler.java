package com.wllx.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/10/10 13:14:43
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@ControllerAdvice
public class MyexceptionHandler {
    @ExceptionHandler(Exception.class)
    public ModelAndView handler(Exception e){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/error");
        mv.addObject("message",e.getMessage());
        return mv;
    }
}
