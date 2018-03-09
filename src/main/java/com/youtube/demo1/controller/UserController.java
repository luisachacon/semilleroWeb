package com.youtube.demo1.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import com.youtube.demo1.model.Usuario;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.youtube.demo1.service.UserService;
import com.youtube.demo1.service.UserServicelmpl;
import com.youtube.demo1.util.RestResponse;

import antlr.StringUtils;

@RestController
public class UserController {
	
	@Autowired
	protected UserServicelmpl userServiceImpl;
	
	
	protected ObjectMapper mapper;
	
	@RequestMapping(value="/saveOrUpdate",method=RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String userJson) throws JsonParseException, JsonMappingException, IOException {
	
		this.mapper=new ObjectMapper();
		
		Usuario user=this.mapper.readValue(userJson, Usuario.class);
		System.out.println("entidad" + userJson);
		
		if(!this.validate(user)) {
			
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), "Los campos obligatorios no están diligenciados");
			
		}
	
		this.userServiceImpl.save(user);
		return new RestResponse(HttpStatus.OK.value(),"Operación exitosa");
		
	}
	
	@RequestMapping(value="/deleteUser",method=RequestMethod.POST)
	public void deleteUser(@RequestBody String userJson) throws Exception {
		
		this.mapper=new ObjectMapper();
		
		Usuario user=this.mapper.readValue(userJson, Usuario.class);
		if(user.getId()==0) {
			
			throw new Exception("El id está vacío");
		}
		Usuario user1 = this.userServiceImpl.findById(user.getId()); 
		
		this.userServiceImpl.deleteUser(user1);
		System.out.println("entra");
	}
	
	
	private boolean validate(Usuario user) {
		boolean isValid=true;
		
		if(user.getNombre()==""||user.getNombre()==null) {
			
			isValid=false;
		}
		if(user.getTelefono()==0) {
			
			isValid=false;
		}
		if(user.getDireccion()==""||user.getDireccion()==null) {
			
			isValid=false;
		}
		if(user.getRol()==" "||user.getRol()==null) {
			isValid=false;
		}
		return isValid;
	}

}
