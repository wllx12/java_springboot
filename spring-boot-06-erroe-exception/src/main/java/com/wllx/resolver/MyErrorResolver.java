package com.wllx.resolver;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @Description: 需要是一个Bean 能够被spring 容器处理  才会生效
 * @Author: wllx
 * @Date: 2021/10/10 00:45:19
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@Component
public class MyErrorResolver implements ErrorViewResolver {
    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {

        if(status.equals(HttpStatus.NOT_FOUND)){
            ModelAndView modelAndView=new ModelAndView();
            modelAndView.setViewName("/resolver404");
            return modelAndView;
        }
        return null;
    }
}
