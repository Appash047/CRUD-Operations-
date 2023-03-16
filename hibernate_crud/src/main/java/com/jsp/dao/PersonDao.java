package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Person;

public class PersonDao {

	public Person savePerson(Person person) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Appi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		return person;
	}
	// *********************************************************

	public Person updatePerson(Person person) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Appi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.merge(person);
		entityTransaction.commit();
		return person;
	}
	// *********************************************************

	public Person getPersonByID(int id) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Appi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Person person = entityManager.find(Person.class, id);
		return person;
	}

	// *********************************************************

	public Person removePerson(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Appi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person person = entityManager.find(Person.class, id);

		entityTransaction.begin();
		entityManager.remove(person);// deleting the object from table.
		entityTransaction.commit();
		return person;

	}
	// *********************************************************

	public List<Person> getAllPerson() {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Appi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	Query query=  entityManager.createQuery("select a from Person a");// to get all objects OF User.
	  return query.getResultList();
	}

	public Person LoginPerson(String email,String password) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Appi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query=  entityManager.createQuery("select a from Person a where email=?1 and password=?2");// to get all objects OF User.
		return null;

	}
}