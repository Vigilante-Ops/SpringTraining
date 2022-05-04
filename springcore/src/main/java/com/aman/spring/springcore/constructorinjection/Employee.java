package com.aman.spring.springcore.constructorinjection;

public class Employee {

	private int id;
	private Address address;
	
	public Employee(int id,Address address) {
		this.id=id;
		this.address=address;
		
	}

	public int getId() {
		return id;
	}

	public Address getAddress() {
		return address;
	}

}
