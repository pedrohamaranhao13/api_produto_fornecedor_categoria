package br.com.phamtecnologias.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI customOpenAPI() {
        return new OpenAPI().components(new Components())
                .info(new Info()
                        .title("API para controle de produtos")
                        .version("1.0")
                        .description("Projeto desenvolvido com Spring Boot e Spring Data JPA")
                        .version("V1"));
    }
	
}
