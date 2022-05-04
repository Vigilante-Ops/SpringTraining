package com.bharath.trainings.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloWorldServlet extends GenericServlet {

	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		try (PrintWriter writer = response.getWriter()) {
			writer.println("<html>");
			writer.println("<body>");
			writer.println("<h1>Hello world</h1>");
			writer.println("</body>");
			writer.println("</html>");
		}
	}

}
