package ar.edu.info.unlp.Presupuestos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Presupuesto {
	private LocalDate fecha; 
	private String cliente; 
	private ArrayList<Item> items; 
	
	// CONSTRUCTOR 
	
	public Presupuesto(String cliente) {
		this.cliente = cliente; 
		items = new ArrayList<Item>();
		fecha = LocalDate.now();
	}
	
	// MÉTODOS
	
	public void agregarItem(Item item) {
		items.add(item);
	}
	
	public double calcularTotal() {
		double total = 0; 
		for (Item item : items) {
			total += item.costo(); 
		}
		return total; 
	}
	
	public String getCliente() {
		return cliente; 
	}
	
	public LocalDate getFecha() {
		return fecha; 
	}
}
