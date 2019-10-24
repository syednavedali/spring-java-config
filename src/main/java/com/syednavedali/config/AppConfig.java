package com.syednavedali.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.syednavedali.bean.GreetService;

@Configuration
@Import({RandomGreetingConfig.class})
public class AppConfig {
	private String msgText = "Java Config";
	
	@Bean
	public String msgText() {
		return msgText;
	}
	
	@Bean
	public GreetService greetService() {
		return new GreetService();
	}
}