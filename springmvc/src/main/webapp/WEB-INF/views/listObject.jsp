<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.aman.spring.springmvc.dto.Employee,java.util.List"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Employee> employees = (List<Employee>) request.getAttribute("emps");

	for (Employee e : employees) {
		out.print(e.getId());
		out.print(e.getName());
		out.print(e.getSalary());
	}
	%>
</body>
</html>