package com.aman.spring.springjdbc.employee.dao;

import java.util.List;

import com.aman.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDAO {

	int create(Employee employee);
	int updateEmployee(Employee employee,int id);
	int deleteEmployee(int id);
	Employee read(int id);
	List<Employee> read();
}
