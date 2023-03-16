<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<style type="text/css">

 h1{
    color: rgb(234, 101, 13);
    text-align: center;
 }
 ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
  }
  
  li {
    float:left;
  }
  
  li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
  }
  
  li a:hover:not(.active) {
    background-color: #111;
  }

  div{
border: 2px solid red;

  }
body{
    background-color: bisque;
}
ul{
    display: flex;
    justify-content: center;
    align-content: center;
}
  
  
  

</style>
</head>
<body>
<br><br>
 <h1>Welcome to Employee(Servlet+JSP) mini Project</h1>
 <br><br>
<div>
    <ul>
        <li><a href="Create.jsp">Create</a></li>
        <li><a href="FindById.jsp">FindById</a></li>
        <li><a href="display">Display</a></li>
        <li><a href="#about">Login</a></li>
      </ul>
 </div>
</body>
</html>