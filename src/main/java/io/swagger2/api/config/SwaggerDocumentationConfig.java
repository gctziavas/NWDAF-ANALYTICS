package io.swagger2.api.config;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

import com.fasterxml.classmate.TypeResolver;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.AlternateTypeRules;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
@Configuration
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Nnwdaf_AnalyticsInfo")
            .description("Nnwdaf_AnalyticsInfo Service API. © 2020, 3GPP Organizational Partners (ARIB, ATIS, CCSA, ETSI, TSDSI, TTA, TTC). All rights reserved. ")
            .license("")
            .licenseUrl("http://unlicense.org")
            .termsOfServiceUrl("")
            .version("1.2.0-alpha.1")
            .contact(new Contact("","", ""))
            .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
        	.select()
                .apis(RequestHandlerSelectors.basePackage("io.swagger2.api"))
                .build()
            .directModelSubstitute(java.time.LocalDate.class, java.sql.Date.class)
            .directModelSubstitute(java.time.OffsetDateTime.class, java.util.Date.class)
            .apiInfo(apiInfo())
		    ;
		 }
 

}
