package com.youtube.demo1.model;

public class Pedido {

	private int id;
	private int idSaldo;
	private int idProducto;
	private int cantidadProducto;
	private int precioUnidad;
	private int precioTotal;
	private int porcentajeUnidad;
	private int porcentajeTotal;
	
	
	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdSaldo() {
		return idSaldo;
	}
	public void setIdSaldo(int idSaldo) {
		this.idSaldo = idSaldo;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public int getCantidadProducto() {
		return cantidadProducto;
	}
	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	public int getPrecioUnidad() {
		return precioUnidad;
	}
	public void setPrecioUnidad(int precioUnidad) {
		this.precioUnidad = precioUnidad;
	}
	public int getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(int precioTotal) {
		this.precioTotal = precioTotal;
	}
	public int getPorcentajeUnidad() {
		return porcentajeUnidad;
	}
	public void setPorcentajeUnidad(int porcentajeUnidad) {
		this.porcentajeUnidad = porcentajeUnidad;
	}
	public int getPorcentajeTotal() {
		return porcentajeTotal;
	}
	public void setPorcentajeTotal(int porcentajeTotal) {
		this.porcentajeTotal = porcentajeTotal;
	}
	
	
	
}
