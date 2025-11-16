package com.LearnSpringBoot.first.Utilities;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.*;
import org.springframework.context.annotation.Lazy;


@Configuration
public class Util0 {
	
	Util0(){
		System.out.println("Bean: Inside the configuration annotated Util0 class");
	}

    @Lazy
    @Bean
   TestBean registerBean() {
		System.out.println("first Lazy Bean creating......");
		
		return new TestBean("Deepak","Deepak");
	}



}
