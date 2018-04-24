package com.youtube.demo1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.youtube.demo1.model.Catalogo;

@Repository
public interface CatalogoRepository extends JpaRepository<Catalogo, Long>{

	@SuppressWarnings("unchecked")
	Catalogo save(Catalogo catalogo);

	Catalogo findById(int id);
	void delete(Catalogo catalogo);
}
