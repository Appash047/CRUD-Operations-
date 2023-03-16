<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
div {
	border: 6px solid black;
	width: 600px;
	height: 650px;
	margin-top: 20px;
	padding: 5px;
	display: flex;
	justify-content: center;
	align-content: center;
}

body {
	display: flex;
	justify-content: center;
	align-content: center;
}

input {
	width: 100%;
	height: 5%;
	border: 1px solid;
	font-size: 18px

}

.d1 {
	border: 2px solid green;
	width: 150px;
	height: 40px;
	background-color: pink;
	/* margin-left: 100px; */
}
::placeholder { 
  color: red;
  opacity: 1; 
  font-size: 15px;
}
body{
    background-color: bisque;
}
</style>
</head>
<body>
	<div>
		<form action="create" method="post">
			<h1>Fill the Registation Form</h1>
			ID : <input type="number" name="id" placeholder="Enter ur ID"><br>
			<br>First Name : <input type="text" name="fname"
				placeholder="Enter ur First Name"> <br>
			<br> Last Name : <input type="text" name="lname"
				placeholder="Enter ur Last Name"> <br>
			<br> Age : <input type="number" name="age"
				placeholder="Enter ur Age"><br>
			<br> Email : <input type="email" name="email"
				placeholder="Enter ur Email"><br>
			<br> Password : <input type="password" name="password"
				placeholder="Enter ur Password" id="myInput"><input type="checkbox" onclick="myFunction()">
			<br> Phone No : <input type="tel" name="phoneNo"
				placeholder="Enter ur Phone Number"><br>
			<br> <input type="reset" value="Reset" class="d1">
			     <input type="submit" value="Register" class="d1">
		</form>

	</div>
<script type="text/javascript">
function myFunction() {
	  var x = document.getElementById("myInput");
	  if (x.type === "password") {
	    x.type = "text";
	  } else {
	    x.type = "password";
	  }
	}
</script>
</body>
</html>