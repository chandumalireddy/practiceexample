package com.example.program2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.program2.service;

@Configuration
public class ccc {

	
	@Bean
	public service getnum() {
		return new service();
	}

	
}
