<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>
<h1>Hello  world from spring</h1>
<%
String name=(String)request.getAttribute("name");
out.println("My name is"+name);
%>
<b>${name}</b>
</body>
</html>