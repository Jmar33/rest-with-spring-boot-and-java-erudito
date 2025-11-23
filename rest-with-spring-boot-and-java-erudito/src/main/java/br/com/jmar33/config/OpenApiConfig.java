package br.com.jmar33.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    OpenAPI customAOpenAPI(){
        return new OpenAPI()
            .info(new Info()
                .title("REST API's RESTful from 0 with Java, Spring Boot, Kubernets and Docker")
                    .version("V1")
                    .description("REST API's RESTful from 0 with Java, Spring Boot, Kubernets and Docker")
                    .termsOfService("https://pub.erudio.com.br/meus-cursos")
                    .license(new License()
                        .name("Apache 2.0")
                        .url("https://pub.erudio.com.br/meus-cursos")
                    )
            );
    }
}
