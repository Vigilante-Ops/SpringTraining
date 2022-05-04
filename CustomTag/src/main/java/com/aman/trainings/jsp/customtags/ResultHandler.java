package com.aman.trainings.jsp.customtags;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class ResultHandler extends TagSupport
{
	Connection connection;
	PreparedStatement preparedStatement;
	public ResultHandler()  {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","admin");
			preparedStatement=connection.prepareStatement("select * from user where email=?"); 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public int doStartTag() throws JspException {
		ServletRequest request = pageContext.getRequest();
		String emaillString=request.getParameter("email");
		try {
			preparedStatement.setString(1, emaillString);
			ResultSet executeQuery = preparedStatement.executeQuery();
			while (executeQuery.next()) {
				JspWriter out = pageContext.getOut();
				out.print(executeQuery.getString(1));
				out.print(executeQuery.getString(2));
			}
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return TagSupport.SKIP_BODY;
	}
	
	//release method is called at end 
	@Override
	public void release() {
		try {
			preparedStatement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
