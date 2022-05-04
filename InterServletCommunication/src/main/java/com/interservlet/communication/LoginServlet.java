package com.interservlet.communication;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection;
	private PreparedStatement preparedStatement;
	
       public void init()
       {
    	   try {
    		Class.forName("com.mysql.jdbc.Driver");  
			connection=DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "admin");
			 preparedStatement = connection.prepareStatement("select * from user where email=? && password=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   
       }
       public void destroy()
       {
    	   
       }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String firstName=request.getParameter("userName");
		String password=request.getParameter("password");
		try {
			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, password);
			ResultSet executeQuery = preparedStatement.executeQuery();
			RequestDispatcher dispatcher;
			if(executeQuery.next()==true)
			{
				dispatcher=request.getRequestDispatcher("HomeServlet");
				dispatcher.forward(request, response);
				
			}
			else {
				dispatcher=request.getRequestDispatcher("login.html");
				dispatcher.include(request, response);
				
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
