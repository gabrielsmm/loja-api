package com.gabrielsmm.loja.services;

import org.springframework.mail.SimpleMailMessage;

import com.gabrielsmm.loja.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
