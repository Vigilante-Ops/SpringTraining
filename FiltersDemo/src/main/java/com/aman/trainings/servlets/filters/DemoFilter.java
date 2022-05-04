package com.aman.trainings.servlets.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/*")
public class DemoFilter implements Filter {


	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter writer = response.getWriter();
		
		
		chain.doFilter(request, response);
		writer.print("<h1>pre Filter</h1>");
		writer.print("<h1>post Filter</h1>");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
