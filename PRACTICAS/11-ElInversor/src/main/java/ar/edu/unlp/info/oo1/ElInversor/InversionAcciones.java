package ar.edu.unlp.info.oo1.ElInversor;

public class InversionAcciones implements Inversion{
	private String nombre; 
	private int cantidad; 
	private double valorUnitario; 
	
	// CONSTRUCTOR
	
	public InversionAcciones(String nombre, int cantidad, double valor) {
		this.nombre = nombre; 
		this.cantidad = cantidad;
		this.valorUnitario = valor; 
	}
	
	// MÉTODOS
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setCantidad(int cant) {
		this.cantidad = cant; 
	}
	
	public int getCantidad() {
		return this.cantidad; 
	}
	
	public void setValorUnitario(double valor) {
		this.valorUnitario = valor; 
	}
	
	public double getValorUnitario() {
		return this.valorUnitario; 
	}
	
	public double calcularTotal() {
		return this.valorUnitario*this.cantidad;
	}
}
