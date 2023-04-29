package com.jsp.controllers;

import com.jsp.Service.EmployeeService;

public class Delete {

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		int res = employeeService.delete(1);
		if (res > 0) {
			System.out.println("data deleted");
		} else {
			System.out.println("data not deleted");
		}
	}

}
