package com.aman.spring.springcore.Shopping;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestShopping {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/aman/spring/springcore/Shopping/config.xml");
		ShoppingCart bean = (ShoppingCart) applicationContext.getBean("shopping");
		System.out.println(bean.getItems().getId());
	}

}
