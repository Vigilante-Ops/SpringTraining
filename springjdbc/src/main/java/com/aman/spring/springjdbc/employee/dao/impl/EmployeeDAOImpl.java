package com.aman.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.aman.spring.springjdbc.employee.dao.EmployeeDAO;
import com.aman.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.aman.spring.springjdbc.employee.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Employee employee) {
		// TODO Auto-generated method stub
		String sqlString = "insert into employee values(?,?,?)";
		int updateCount = jdbcTemplate.update(sqlString, employee.getId(), employee.getFirstName(),
				employee.getSecondName());
		return updateCount;
	}

	@Override
	public int updateEmployee(Employee employee, int id) {
		// TODO Auto-generated method stub
		String sqlString = "update employee set firstname=?,lastname=?,id=? where id=" + id;
		int updateCount = jdbcTemplate.update(sqlString, employee.getFirstName(), employee.getSecondName(),
				employee.getId());
		return updateCount;
	}

	@Override
	public int deleteEmployee(int id) {

		String sqString = "delete from  employee where id=" + id;
		return jdbcTemplate.update(sqString);
	}

	@Override
	public Employee read(int id) {
		String sqlString="select  * from employee where id=?";
		EmployeeRowMapper rowMapper=new EmployeeRowMapper();
		Employee employee=jdbcTemplate.queryForObject(sqlString,rowMapper,id);
		return employee;
	}

	@Override
	public List<Employee> read() {
		String sqlString="select  * from employee";
		EmployeeRowMapper rowMapper=new EmployeeRowMapper();
		List<Employee> result = jdbcTemplate.query(sqlString, rowMapper);
		return result;
	}

}
