<%@ page import="java.sql.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <%!
    Connection connection;
    PreparedStatement preparedStatement;
    
    public void jspInit()
    {
    	try
    	{
    
    	Class.forName("");
    	connection=DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "admin");
    	preparedStatement=connection.prepareStatement("insert into user values(?,?,?,?)");
    	}
    	catch(Exception e)
    	{
    		
    	}
    }
    
    %>