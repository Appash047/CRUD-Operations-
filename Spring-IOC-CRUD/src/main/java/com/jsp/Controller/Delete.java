package com.jsp.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.Dto.Person;
import com.jsp.Service.PersonService;
import com.jsp.util.Configure;

public class Delete {

	public static void main(String[] args) {
		int id = 1;

		Person person = new Person();

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configure.class);
		PersonService personService = (PersonService) applicationContext.getBean("personService");
		Person person2 = personService.delete(id);
		if (person2 != null) {
			System.out.println("Data deleted");
		}else {
			System.out.println("Enter Correct ID");
		}
	}

}
