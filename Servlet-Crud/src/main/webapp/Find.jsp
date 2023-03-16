<%@page import="com.jsp.Dta.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background-color: bisque;
	display: flex;
	justify-content: center;
	align-content: center;
}

table {
	margin-top: 50px;
}

th {
	padding: 15px
}

td {
	padding: 10px;
}
</style>
</head>
<body>
	<%
	Employee employee = (Employee) request.getAttribute("find");
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
	</table>
</body>
</html>