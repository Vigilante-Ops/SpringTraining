package com.aman.spring.springcore.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/aman/spring/springcore/injecting/interfaces/config.xml");
	OrderBO bean = (OrderBO) applicationContext.getBean("bo");
	bean.placeOrder();
	}

}
