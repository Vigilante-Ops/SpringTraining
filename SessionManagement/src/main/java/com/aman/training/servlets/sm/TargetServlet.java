package com.aman.training.servlets.sm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class TargetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*Cookie[] cookies = request.getCookies();
		for (int i = 0; i < cookies.length; i++) {
			System.out.println(cookies[i].getName());
			System.out.println(cookies[i].getValue());
	
		}*/request //this code is not working as tc is not sending jsessionid	
		HttpSession session = request.getSession();
		String attribute = (String)session.getAttribute("user");
		PrintWriter writer = response.getWriter();
		writer.print("<h1>"+attribute+"</h1>");
	}

	
	

}
