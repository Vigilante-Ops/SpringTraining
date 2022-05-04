package com.bharath.trainings.servlets.jdbc.preparedstatement;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PreparedStatement stmt;
	Connection connection;
 
	public void init()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root", "admin");
			stmt=connection.prepareStatement("insert into product values(?,?,?,?)");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void destroy()
	{
		try {
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String nameString= request.getParameter("name");
		String descriptionString= request.getParameter("description");
		int price=Integer.parseInt(request.getParameter("price"));
		try {
			stmt.setInt(1, id);
			stmt.setString(2, nameString);
			stmt.setString(3, descriptionString);
			stmt.setInt(4, price);
			stmt.executeUpdate();
			PrintWriter writer = response.getWriter();
			writer.print("<h1>Inserted</h1>");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
