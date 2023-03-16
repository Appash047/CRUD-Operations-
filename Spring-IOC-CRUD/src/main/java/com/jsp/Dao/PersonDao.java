package com.jsp.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.Dto.Person;
import com.mysql.cj.Query;

@Component
public class PersonDao {
	@Autowired
	EntityManagerFactory entityManagerFactory;

	public Person create(Person person) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		if (person != null) {
			entityTransaction.begin();
			entityManager.persist(person);
			entityTransaction.commit();

			return person;
		}
		return null;
	}

	public Person update(Person person) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person person2 = entityManager.find(Person.class, person.getId());
		if (person2 != null) {
			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.commit();

			return person;

		}
		return null;
	}

	public Person findById(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Person person = entityManager.find(Person.class, id);
		return person;
	}

	public Person delete(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person person = entityManager.find(Person.class, id);
		if (person != null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
			return person;
		}
		return null;
	}

	public List<Person> getAll() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		javax.persistence.Query query=entityManager.createQuery("select a from Person a");
		return query.getResultList();
	}

	public Person login(String email,String password) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		javax.persistence.Query query= entityManager.createQuery("select a from Person a where email=?1 and password=?2");
	   return null;
	}
}
