package com.aman.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamsController {
	@RequestMapping(value = "/showdata")
	public ModelAndView showData(@RequestParam(value = "id",defaultValue = "123",required = false) int id,@RequestParam("name") String name,@RequestParam("sal") double salary)
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userReg");
		return modelAndView;
	}

}
