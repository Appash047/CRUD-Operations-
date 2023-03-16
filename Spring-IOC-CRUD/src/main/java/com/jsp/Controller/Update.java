package com.jsp.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.Dto.Person;
import com.jsp.Service.PersonService;
import com.jsp.util.Configure;

public class Update {

	public static void main(String[] args) {

		Person person = new Person();

		person.setId(2);
		person.setName("Malli");
		person.setAge(26);
		person.setEmail("Malli@gmail.com");
		person.setPassword("Malli1212");

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configure.class);
		PersonService personService = (PersonService) applicationContext.getBean("personService");
		Person person2 = personService.update(person);
		if(person2 != null) {
			System.out.println("Data Updated");
		}else {
			System.out.println("data not updated");
		}
		
	}
}
