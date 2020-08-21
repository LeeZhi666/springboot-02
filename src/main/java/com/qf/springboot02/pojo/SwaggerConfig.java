package com.qf.springboot02.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2//开启Swagger2
public class SwaggerConfig {

    @Bean
    public Docket createDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(createApiInfo())
                .groupName("lizhi")
                .enable(true)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.qf.springboot02.controller"))
                .build();
    }
    @Bean
    public Docket createDocket2(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(createApiInfo())
                .groupName("zhangsan")////分组名称(可以创建多个Docket就有多个组名)
                .enable(true)//enable表示是否开启Swagger
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.qf.springboot02.controller"))
                .build();
    }

    private ApiInfo createApiInfo(){
        return new ApiInfoBuilder()
                .title("测试标题")
                .description("测试描述")
                .termsOfServiceUrl("http://www.baidu.com")
//                .version("1.0")
                .build();
    }

}
