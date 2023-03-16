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
div{
border:  5px solid black;
margin-top: 50px;
width: 400px;
height: 400px;
display: flex;
	justify-content: center;
	align-content: center;
}
h1{
color: red;
}
input{
width: 200px;
height: 20px}
#d1{
padding: 10px;
width: 100px;
margin-left: 80px;
height: 30px;
color: red;
background-color: pink;
}
</style>
</head>
<body>
	<div>
		<form action="findbyid" method="post">
			<h1>Enter the ID</h1>
			ID : <input type="number" name="id" placeholder="Enter ur ID"><br>
			<br> <input type="submit" value="Find" id="d1">
		</form>
	
	</div>
</body>
</html>