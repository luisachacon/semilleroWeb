package com.youtube.demo1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.youtube.demo1.model.Producto;

@Repository
public interface ProductRepository extends JpaRepository<Producto,Long>{

	@SuppressWarnings("unchecked")
	Producto save(Producto product);

	Producto findById(int id);

	void delete(Producto producto);
	
}
