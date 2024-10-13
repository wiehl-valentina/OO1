package ar.edu.info.unlp.Presupuestos;

public class Item {
	private String detalle; 
	private int cantidad;
	private double costoUnitario; 
	
	// CONSTRUCTOR 
	
	public Item (String detalle, int cantidad, double costoUnitario) {
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario; 
	}
	
	// MÉTODOS 
	
	public double costo() {
		return costoUnitario*cantidad; 
	}
	
	public double getCostoUnitario() {
		return costoUnitario; 
	}
}
