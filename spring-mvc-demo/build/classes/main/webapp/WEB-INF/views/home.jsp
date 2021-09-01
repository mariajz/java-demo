<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<h1>Welcome to spring MVC</h1>
	<form action="sayName" method = "POST">
	Enter Name:<input type = "text" name = "fname"/>
	<input type = "submit" value = "click me"/>
	</form>
	
	<br/>
	<h2>Try Logging in </h2>
	<form action = "Login" method = "POST">
	
		UserName: <input type = "text" name = "username"/>
		password: <input type = "text" name = "password"/>
		<input type = "submit" value = "Login"/>
	
	</form>
	
	<span style="color:red">${errorMessage}</span><br/>
	<a href="register">Click here to register</a>
</body>
</html>