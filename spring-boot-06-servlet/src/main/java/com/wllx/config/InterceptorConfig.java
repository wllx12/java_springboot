package com.wllx.config;

import com.wllx.interceptor.CustomInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/10/08 17:01:57
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Autowired
    private CustomInterceptor customInterceptor;

    /**
     * @Method: addInterceptors
     * @Description: 注册自定义拦截器，定义拦截规则
     * @Param: [org.springframework.web.servlet.config.annotation.InterceptorRegistry]->[registry]
     * @Return: void
     * @Author: wllx
     * @Date: 2021/10/8 0008  17:08
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(customInterceptor).addPathPatterns("/**");
    }
}
