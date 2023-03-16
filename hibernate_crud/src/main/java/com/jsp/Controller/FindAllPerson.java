package com.jsp.Controller;

import java.util.List;

import com.jsp.dto.Person;
import com.jsp.sevice.PersonService;

public class FindAllPerson {

	public static void main(String[] args) {

		PersonService personService=new PersonService();
		 List<Person> list=personService.getAllPerson();
		for(Person person:list) {
			System.out.println("Person ID       "+person.getId());
			System.out.println("Person Name     "+person.getName());
			System.out.println("Person Age      "+person.getAge());
			System.out.println("Person PhNumber "+person.getPhoneNo());
			System.out.println("Person Email    "+person.getEmail());
			System.out.println("Person Password "+person.getPassword());
			System.out.println("**********************************");

		}
		
		
		
	}

}
