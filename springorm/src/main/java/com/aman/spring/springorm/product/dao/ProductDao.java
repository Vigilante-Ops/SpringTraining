package com.aman.spring.springorm.product.dao;

import java.util.List;

import com.aman.spring.springorm.product.entity.Product;

public interface ProductDao {

	int create(Product product);
	void update(Product product);
	void delete(Product product);
	Product find(int productId);
	List<Product> findAll();
}
