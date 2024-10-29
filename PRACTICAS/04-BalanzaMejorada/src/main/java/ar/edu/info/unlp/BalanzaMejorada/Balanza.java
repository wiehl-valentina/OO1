package ar.edu.info.unlp.BalanzaMejorada;
import java.util.ArrayList;

public class Balanza {
	private ArrayList<Producto> productos; 

	// CONSTRUCTOR 
	
	public Balanza() {
		productos = new ArrayList<Producto>(); 
	}
	
	// METODOS 
	
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
	
	public void ponerEnCero() {
		productos.clear();  
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(productos);
		ticket.impuesto();
		return ticket; 
	}
}
