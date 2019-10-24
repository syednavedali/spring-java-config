package com.syednavedali.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.annotation.PostConstruct;

public class RandomGreeting {
	
	private List<String> greetings;
	
	@PostConstruct
	public void init() {
		greetings = Arrays.asList(
                        "syednavedali.com",
			"syednavedali.com/category/spring/",
			"www.syednavedali.com/category/java/");
	}
	
	public String next() {
		return greetings.get(new Random().nextInt(greetings.size()-1));
	}
}