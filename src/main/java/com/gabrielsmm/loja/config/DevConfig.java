package com.gabrielsmm.loja.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gabrielsmm.loja.services.DbService;
import com.gabrielsmm.loja.services.EmailService;
import com.gabrielsmm.loja.services.SmtpEmailService;

@Configuration
@Profile("dev")
public class DevConfig {

	@Autowired
	private DbService dbService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;
	
	@Bean
	boolean instanciaBaseDeDados() throws ParseException {
		if(this.strategy.equals("create")) {
			this.dbService.instanciaBaseDeDados();
			return true;
		} else {
			return false;
		}
	}
	
	@Bean
	EmailService emailService() {
		return new SmtpEmailService();
	}
	
}
