package com.jsp.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.Dta.Employee;
import com.jsp.Service.EmployeeService;
@WebServlet("/delete")
public class Delete extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    
		int id=Integer.parseInt(req.getParameter("id"));
		
		Employee employee=new Employee();
		employee.setId(id);
		
		EmployeeService employeeService=new EmployeeService();
		Employee employee2= employeeService.delete(id);
		if(employee2 != null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("display");
			requestDispatcher.forward(req, resp);
		}else {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("index.jsp");
			requestDispatcher.include(req, resp);
		}
	}
}
