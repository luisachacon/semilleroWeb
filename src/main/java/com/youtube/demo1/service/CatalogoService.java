package com.youtube.demo1.service;

import com.youtube.demo1.model.Catalogo;

public interface CatalogoService {
	Catalogo save(Catalogo catalogo);
	Catalogo findById(int id);
	void deleteCatalogo(Catalogo id);

}
