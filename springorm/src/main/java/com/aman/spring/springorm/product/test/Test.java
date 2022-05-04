package com.aman.spring.springorm.product.test;

import java.io.ObjectInputFilter.Config;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aman.spring.springorm.product.dao.ProductDao;
import com.aman.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/aman/spring/springorm/product/test/config.xml");
		ProductDao bean = (ProductDao) applicationContext.getBean("productDao");
		//Product product=new Product();
		//product.setName("apple");product.setPrice(800);product.setDesc("bekaar");product.setId(2);
		List<Product> products=bean.findAll();
		for(int i=0;i<products.size();i++)
		{
			System.out.println(products.get(i).getName());
		}
		
		
	}

}
