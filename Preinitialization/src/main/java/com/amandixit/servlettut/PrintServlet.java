package com.amandixit.servlettut;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebInitParam(name = "firstName",value = "Aman")
public class PrintServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	public void init(ServletConfig config)
	{
		
		System.out.println(config.getInitParameter("firstName"));
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("called");
		response.getWriter().print("hello  world");
	}


}
