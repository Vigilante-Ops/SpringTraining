package com.aman.spring.springcore.lc.xmlconfig;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("setter called");
		this.id = id;
	}
	
	public void hi()
	{
		System.out.println("hi method");
	}
	public void bye()
	{
		System.out.println("hi bye");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
}
