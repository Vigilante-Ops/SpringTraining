<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello world</title>
</head>
<body>
<h1>Hello jsp world</h1>

<% 
int num1=Integer.parseInt(request.getParameter("number1"));
int num2=Integer.parseInt(request.getParameter("number2"));
%>

Sum of <%=num1 %> and <%=num2 %> is <%=num1+num2 %>
</body>
</html>