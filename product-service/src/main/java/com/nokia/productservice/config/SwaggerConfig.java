package com.nokia.productservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Employee REST CRUD operations API in Spring-Boot 2")
                .description(
                        "Sample REST API for centalized documentation using Spring Boot and spring-fox swagger 2 ")
                .termsOfServiceUrl("").version("0.0.1-SNAPSHOT").contact(new Contact("Satish Sharma", "https://github.com/hellosatish", "https://github.com/hellosatish")).build();
    }

    @Bean
    public Docket configureControllerPackageAndConvertors() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.nokia.productservice.controller")).build()
                .apiInfo(apiInfo());
    }
}
