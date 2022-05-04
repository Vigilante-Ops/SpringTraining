package com.aman.spring.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/aman/spring/springcore/constructorinjection/config.xml");
		Employee employee= (Employee) applicationContext.getBean("employee");
		System.out.println(employee.getId());
		System.out.println(employee.getAddress().getFirstAd());
	}

}
