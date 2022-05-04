package com.aman.springcoreadvanced.stereotypes.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/aman/springcoreadvanced/stereotypes/annotation/config.xml");
		Instructor instructor= (Instructor) applicationContext.getBean("inst");
		System.out.println(instructor.getId());
		System.out.println(instructor.getProfile().getTitle());
		System.out.println(instructor.getCheck1());
	
	}

}
