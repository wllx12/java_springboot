package com.wllx.config;

import com.wllx.filter.CustomFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/10/07 22:19:48
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean<CustomFilter> filterFilterRegistrationBean(){
        FilterRegistrationBean<CustomFilter> filterFilterRegistrationBean=new FilterRegistrationBean<>();
        filterFilterRegistrationBean.setFilter(new CustomFilter());
        filterFilterRegistrationBean.addUrlPatterns("/*");
//        filterFilterRegistrationBean.setOrder(0);//决定优先级  越小优先级越高
        return filterFilterRegistrationBean;
    }
}
