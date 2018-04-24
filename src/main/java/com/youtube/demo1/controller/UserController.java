package com.youtube.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import com.youtube.demo1.model.Usuario;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.youtube.demo1.service.UserServicelmpl;
import com.youtube.demo1.util.RestResponse;

@RestController
public class UserController {

	@Autowired
	protected UserServicelmpl userServiceImpl;

	protected ObjectMapper mapper;

	@RequestMapping(value ="/saveOrUpdate",method=RequestMethod.POST, consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public RestResponse saveOrUpdate( Usuario  user)
			throws JsonParseException, JsonMappingException, IOException {

		this.mapper = new ObjectMapper();
		if (!this.validate(user)) {

			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),
					"Los campos obligatorios no están diligenciados");
		}
		this.userServiceImpl.save(user);
		return new RestResponse(HttpStatus.OK.value(), "Operación exitosa");
	}

	@RequestMapping(value = "/deleteUser", method = RequestMethod.POST, consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public RestResponse deleteUser(Usuario user) throws Exception {

		this.mapper = new ObjectMapper();
		if (user.getId() == 0) {

			throw new Exception("El id está vacío");
		}
		Usuario user1 = this.userServiceImpl.findById(user.getId());

		this.userServiceImpl.deleteUser(user1);
		return new RestResponse(HttpStatus.OK.value(),"eliminadoo chico :v");	
	}

	private boolean validate(Usuario user) {
		boolean isValid = true;
		
		if (user.getId() == 0) {
			isValid = false;	
		}
		if (user.getNombre() == "" || user.getNombre() == null) {
			isValid = false;
		}
		if (user.getTelefono() == 0) {
			isValid = false;
		}
		if (user.getDireccion() == "" || user.getDireccion() == null) {
			isValid = false;
		}
		if (user.getRol() == " " || user.getRol() == null) {
			isValid = false;
		}
		return isValid;
	}

	
}
