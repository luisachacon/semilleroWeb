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
@Table(name="registro")
@Access(AccessType.FIELD)

public class Registro {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="id_catalogo")
	private int idCatalogo;
	@Column(name="id_usuario")
	private int idUsuario;
	@Column(name="Registro_abono")
	private double precioAbonar;
	
	
	@ManyToOne
	@JoinColumn(name="catalogo")
	private Catalogo catalogo;
	
	@ManyToOne
	@JoinColumn(name="usuario")
	private Usuario usuario;
	
	public Registro() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdCatalogo() {
		return idCatalogo;
	}
	public void setIdCatalogo(int idCatalogo) {
		this.idCatalogo = idCatalogo;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public double getPrecioAbonar() {
		return precioAbonar;
	}
	public void setPrecioAbonar(double precioAbonar) {
		this.precioAbonar = precioAbonar;
	}
	

}
