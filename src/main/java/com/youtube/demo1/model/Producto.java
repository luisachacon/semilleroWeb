package com.youtube.demo1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")

public class Producto {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="precio_Unidad")
	private float precio_Unidad;
	@Column(name="descuento_Unidad")
	private float descuentoUnidad;
	
	
	public Producto() {
	}


	public Producto(int id, String nombre, float precio_Unidad, float descuentoUnidad) {
	
		this.id = id;
		this.nombre = nombre;
		this.precio_Unidad = precio_Unidad;
		this.descuentoUnidad = descuentoUnidad;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float getPrecio_Unidad() {
		return precio_Unidad;
	}


	public void setPrecio_Unidad(float precio_Unidad) {
		this.precio_Unidad = precio_Unidad;
	}


	public float getDescuentoUnidad() {
		return descuentoUnidad;
	}


	public void setDescuentoUnidad(float descuentoUnidad) {
		this.descuentoUnidad = descuentoUnidad;
	}
	
	



}
