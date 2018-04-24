package com.youtube.demo1.service;

import com.youtube.demo1.model.Producto;

public interface ProductService {
	
	
	Producto save(Producto product);
	Producto findById(int id);
}
