package com.aman.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aman.spring.springmvc.dto.Employee;
@Controller
public class ObjectController {
    @RequestMapping("/sendobj")
	public ModelAndView sendObject()
	{
    	ModelAndView modelAndView = new ModelAndView();
    	modelAndView.setViewName("displayObject");
    	Employee employee=new Employee();
    	employee.setId(1);employee.setName("Aman");employee.setSalary(3000.23);
    	modelAndView.addObject("emp",employee);
		return modelAndView;
		
	}
	
}
