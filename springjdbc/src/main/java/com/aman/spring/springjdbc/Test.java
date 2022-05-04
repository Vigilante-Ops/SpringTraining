package com.aman.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.aman.spring.springjdbc.employee.dao.EmployeeDAO;
import com.aman.spring.springjdbc.employee.dao.impl.EmployeeDAOImpl;
import com.aman.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {

		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/aman/spring/springjdbc/employee/test/config.xml");
		EmployeeDAO daoImpl=(EmployeeDAO) applicationContext.getBean("employeeDao");
		Employee employee = new Employee();
		employee.setFirstName("lol");
		employee.setId(99);
		employee.setSecondName("lol");
		System.out.println(daoImpl.read());
		
	}

}
