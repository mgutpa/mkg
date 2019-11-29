package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.controller.Person;

@Configuration
public class PersonConfiguration {
	
	@Bean
	public Person getAbc() {
		return new Person("Mantu", "Kumar", "Gupta");
	}

}
