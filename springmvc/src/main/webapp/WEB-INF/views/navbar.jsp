<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
*{
	padding: 0;
	margin: 0;
	text-decoration: none;
	list-style: none;
	box-sizing: border-box;
	
}
body{
	font-family: montserrat;
}
nav{
	background: #0082e6;
	height: 80px;
	width: 100%;
	
}
label.logo{
	color: white;
	font-size: 35px;
	line-height: 80px;
	padding: 0 100px;
	font-weight: bold;
}
nav ul {
	float: right;
	margin-right: 20px;
	
}
nav ul li {
	display: inline-block;
	line-height: 80px;
	margin: 0 5px;
	
}
nav ul li a {
	color: white;
	font-size: 17px;
	text-transform: uppercase;
}

</style>
</head>
<body background="file:///D:/JWEJE2/springmvc/img/pexels.jpg">
<div class="container">
<nav>
<label class="logo">Student Management</label>
<ul>
<li><a class="active"  href="#">Home</a></li>
<li><a href="Add.jsp">Add</a></li>
<li><a href="update.jsp">Update</a></li>
<li><a href="delete.jsp">Delete</a></li>
<li><a href="select.jsp">select</a></li>
<li><a href="loginform">Login</a></li>

</ul>
</nav>
</div>
</body>
</html>