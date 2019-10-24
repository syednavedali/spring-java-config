package com.syednavedali.config;

import org.springframework.context.annotation.Bean;

import com.syednavedali.bean.RandomGreeting;

public class RandomGreetingConfig {
	@Bean
	public RandomGreeting randomGreeting() {
		return new RandomGreeting();
	}
}
