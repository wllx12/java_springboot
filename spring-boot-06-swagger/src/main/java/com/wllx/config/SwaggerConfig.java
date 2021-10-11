package com.wllx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Description: @Configuration @EnableSwagger2 声明配置类 开启swagger
 *
 * @Author: wllx
 * @Date: 2021/10/10 17:27:42
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@Configuration
@EnableOpenApi
public class SwaggerConfig {

    /**
     * @Method: api
     * @Description:    是用Swagger 需要创建一个摘要 Docket
     *                  摘要参数如下：
     *                  文档类型 - 使用swagger2 -  DocumentationType.SWAGGER_2
     *                  文档通过一系列的选择器组成   api  path
     *                  select()设置apis()和paths()
     *                  apis 查找生成哪些controller的接口
     *                  获取所有RequestHandlerSelectors.any()
     *                  path 在查找出来的接口中进行筛选
     * @Param: []->[]
     * @Return: springfox.documentation.spring.web.plugins.Docket
     * @Author: wllx
     * @Date: 2021/10/10 0010  19:50
     */
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.wllx.controller")).paths(PathSelectors.any()).build().apiInfo(apiInfo());
    }

    /**
     * @Method: apiInfo
     * @Description:  自定义文档介绍 可以设置 title description version
     * @Param: []->[]
     * @Return: springfox.documentation.service.ApiInfo
     * @Author: wllx
     * @Date: 2021/10/10 0010  20:39
     */
    public ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("spring-boot-swagger").description("简单的swagger demo").version("1.1.10").contact(new Contact("wllx","#","wllx@msn.com")).build();
    }
}
