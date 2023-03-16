package com.jsp.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jsp.Dto.Person;

@Configuration
@ComponentScan(basePackages = "com.jsp")
public class Configure {

	@Bean
	public EntityManagerFactory getEntityManagerFactory() {
		return Persistence.createEntityManagerFactory("Appi");
	}

	@Bean
	public Person getPerson() {
		return new Person();
	}
}
