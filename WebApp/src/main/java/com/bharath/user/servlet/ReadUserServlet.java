package com.bharath.user.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/readServlet")
public class ReadUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection;
    public void init()
    {
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "admin");
			
			
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	
		try {
		Statement statement=	connection.createStatement();
		 ResultSet resultSet = statement.executeQuery("select * from user");
		 PrintWriter writer = response.getWriter();
		 writer.print("<table>");
		 writer.print("<tr>");
		 writer.print("<th>");
		 writer.print("FirstName");
		 writer.print("</th>");
		 writer.print("<th>");
		 writer.print("LastName");
		 writer.print("</th>");
		 writer.print("<th>");
		 writer.print("Email");
		 writer.print("</th>");
		 writer.print("</tr>");
		 writer.print("</table>");
		 while(resultSet.next())
		 {
			 writer.print("<tr>");
			 writer.print("<td>");
			 writer.print(resultSet.getString(1));
			 writer.print("</td>");
			 writer.print("<td>");
			 writer.print(resultSet.getString(2));
			 writer.print("</td>");
			 writer.print("<td>");
			 writer.print(resultSet.getString(3));
			 writer.print("</td>");
			 writer.print("</tr>");
		 }
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
