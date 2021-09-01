<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "" method = "POST">

Enter Name: <input type = "text" name = "name" required/>
Enter Age: <input type = "text" name = "age"/>
Enter Email: <input type = "email" name = "email"/>
Enter Password: <input type = "password" name = "password"/>
Gender: 
Female <input type = "radio" name = "gender" value="female"/>
Male <input type = "radio" name = "gender" value="male"/>

Hobbies: 
Reading <input type = "checkbox" name = "hobbies" value="reading"/>
Writing<input type = "checkbox" name = "gender" value="writing"/>

Country:
<select name = "country">
<option value = "select">Select a country</option>
<option>India</option>
<option>US</option>
</select>

<input type = "submit" name = "register" value = "Register Details"/>


</form>


<% if(request.getParameter("register")!= null){%>
	
	
	<jsp:useBean id="user" class="com.to.User" scope = "request" ></jsp:useBean>
	<jsp:setProperty property="*" name = "user"/>
	<jsp:forward page = "RegisterServlet"></jsp:forward>
	
<% } %>


</body>
</html>