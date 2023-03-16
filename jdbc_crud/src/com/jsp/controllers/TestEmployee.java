package com.jsp.controllers;


import java.util.List;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class TestEmployee {

	public static void main(String[] args) {

		EmployeeDao employeeDao = new EmployeeDao();
//		employeeDao.createTableEmployee();


//		Employee employee=new Employee();
//		
//		employee.setId(6);
//		employee.setName("mallesh");
//		employee.setPhone(666666666l);
//		employee.setSal(85000.00);
//		employee.setEmail("Malli@gmail.com");
//		employee.setPassword("Malli@11111");
//		
//		Employee employee2=employeeDao.saveEmployee(employee);
//		if(employee2!=null) {
//			System.out.println("Data saved");
//		}
//		else {
//			System.out.println("Data not saved");
//		}

		// ----------------------------------------------------------
//		Employee employee = new Employee();
//
//		employee.setId(1);
//		employee.setName("mallesh");
//		employee.setPhone(666666666l);
//		employee.setSal(85000.00);
//		employee.setEmail("Malli@gmail.com");
//		employee.setPassword("Malli@11111");
//
//		int employee2 = employeeDao.upDateEmployee(employee);
//		if (employee2 > 0) {
//			System.out.println("Data update");
//		} else {
//			System.out.println("Data not updated");
//		 }

		
		//---------------------------------------------------------------
//		int res=employeeDao.deleteEmployee(1);
//		if(res>0) {
//			System.out.println("data deleted");
//		}
//		else {
//			System.out.println("data not deleted");
//		}
		
		
		
		List<Employee> list=employeeDao.getAllEmployee();
		for(Employee employee : list ) {
			System.out.println("Employee ID  :"+ employee.getId());
			System.out.println("Employee Name  :"+ employee.getName());
			System.out.println("Employee Phone  :"+ employee.getPhone());
			System.out.println("Employee sal :"+ employee.getSal());
			System.out.println("Employee Email :"+ employee.getEmail());
			System.out.println("Employee Password :"+ employee.getPassword());
			
			System.out.println("-----------------------------------------------");
			
			

			
		}
		
		
//		Employee employee=employeeDao.getEmployeeById(1	);
//		if(employee != null) {
//			
//			System.out.println("Employee ID  :"+ employee.getId());
//			System.out.println("Employee Name  :"+ employee.getName());
//			System.out.println("Employee Phone  :"+ employee.getPhone());
//			System.out.println("Employee sal :"+ employee.getSal());
//			System.out.println("Employee Email :"+ employee.getEmail());
//			System.out.println("Employee Password :"+ employee.getPassword());
//			
//		}
//		else  {
//			System.out.println("data not found");
//		}
		
//		Employee employee=employeeDao.Login("Malliil.com", "Malli@11111");
//		if(employee != null) {
//			System.out.println("Employee ID  :"+ employee.getId());
//			System.out.println("Employee Name  :"+ employee.getName());
//			System.out.println("Employee Phone  :"+ employee.getPhone());
//			System.out.println("Employee sal :"+ employee.getSal());
//			System.out.println("Employee Email :"+ employee.getEmail());
//			System.out.println("Employee Password :"+ employee.getPassword());
//			
//		}
//		else  {
//			System.out.println("Invalid email and password....");
//		}
		
	}

}
