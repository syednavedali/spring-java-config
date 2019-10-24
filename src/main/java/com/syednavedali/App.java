package com.syednavedali;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.syednavedali.bean.GreetService;
import com.syednavedali.config.AppConfig;

/**
 * syednavedali.com
 * Spring Configuration With JavaConfig Example
 */
public class App 
{
    public static void main( String[] args )
    {
       ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       GreetService greetService = context.getBean(GreetService.class);
       System.out.println(greetService.greeting());
       System.out.println("============");
       System.out.println(greetService.randomGreeting());
    }
}