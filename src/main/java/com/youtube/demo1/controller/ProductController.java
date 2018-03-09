package com.youtube.demo1.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.youtube.demo1.model.Usuario;
import com.youtube.demo1.service.UserService;
import com.youtube.demo1.util.RestResponse;

@RestController
public class ProductController {
	
	@Autowired
	
	protected ObjectMapper mapper;
	
	
	

}
