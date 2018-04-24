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
import com.youtube.demo1.model.Catalogo;
import com.youtube.demo1.service.CatalogoServiceImpl;
import com.youtube.demo1.util.RestResponse;

@RestController
public class CatalogoController {
	
	@Autowired
	protected CatalogoServiceImpl catalogoServiceImpl;
	
	protected ObjectMapper mapper;
	
	@RequestMapping(value="/saveCatalogo", method= RequestMethod.POST , consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public RestResponse saveCatalogo (Catalogo catalogo) 
			throws JsonParseException, JsonMappingException, IOException{
		
		this.mapper=new ObjectMapper();
	
		if(!this.validate(catalogo)) {

			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),
					"Los campos obligatorios no están diligenciados");
		}
		this.catalogoServiceImpl.save(catalogo);
		return new RestResponse(HttpStatus.OK.value(), "haz guardado tu catalogo");
		
		
	}
	
	@RequestMapping(value="/deleteCatalogos", method= RequestMethod.POST,consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public RestResponse deleteCatalogo(Catalogo catalogo)throws Exception{
		
		this.mapper=new ObjectMapper();
		
		if(catalogo.getId()==0) {
			
			throw new Exception("Id vacío");
		}
		Catalogo catalogo1=this.catalogoServiceImpl.findById(catalogo.getId());
		
		this.catalogoServiceImpl.deleteCatalogo(catalogo1);
		return new RestResponse(HttpStatus.OK.value(),"Catalogo eliminado");
	}

	private boolean validate(Catalogo catalogo) {
		// TODO Auto-generated method stub
		boolean isValid = true;
		
		if (catalogo.getId() == 0) {
			isValid = false;	
		}
		if (catalogo.getNombre() == "" || catalogo.getNombre() == null) {
			isValid = false;
		}
		if (catalogo.getCampaña() == 0) {
			isValid = false;
		}
		
		
		return isValid;
	}
	
	
}
