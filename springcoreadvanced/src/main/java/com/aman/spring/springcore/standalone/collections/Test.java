package com.aman.spring.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("com/aman/spring/springcore/standalone/collections/config.xml");
		
		ProductList bean = (ProductList) applicationContext.getBean("productsList");
		System.out.println(bean.getProducts());
		
		
	}

}
