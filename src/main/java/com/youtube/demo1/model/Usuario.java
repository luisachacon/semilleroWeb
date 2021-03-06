package com.youtube.demo1.model;

import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
@Access(AccessType.FIELD)

public class Usuario {
	
	/**
	 * 
	 */

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	@Column(name="direccion")
	private String direccion;
	@Column(name="telefono")
	private int telefono;
	@Column(name="rol")
	private String rol;
	
	
	@ManyToMany
	@JoinTable(name="usuariocatalogo",joinColumns={@JoinColumn(name="id_user")},inverseJoinColumns= {@JoinColumn(name="id_catalogo")})
	private List<Catalogo>catalogo;
	
	@OneToMany(mappedBy="usuario")
	private List<Registro>registro;
	
	public Usuario() {
		
	}
	
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
	public String getRol() {
		return rol;
	}
	public void setTelefono(String rol) {
		this.rol=rol;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
}
