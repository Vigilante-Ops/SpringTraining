package com.aman.spring.springorm.product.dao.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.aman.spring.springorm.product.dao.ProductDao;
import com.aman.spring.springorm.product.entity.Product;

@Component("productDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int create(Product product) {
		int save = (int) hibernateTemplate.save(product);
		return save;
	}

	@Override
	@Transactional
	public void update(Product product) 
	{
		hibernateTemplate.update(product);
 
	}

	@Override
	@Transactional
	public void delete(Product product) {

		hibernateTemplate.delete(product);
	}

	@Override
	@Transactional
	public Product find(int productId) {
		Product product= hibernateTemplate.get(Product.class, productId);
		return product;
	}

	@Override
	@Transactional
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Product.class);
	}

}
