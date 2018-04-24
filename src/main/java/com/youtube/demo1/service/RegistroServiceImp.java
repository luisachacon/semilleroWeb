package com.youtube.demo1.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.youtube.demo1.dao.RegistroRepository;
import com.youtube.demo1.model.Registro;

@Service
public class RegistroServiceImp implements RegistroService {
	
	@Autowired
	protected RegistroRepository registroRepository;

	public Registro save(Registro registro) {
		// TODO Auto-generated method stub
		return this.registroRepository.save(registro);
	}

}
