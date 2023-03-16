package com.jsp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.Dao.PersonDao;
import com.jsp.Dto.Person;

@Component
public class PersonService {

	@Autowired
	PersonDao personDao;

	public Person create(Person person) {
		return personDao.create(person);
	}

	public Person update(Person person) {
		return personDao.update(person);
	}

	public Person delete(int id) {
		return personDao.delete(id);
	}

	public Person find(int id) {
		return personDao.findById(id);
	}

	public List<Person> display() {
		return personDao.getAll();
	}
	public Person login(String email, String password) {
		return personDao.login(email, password);
	}
}
