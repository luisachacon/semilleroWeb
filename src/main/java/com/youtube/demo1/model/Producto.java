package com.youtube.demo1.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Producto")
@Access(AccessType.FIELD)
		
public class Producto {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	@Column(name="precio_Unidad")
	private double precio_Unidad;
	@Column(name="descuento_Unidad")
	private double descuento_Unidad;
	
	@ManyToOne
	@JoinColumn(name="id_catalogo")
	private Catalogo catalogo;
	
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Producto(int id, String nombre, double precio_Unidad, double descuento_Unidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio_Unidad = precio_Unidad;
		this.descuento_Unidad = descuento_Unidad;
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

	public double getPrecio_Unidad() {
		return precio_Unidad;
	}

	public void setPrecio_Unidad(double precio_Unidad) {
		this.precio_Unidad = precio_Unidad;
	}

	public double getDescuento_Unidad() {
		return descuento_Unidad;
	}

	public void setDescuento_Unidad(double descuento_Unidad) {
		this.descuento_Unidad = descuento_Unidad;

}

}