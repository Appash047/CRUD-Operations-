package com.jsp.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.Dto.Person;
import com.jsp.Service.PersonService;
import com.jsp.util.Configure;

public class Find {

	public static void main(String[] args) {

		int id = 2;
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configure.class);
		PersonService personService = (PersonService) applicationContext.getBean("personService");
		Person person= personService.find(id);
		if(person != null) {

			System.out.println("Person Id :" + person.getId());
			System.out.println("Peson Name :" + person.getName());
			System.out.println("Person Age :" + person.getAge());
			System.out.println("person email :" + person.getEmail());
			System.out.println("Person Password :" + person.getPassword());
		}else {
			System.out.println("Id not valide");
		}
	}

}
