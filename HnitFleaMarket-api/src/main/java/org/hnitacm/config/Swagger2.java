package org.hnitacm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: HnitFleaMarket
 * @description: swagger2配置文件
 * @author: Leo
 * @date: 2020-05-21 22:36
 **/
@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.hnitacm.controller"))
                .paths(PathSelectors.any())
                .build();
        //TODO swagger2扫描不到接口

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("HnitFleaMarket")
                .contact(new Contact("HnitACM",
                        "www.hnitoj.cn",
                        "364779323@qq.com"))
                .description("二手交易平台api文档")
                .version("1.0.0")
                .termsOfServiceUrl("https://www.hnitfleamarket.com")
                .build();


    }
}
