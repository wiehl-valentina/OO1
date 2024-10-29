package ar.edu.info.unlp.BalanzaMejorada;

import java.time.LocalDate;
import java.util.ArrayList; 

public class Ticket {
	private LocalDate fecha; 
	private ArrayList<Producto> productos; 
	
	// CONSTRUCTOR 
	
	public Ticket(ArrayList<Producto> productos) {
		fecha = LocalDate.now(); 
		this.productos = productos; 
	}
	
	// MÉTODOS 
	
	public double impuesto() {
		double total = this.getPrecioTotal();
		return total*0.21; 
	}
	
	public int getCantidadDeProductos() {
		return productos.size(); 
	}
	
	public double getPesoTotal() {
		double pesoTotal = 0; 
		for (Producto producto : productos) {
			pesoTotal += producto.getPeso(); 
		}
		return pesoTotal; 
	}
	
	public double getPrecioTotal() {
		double precioTotal = 0; 
		for (Producto producto : productos) {
			precioTotal += producto.getPrecio();
		}
		return precioTotal; 
	}
	
	public LocalDate getFecha() {
		return fecha; 
	}
	
	public ArrayList<Producto> getProductos() {
		return productos; 
	}
}
