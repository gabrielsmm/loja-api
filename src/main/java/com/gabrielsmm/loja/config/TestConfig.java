package com.gabrielsmm.loja.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gabrielsmm.loja.services.DbService;
import com.gabrielsmm.loja.services.EmailService;
import com.gabrielsmm.loja.services.MockEmailService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DbService dbService;

    @Bean
    void instanciaBaseDeDados() {
        try {
			this.dbService.instanciaBaseDeDados();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    @Bean
    EmailService emailService() {
    	return new MockEmailService();
    }
	
}
