package com.youtube.demo1.service;

import com.youtube.demo1.model.Producto;

public interface ProductService {

	/**
	 * 
	 * Guarda_un_producto_y_lo_actualiza_con_el_id
	 * 
	 * @param product
	 * @return
	 */
	Producto add(Producto product);

	/**
	 * Elimina_un_producto_con_el_id_recibido
	 * 
	 * @param id
	 */
	void deleteProduct(Producto id);

	Producto findById(int id);

}
