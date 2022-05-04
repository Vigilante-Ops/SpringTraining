package com.aman.spring.springcore.annotations.xmlconfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Patient{

	public Patient() {
		System.out.println("constructor");
	}
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("setter called");
		this.id = id;
	}
	@PostConstruct
	public void hi()
	{
		System.out.println("hi");
	}
	@PreDestroy
	public void bye()
	{
		System.out.println("bye");
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}


}
