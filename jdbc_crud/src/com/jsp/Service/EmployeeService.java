package com.jsp.Service;

import java.util.List;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class EmployeeService {

	EmployeeDao employeeDao = new EmployeeDao();

	public void createTable() {
		employeeDao.createTable();
	}

	public Employee save(Employee employee) {
		return employeeDao.save(employee);
	}

	public int update(Employee employee) {
		return employeeDao.update(employee);
	}

	public int delete(int id) {
		return employeeDao.delete(id);
	}

	public List<Employee> display() {
		return employeeDao.display();
	}

	public Employee find(int id) {
		return employeeDao.find(id);
	}

	public Employee login(String Email, String Password) {
		return employeeDao.login(Email, Password);
	}
}
