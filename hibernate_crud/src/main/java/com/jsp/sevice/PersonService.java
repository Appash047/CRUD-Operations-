package com.jsp.sevice;

import java.util.List;

import com.jsp.dao.PersonDao;
import com.jsp.dto.Person;

public class PersonService {
	PersonDao personDao = new PersonDao();

	public Person savePerson(Person person) {
		return personDao.savePerson(person);
	}

	public Person updatePerson(Person person) {
		return personDao.updatePerson(person);
	}
	
	public Person getPersonByID(int id) {
		return personDao.getPersonByID(id);
	}

	public Person removePerson(int id) {
		return personDao.removePerson(id);
	}
	
	public List<Person> getAllPerson() {
		return personDao.getAllPerson();
	}
	public Person LoginPerson(String email,String password) {
		return personDao.LoginPerson(email,password);
	}
	
}
