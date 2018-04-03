package com.youtube.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube.demo1.dao.ProductRepository;
import com.youtube.demo1.model.Producto;

@Service
public class ProductServiceImpl  implements ProductService{
	
	@Autowired
	protected ProductRepository productRepository;

	public Producto add(Producto product) {
		
		System.out.println(product.getNombre());
		return this.productRepository.add(product);
		}

	public void deleteProduct(Producto product) {
		productRepository.delete(product);
		// TODO Auto-generated method stub
		
	}

	public Producto findById(int id) {
		// TODO Auto-generated method stub
		return this.productRepository.findById(id);
	}

	
	
}
