package com.jsp.controllers;

import com.jsp.Service.EmployeeService;

public class CreateTable {

	public static void main(String[] args) {

		EmployeeService employeeService=new EmployeeService();
		employeeService.createTable();
	}

}
