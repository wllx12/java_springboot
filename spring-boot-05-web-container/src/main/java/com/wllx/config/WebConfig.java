package com.wllx.config;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/10/05 23:25:50
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@Configuration
public class WebConfig {
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> customizer(){
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                factory.setPort(8899);

            }
        };
    }

    @Bean
    public ApplicationRunner runner(WebServerApplicationContext context){
        return args->{
            System.out.println("WebConfig-----当前Web容器的实现类是"+context.getWebServer().getClass().getName());
        };
    }
}
