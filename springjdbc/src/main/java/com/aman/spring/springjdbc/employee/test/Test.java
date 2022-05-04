package com.aman.spring.springjdbc.employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {

		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/aman/spring/springjdbc/config.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
		String sqlString="insert into employee values(?,?,?)";
		int count=jdbcTemplate.update(sqlString, 1,"Aman","Dixit");
		System.out.println(count);
		
		
	}

}
