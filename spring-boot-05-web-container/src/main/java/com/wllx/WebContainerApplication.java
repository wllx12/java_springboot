package com.wllx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@SpringBootApplication
public class WebContainerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebContainerApplication.class, args);
    }


    @Bean
    public RouterFunction<ServerResponse> hello(){
        return route(GET("/hello"),serverRequest-> ok().body(Mono.just("Hello World"),String.class));
    }

}
