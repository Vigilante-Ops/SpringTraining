package com.aman.spring.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHospital {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/aman/spring/springcore/list/listconfig.xml");
		Hospital bean = (Hospital) applicationContext.getBean("hospital");
		System.out.println(bean.getName()); 
		System.out.println(bean.getDepartments());
	 	
	}

}
