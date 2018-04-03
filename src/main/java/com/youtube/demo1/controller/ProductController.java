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
import com.youtube.demo1.model.Producto;
import com.youtube.demo1.service.ProductServiceImpl;
import com.youtube.demo1.util.RestResponse;

@RestController
public class ProductController {

	@Autowired
	protected ProductServiceImpl productServiceImpl;

	protected ObjectMapper mapper;

	@RequestMapping(value = "/addorUpdate", method = RequestMethod.POST)
	public RestResponse addOrUpdate(@RequestBody String productJson)
			throws JsonParseException, JsonMappingException, IOException {

		this.mapper = new ObjectMapper();

		Producto product = this.mapper.readValue(productJson, Producto.class);
		System.out.println("Entidad" + productJson);

		if (!this.validate(product)) {

			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), "Faltan datos");

		}
		this.productServiceImpl.add(product);
		return new RestResponse(HttpStatus.OK.value(), "Bien hecho!!");
	}

	@RequestMapping(value = "/deleteProduct", method = RequestMethod.POST)
	public void deleteUser(@RequestBody String productJson) throws Exception {

		this.mapper = new ObjectMapper();

		Producto product = this.mapper.readValue(productJson, Producto.class);
		if (product.getId() == 0) {

			throw new Exception("El id está vacío");
		}
		Producto product1 = this.productServiceImpl.findById(product.getId());

		this.productServiceImpl.deleteProduct(product1);
		System.out.println("entra");
	}

	private boolean validate(Producto product) {
		boolean validieren = true;

		if (product.getId() == 0) {
			validieren = false;
		}
		if (product.getNombre() == "" || product.getNombre() == null) {
			validieren = false;
		}
		if (product.getPrecio_Unidad() == 0) {
			validieren = false;
		}
		if (product.getDescuentoUnidad() == 0) {
			validieren = false;
		}
		return validieren;
	}

}
