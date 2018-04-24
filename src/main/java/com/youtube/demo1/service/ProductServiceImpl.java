package com.youtube.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube.demo1.dao.ProductRepository;
import com.youtube.demo1.model.Producto;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	protected ProductRepository productRepository;
	
	public Producto save(Producto product) {
		
		return this.productRepository.save(product);
		// TODO Auto-generated method stub
		
	}

	public Producto findById(int id) {
		// TODO Auto-generated method stub
		return this.productRepository.findById(id);
	}

	public void deleteProduct(Producto product1) {
		// TODO Auto-generated method stub
		this.productRepository.delete(product1);
	}


}
