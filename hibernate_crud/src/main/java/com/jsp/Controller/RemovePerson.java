package com.jsp.Controller;

import com.jsp.dto.Person;
import com.jsp.sevice.PersonService;

public class RemovePerson {

	public static void main(String[] args) {

		PersonService personService=new PersonService();
		Person person=personService.removePerson(22);
		if(person != null) {
			System.out.println("data removed");
		}
		else {
			System.out.println("data not found");
		}
	}

}
