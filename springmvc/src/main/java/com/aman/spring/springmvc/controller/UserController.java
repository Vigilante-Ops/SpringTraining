package com.aman.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aman.spring.springmvc.dto.User;

@Controller
public class UserController {
	
	@RequestMapping("/registerpage")
	public String showRegistrationPage()
	{
		
		return "userReg";
	}
	@RequestMapping(value = "/registerUser",method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user)//"user written in @ModelAttribute is optional"
	{
		System.out.println(user);
		//automatically sets value in user obj and in modelandview  add obj
		
		return "greeting";
	}

}
