package com.jsp.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.Dta.Employee;

public class EmployeeDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Appi");

	public Employee create(Employee employee) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		if (employee != null) {
			entityTransaction.begin();
			entityManager.persist(employee);
			entityTransaction.commit();
		}
		return employee;
	}

	public Employee update(Employee employee) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		if (employee != null) {
			entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();
		}
		return employee;
	}

	public Employee delete(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Employee employee = entityManager.find(Employee.class, id);
		if (employee != null) {
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
		}
		return employee;
	}

	public Employee findById(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee employee = entityManager.find(Employee.class, id);
		return employee;
	}

	public List<Employee> display() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("select a from Employee a");
		return query.getResultList();
	}

	public Employee login(String email, String password) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("select a from a where email=?1 and password=?2");
		return null;

	}
}
