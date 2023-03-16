package com.jsp.Controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.Dto.Person;
import com.jsp.Service.PersonService;
import com.jsp.util.Configure;

public class Display {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configure.class);
		PersonService personService = (PersonService) applicationContext.getBean("personService");
		List<Person> list = personService.display();
		for (Person person : list) {
			System.out.println("Person Id :" + person.getId());
			System.out.println("Peson Name :" + person.getName());
			System.out.println("Person Age :" + person.getAge());
			System.out.println("person email :" + person.getEmail());
			System.out.println("Person Password :" + person.getPassword());
			System.out.println("**************************");
		}
	}

}
