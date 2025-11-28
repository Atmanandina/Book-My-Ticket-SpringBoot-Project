package com.jsp.book_my_ticket.config;

import java.security.SecureRandom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconfig {
	@Bean
	SecureRandom random() {
		return new SecureRandom();
	}
}
