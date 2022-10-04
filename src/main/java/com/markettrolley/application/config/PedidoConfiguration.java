package com.markettrolley.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Classe base de configuracao.
 */
@Configuration
public class PedidoConfiguration {

	
    @Bean
    public RestTemplate restTemplate() {
    	return new RestTemplate();
    }


}
