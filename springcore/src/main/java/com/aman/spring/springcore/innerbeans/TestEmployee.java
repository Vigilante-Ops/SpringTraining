package com.aman.spring.springcore.innerbeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/aman/spring/springcore/innerbeans/config.xml");
		Employee bean = (Employee) applicationContext.getBean("employee");
		//System.out.println(bean.getAddress().getFirstAd()+bean.getAddress().getSecondAd()+bean.getAddress().getThirdAd());
		System.out.println(bean);
		
		Employee bean2 = (Employee) applicationContext.getBean("employee");
		System.out.println(bean2);
		
	}

}
