package com.jsp.Controller;

import com.jsp.dto.Person;
import com.jsp.sevice.PersonService;

public class LoginPerson {

	public static void main(String[] args) {

		PersonService personService=new PersonService();
		Person person=personService.LoginPerson("Appi@gmail.com", "Appi@123");
		if(person != null) {
			System.out.println("Peron ID"+person.getId());
			System.out.println("Peron Name"+person.getName());
			System.out.println("Peron Age"+person.getAge());
			System.out.println("Peron PhNumber"+person.getPhoneNo());
			System.out.println("Peron Email"+person.getEmail());
			System.out.println("Peron Password"+person.getPassword());
			System.out.println("**********************************");

		}
		else {
			System.out.println("data not found");
		}
	}

}
