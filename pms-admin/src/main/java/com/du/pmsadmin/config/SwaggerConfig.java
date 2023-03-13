package com.du.pmsadmin.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author DU425
 * @Date 2023/3/13 20:41
 * @Version 1.0
 * @Description
 */
@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfig {


    @Bean
    public Docket creatRestApi() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("酒店管理系统")
                .description("描述：融合资产管理，提升速度")
                .contact(new Contact("shuting.deng", null,"du739999@163.com"))
                .version("1.0.0")
                .build();
    }

}
