package com.aman.spring.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCountries {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/aman/spring/springcore/properties/propertiesconfig.xml");
		CountriesAndLanguages bean = (CountriesAndLanguages) applicationContext.getBean("countlang");
		System.out.println(bean.getCountriesAndLanguages());
		
	 	
	}

}
