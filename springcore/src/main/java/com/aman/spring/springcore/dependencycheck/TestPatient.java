package com.aman.spring.springcore.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPatient {

	public static void main(String[] args) {

	ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/aman/spring/springcore/dependencycheck/config.xml");
	Prescription bean = (Prescription) applicationContext.getBean("prescription");
	System.out.println(bean.getId());
	applicationContext.registerShutdownHook();
	
	
	}

}
