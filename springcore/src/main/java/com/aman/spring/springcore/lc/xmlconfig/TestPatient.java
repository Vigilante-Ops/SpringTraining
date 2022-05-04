package com.aman.spring.springcore.lc.xmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPatient {

	public static void main(String[] args) {

	ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/aman/spring/springcore/lc/xmlconfig/config.xml");
	Patient bean = (Patient) applicationContext.getBean("patient");
	System.out.println(bean);
	applicationContext.registerShutdownHook();
	
	
	}

}
