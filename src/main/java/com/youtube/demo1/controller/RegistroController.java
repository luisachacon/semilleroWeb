package com.youtube.demo1.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.youtube.demo1.model.Registro;
import com.youtube.demo1.service.RegistroServiceImp;
import com.youtube.demo1.util.RestResponse;

@RestController
public class RegistroController {
	
	@Autowired
	protected RegistroServiceImp registroServiceImpl;
	
	protected ObjectMapper mapper;
	
	@RequestMapping(value="/saveRegistro",method=RequestMethod.POST, consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public RestResponse saveRegistro(Registro registro)
			throws JsonParseException,JsonMappingException, IOException{
		
		this.mapper=new ObjectMapper();
	
		if(!this.validate(registro)) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),
					"llena todos los datos");
		}
		this.registroServiceImpl.save(registro);
		return new RestResponse(HttpStatus.OK.value(), "operación exitosa");
	}

	private boolean validate(Registro registro) {
		boolean esValido=true;
		// TODO Auto-generated method stub
		
		if (registro.getId()==0) {
			esValido=false;
		}
		if(registro.getIdCatalogo()==0) {
			esValido=false;
		}
		if(registro.getIdUsuario()==0) {
			esValido=false;
		}
		if(registro.getPrecioAbonar()==0) {
			esValido=false;
		}
		return esValido;
	}

}
