package com.jsp.controllers;

import com.jsp.Service.EmployeeService;
import com.jsp.dto.Employee;

public class Find {

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		Employee employee = employeeService.find(3);
		if (employee != null) {

			System.out.println("Employee ID  :" + employee.getId());
			System.out.println("Employee Name  :" + employee.getName());
			System.out.println("Employee Phone  :" + employee.getAge());
			System.out.println("Employee sal :" + employee.getSal());
			System.out.println("Employee Email :" + employee.getEmail());
			System.out.println("Employee Password :" + employee.getPassword());
			System.out.println("Employee Password :" + employee.getPhoneNo());

		} else {
			System.out.println("data not found");
		}
	}

}
