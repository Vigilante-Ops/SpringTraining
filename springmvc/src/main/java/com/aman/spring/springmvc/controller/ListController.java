package com.aman.spring.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aman.spring.springmvc.dto.Employee;
@Controller
public class ListController {
    @RequestMapping("/list")
	public ModelAndView sendObject()
	{
    	ModelAndView modelAndView = new ModelAndView();
    	modelAndView.setViewName("listObject");
    	
    	Employee employee=new Employee();
    	employee.setId(1);employee.setName("Aman");employee.setSalary(3000.23);
    	
    	Employee employee2=new Employee();
    	employee2.setId(2);employee2.setName("Adarsh");employee2.setSalary(1000.23);
    	
    	Employee employee3=new Employee();
    	employee3.setId(3);employee3.setName("Viany");employee3.setSalary(9000.23);
    	
    	List<Employee> employees = new ArrayList<Employee>();
    	employees.add(employee3);
    	employees.add(employee2);
    	employees.add(employee);
    	modelAndView.addObject("emps", employees);
		return modelAndView;
		
	}
	
}
