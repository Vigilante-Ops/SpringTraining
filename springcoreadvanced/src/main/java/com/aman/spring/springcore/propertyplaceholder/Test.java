package com.aman.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("com/aman/spring/springcore/propertyplaceholder/config.xml");
		
		MyDAOJava bean = (MyDAOJava) applicationContext.getBean("dao");
		System.out.println(bean.getPort());
		
		
	}

}
