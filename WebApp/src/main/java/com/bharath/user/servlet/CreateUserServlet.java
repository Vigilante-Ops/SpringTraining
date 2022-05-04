package com.bharath.user.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = "/addServlet",initParams = {@WebInitParam(name = "dbString",value = "jdbc:mysql://localhost/mydb"),
@WebInitParam(name = "dbUserName",value = "root"),@WebInitParam(name="dbPassword",value = "admin")		
})
public class CreateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection;
    public void init(ServletConfig config)
    {
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection(config.getInitParameter("dbString"), config.getInitParameter("dbUserName"), config.getInitParameter("dbPassword"));
			
			ServletContext servletContext = config.getServletContext();
			System.out.println(servletContext.getInitParameter("name"));
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public void destroy()
    {
    	try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		try {
		Statement statement=	connection.createStatement();
		int rr=statement.executeUpdate("insert into user values ('"+firstName+"','"+lastName+"','"+email+"','"+password+"')");
		
		PrintWriter writer = response.getWriter();
		writer.print("<h1>"+firstName+" Inserted</h1>");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	 	
	}

}
