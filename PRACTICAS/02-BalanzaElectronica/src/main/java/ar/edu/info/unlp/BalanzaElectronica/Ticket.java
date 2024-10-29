package ar.edu.info.unlp.BalanzaElectronica;

import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha; 
	private int cantidadDeProductos;
	private double pesoTotal; 
	private double precioTotal; 
	
	// CONSTRUCTOR 
	
	public Ticket(int cantidadDeProductos, double pesoTotal, double precioTotal) {
		fecha = LocalDate.now(); 
		this.cantidadDeProductos = cantidadDeProductos; 
		this.pesoTotal = pesoTotal; 
		this.precioTotal = precioTotal; 
	}
	
	// MÉTODOS 
	
	public double impuesto() {
		return precioTotal*21/100; 
	}
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos; 
	}
	
	public double getPesoTotal() {
		return pesoTotal; 
	}
	
	public double getPrecioTotal() {
		return precioTotal; 
	}
	
	public LocalDate getFecha() {
		return fecha; 
	}
 }
