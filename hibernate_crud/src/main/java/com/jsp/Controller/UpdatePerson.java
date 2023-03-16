package com.jsp.Controller;

import com.jsp.dto.Person;
import com.jsp.sevice.PersonService;

public class UpdatePerson {

	public static void main(String[] args) {

		Person person = new Person();
		person.setId(47);
		person.setName("Appu");
		person.setAge(24);
		person.setPhoneNo(8688783502l);
		person.setEmail("Appi@gmail.com");
		person.setPassword("Appi@123");

		PersonService personService=new PersonService();
		Person person2=personService.updatePerson(person);
		if(person2 != null) {
			System.out.println("data Updated");
		}
		else {
			System.out.println("data not found");
		}
	}

}
