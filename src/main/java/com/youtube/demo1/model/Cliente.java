package com.youtube.demo1.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
@Access(AccessType.FIELD)

public class Cliente extends ParentEntity{
	
	@Column(name="nombre",nullable=true,length=30)
	private String nombre;
	@Column(name="direccion",nullable=true,length=150)
	private String direccion;
	@Column(name="telefono",nullable=true,length=25)
	private int telefono;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	
	
}
