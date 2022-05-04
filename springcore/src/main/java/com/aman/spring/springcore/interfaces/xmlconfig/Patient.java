package com.aman.spring.springcore.interfaces.xmlconfig;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean{

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("setter called");
		this.id = id;
	}
	
	

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropetiesSet/init method");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method");
		
	}
}
