package com.jsp.Service;

import java.util.List;

import com.jsp.Dao.EmployeeDao;
import com.jsp.Dta.Employee;

public class EmployeeService {

	EmployeeDao employeeDao = new EmployeeDao();

	public Employee create(Employee employee) {
		return employeeDao.create(employee);
	}

	public Employee update(Employee employee) {
		return employeeDao.update(employee);
	}

	public Employee delete(int id) {
		return employeeDao.delete(id);
	}

	public Employee findById(int id) {
		return employeeDao.findById(id);
	}

	public List<Employee> display() {
		return employeeDao.display();
	}

	public Employee login(String email, String password) {
		return employeeDao.login(email, password);
	}
}
