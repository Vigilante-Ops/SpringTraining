package com.aman.spring.springcore.autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	@Autowired
	private Address address;
	
	

	public Address getAddress() {
		return address;
	}

}
