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
import com.youtube.demo1.model.Producto;
import com.youtube.demo1.service.ProductServiceImpl;
import com.youtube.demo1.util.RestResponse;

@RestController
public class ProductController {
	
	@Autowired
	protected ProductServiceImpl productServiceImpl;
	
	protected ObjectMapper mapper;
	
	@RequestMapping(value="/saveProduct", method=RequestMethod.POST, consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public RestResponse saveProduct( Producto product)
	throws JsonParseException, JsonMappingException, IOException{
		
		this.mapper=new ObjectMapper();
		if(!this.validate(product)) {

			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),
					"Los campos obligatorios no están diligenciados");
		}
		this.productServiceImpl.save(product);
		return new RestResponse(HttpStatus.OK.value(), "Operación exitosa");
		
		
	}
	@RequestMapping(value = "/deleteProduct", method = RequestMethod.POST, consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public RestResponse deleteProduct(Producto producto) throws Exception {

		this.mapper = new ObjectMapper();

		if (producto.getId() == 0) {

			throw new Exception("El id está vacío");
		}
		Producto product1 = this.productServiceImpl.findById(producto.getId());

		this.productServiceImpl.deleteProduct(product1);
		return new RestResponse(HttpStatus.OK.value(),"Producto eliminado");
	}

	private boolean validate(Producto product) {
		// TODO Auto-generated method stub
		boolean isValid = true;
		
		if (product.getId() == 0) {
			isValid = false;	
		}
		if (product.getNombre() == "" || product.getNombre() == null) {
			isValid = false;
		}
		if (product.getPrecio_Unidad() == 0) {
			isValid = false;
		}
		if (product.getDescuento_Unidad()== 0) {
			isValid = false;
		}
		
		return isValid;
	}

}
