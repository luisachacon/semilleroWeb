package com.youtube.demo1.model;

import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="catalogo")
@Access(AccessType.FIELD)

public class Catalogo {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	@Column(name="campaña")
	private int campaña;
	
	@OneToMany(mappedBy="catalogo")
	private List<Producto> productos;
	
	@ManyToMany
	private List<Usuario>usuarios;
	
	@OneToMany(mappedBy="catalogo")
	private List<Registro> registro;
	
	public Catalogo() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getCampaña() {
		return campaña;
	}
	public void setCampaña(int campaña) {
		this.campaña = campaña;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Registro> getRegistroSaldo() {
		return registro;
	}

	public void setRegistroSaldo(List<Registro> registro) {
		this.registro = registro;
	}

	
	
	
}
