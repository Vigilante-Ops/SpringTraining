package com.aman.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/aman/springcore/map/customerconfig.xml");
		Customer bean = (Customer) applicationContext.getBean("customer");
		System.out.println(bean.getProducts());

	 	
	}

}
