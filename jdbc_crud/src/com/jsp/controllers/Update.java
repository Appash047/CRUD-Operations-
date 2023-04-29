package com.jsp.controllers;

import com.jsp.Service.EmployeeService;
import com.jsp.dto.Employee;

public class Update {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Appu");
		employee.setAge(22);
		employee.setSal(25000.00);
		employee.setEmail("Appi@gmail.com");
		employee.setPassword("Appii@11111");
		employee.setPhoneNo(666666666l);

		EmployeeService employeeService = new EmployeeService();
		int employee2 = employeeService.update(employee);
		if (employee2 > 0) {
			System.out.println("Data update");
		} else {
			System.out.println("Data not updated");
		}
	}

}
