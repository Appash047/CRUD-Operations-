<%@page import="com.jsp.Dta.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display</title>
<style type="text/css">
div table {
	display: flex;
	justify-content: center;
	align-content: center;
}

table tr th {
	padding: 15px;
	font-size: 20px

}

table tr td {
	padding: 10px
}

body {
	background-color: bisque;
}

#d1 {
	text-align: center;
}
</style>
</head>
<body>


	<div>
		<h1 id="d1">
			<u>employee's List</u>
		</h1>
		<%
		List<Employee> list = (List<Employee>) request.getAttribute("displayAll");
		%>
		<table>
			<tr bgcolor="red">
				<th>Id</th>
				<th>Full Name</th>
				<th>Age</th>
				<th>Email</th>
				<th>Password</th>
				<th>PhoneNo</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
			<%
			for (Employee employee : list) {
			%>

			<tr bgcolor="green">
				<td><%=employee.getId()%></td>
				<td><%=employee.getFname() + " " + employee.getLname()%></td>
				<td><%=employee.getAge()%></td>
				<td><%=employee.getEmail()%></td>
				<td><%=employee.getPassword()%></td>
				<td><%=employee.getPhoneNo()%></td>
				<td><a href="findbyid?id=<%=employee.getId()%>">Edit</a></td>
				<td><a href="delete?id=<%=employee.getId()%>">Delete</a></td>


			</tr>
			<%
			}
			%>
		</table>
	</div>
	<br>
</body>
</html>