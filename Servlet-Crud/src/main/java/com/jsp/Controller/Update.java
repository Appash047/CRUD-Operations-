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
@WebServlet("/update")
public class Update extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Employee employee = new Employee();
		employee.setId(Integer.parseInt(req.getParameter("id")));
		employee.setFname(req.getParameter("fname"));
		employee.setLname(req.getParameter("lname"));
		employee.setAge(Integer.parseInt(req.getParameter("age")));
		employee.setEmail(req.getParameter("email"));
		employee.setPassword(req.getParameter("password"));
		employee.setPhoneNo(Long.parseLong(req.getParameter("phoneNo")));

		EmployeeService employeeService = new EmployeeService();
		Employee employee2 = employeeService.update(employee);
		if (employee2 != null) {
			req.setAttribute("", employee2);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("Home.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
			requestDispatcher.include(req, resp);
		}
	}

}
