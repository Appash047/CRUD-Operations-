package com.jsp.controllers;

import java.util.List;

import com.jsp.Service.EmployeeService;
import com.jsp.dto.Employee;

public class Display {

	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeService();
		List<Employee> list = employeeService.display();
		for (Employee employee : list) {
			System.out.println("Employee ID  :" + employee.getId());
			System.out.println("Employee Name  :" + employee.getName());
			System.out.println("Employee Age  :" + employee.getAge());
			System.out.println("Employee sal :" + employee.getSal());
			System.out.println("Employee Email :" + employee.getEmail());
			System.out.println("Employee Password :" + employee.getPassword());
			System.out.println("Employee Email :" + employee.getPhoneNo());

			System.out.println("-----------------------------------------------");

		}

	}
}
