package com.wllx.customizer;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/10/10 00:59:29
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@Configuration
public class MyCustomizer {
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> customizer(){
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                ErrorPage errorPage=new ErrorPage(HttpStatus.NOT_FOUND,"/error404");
                factory.addErrorPages(errorPage);
            }
        };
    }
}
