package com.aman.spring.springcore.reftype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudentScore {

	public static void main(String[] args) {

	  ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/aman/spring/springcore/reftype/Studentconfig.xml");
	  Student bean = (Student) applicationContext.getBean("student");  
	  System.out.println(bean.getScores().getChemistry());
	  System.out.println(bean.getScores().getMaths());
	  System.out.println(bean.getScores().getPhysics());
	}

}
