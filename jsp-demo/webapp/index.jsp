<%@ page import="java.util.Date"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello from HTML</h1>
	<%= "<h1> Hello from JSP </h1>" %>
	<%
	int x = 10;
	%>
	<input type = "text" value="<%= x %>"><br/>
	<%
	for(int i=0;i<5;i++){
		out.print("i="+i+"</br>");
	}
	
	%>
	<%-- Comment --%>
	<%@include file = "footer.html" %>
	
	The current date is <%= new Date() %>
	
	
	
	<form action = "" >
	<input name = "fname" type = "text">
	<input type = "submit" name = "click" value = "clickme">
	
	
	</form>
	<%
	if(request.getParameter("click")!= null){
		out.print("hello"+request.getParameter("fname"));
	}
	%>
</body>
</html>