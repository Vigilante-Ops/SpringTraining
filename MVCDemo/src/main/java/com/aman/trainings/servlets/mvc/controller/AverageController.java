package com.aman.trainings.servlets.mvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aman.training.servlet.mvc.model.AverageCalculator;

@WebServlet("/averageController")
public class AverageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1=Integer.parseInt(request.getParameter("number1")) ;
		int num2=Integer.parseInt(request.getParameter("number2")) ;
		AverageCalculator averageCalculator=new AverageCalculator();
		int result=averageCalculator.calculate(num1, num2);
		request.setAttribute("result", result);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("result.jsp");	
		requestDispatcher.forward(request, response);
	}

}
