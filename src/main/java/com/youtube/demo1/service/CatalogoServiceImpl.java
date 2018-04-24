package com.youtube.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube.demo1.dao.CatalogoRepository;
import com.youtube.demo1.model.Catalogo;

@Service
public class CatalogoServiceImpl implements CatalogoService{
	@Autowired
	protected CatalogoRepository catalogoRepository;
	
	public Catalogo save(Catalogo catalogo) {
		// TODO Auto-generated method stub
		System.out.println(catalogo.getNombre());
		return this.catalogoRepository.save(catalogo);
	}

	public Catalogo findById(int id) {
		// TODO Auto-generated method stub
		return this.catalogoRepository.findById(id);
	}

	@Override
	public void deleteCatalogo(Catalogo catalogo) {
		// TODO Auto-generated method stub
		catalogoRepository.delete(catalogo);
		
	}

	





	
	
}
