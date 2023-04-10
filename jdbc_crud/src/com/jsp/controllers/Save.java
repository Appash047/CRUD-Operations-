package com.jsp.controllers;

import com.jsp.Service.EmployeeService;
import com.jsp.dto.Employee;

public class Save {

	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeService();

		Employee employee = new Employee();
		employee.setId(3);
		employee.setName("mallesh");
		employee.setAge(23);
		employee.setSal(85000.00);
		employee.setEmail("Malli@gmail.com");
		employee.setPassword("Malli@11111");
		employee.setPhoneNo(8688783502l);

		Employee employee2 = employeeService.save(employee);
		if (employee2 != null) {
			System.out.println("Data saved");
		} else {
			System.out.println("Data not saved");
		}
	}

}
