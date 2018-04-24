package com.youtube.demo1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.youtube.demo1.model.Registro;

@Repository
public interface RegistroRepository extends JpaRepository <Registro, Long> {
	
	@SuppressWarnings("unchecked")
	Registro save(Registro registro);

}
