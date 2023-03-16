package com.jsp.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.Dta.Employee;
import com.jsp.Service.EmployeeService;

@WebServlet("/display")
public class Display extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		EmployeeService employeeService = new EmployeeService();
		List<Employee> list = employeeService.display();

		if (list.size() > 0) {
			req.setAttribute("displayAll", list);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("Display.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
			requestDispatcher.include(req, resp);
		}
	}
}
