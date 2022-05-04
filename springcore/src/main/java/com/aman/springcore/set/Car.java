package com.aman.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car {

	public static void main(String[] args) {

	 ClassPathXmlApplicationContext  applicationContext=new ClassPathXmlApplicationContext("com/aman/springcore/set/Setconfig.xml");
	 CarDealer bean = (CarDealer) applicationContext.getBean("cardealer");
	 System.out.println(bean.getModels());
	}

}
