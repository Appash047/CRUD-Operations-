package com.jsp.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.Dto.Person;
import com.jsp.Service.PersonService;
import com.jsp.util.Configure;

public class save {

	public static void main(String[] args) {
		Person person = new Person();
		person.setId(4);
		person.setName("Appu");
		person.setAge(22);
		person.setEmail("Appash@gmail.com");
		person.setPassword("Appi@1212");

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configure.class);
		PersonService personService = (PersonService) applicationContext.getBean("personService");
		Person person2 = personService.create(person);
		if (person2 != null) {
			System.out.println("Data saved");
		} else {
			System.out.println("Data not Saved");
		}
	}
}
