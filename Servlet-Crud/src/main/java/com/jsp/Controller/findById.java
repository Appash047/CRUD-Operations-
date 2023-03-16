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
@WebServlet("/findbyid")
public class findById extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		Employee employee=new Employee();
		employee.setId(id);
		
		EmployeeService employeeService=new EmployeeService();
		Employee employee2= employeeService.findById(id);
		if(employee2 != null) {
			req.setAttribute("find", employee2);
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("Update.jsp");
			requestDispatcher.forward(req, resp);
		}else {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("index.jsp");
			requestDispatcher.include(req, resp);
		}
	}

}
