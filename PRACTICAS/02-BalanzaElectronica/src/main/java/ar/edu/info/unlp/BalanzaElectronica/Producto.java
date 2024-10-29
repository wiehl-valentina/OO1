package ar.edu.info.unlp.BalanzaElectronica;

public class Producto {
	private double peso; 
	private double precioPorKilo; 
	private String descripcion; 
	
	// CONSTRUCTOR 
	
	public Producto() {}
	
	public Producto(double peso, double precioPorKilo, String descripcion) {
		this.peso = peso;
		this.precioPorKilo = precioPorKilo; 
		this.descripcion = descripcion; 
	}
	
	// METODOS
	
	public double getPrecio() {
		return this.peso*this.precioPorKilo/1000;
	}
	
	public double getPrecioPorKilo() {
		return precioPorKilo; 
	}
	
	public void setPrecioPorKilo(double precio) {
		precioPorKilo = precio;
	}
	
	public double getPeso() {
		return peso; 
	}
	
	public void setPeso(double peso) {
		this.peso = peso; 
	}
	
	public String getDescripcion() {
		return descripcion; 
	}
	
	public void setDescripcion(String desc) {
		descripcion = desc; 
	}
}
