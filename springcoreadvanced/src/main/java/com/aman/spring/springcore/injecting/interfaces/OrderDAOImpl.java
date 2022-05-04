package com.aman.spring.springcore.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		// TODO Auto-generated method stub

		System.out.println("createorder");
	}

}
