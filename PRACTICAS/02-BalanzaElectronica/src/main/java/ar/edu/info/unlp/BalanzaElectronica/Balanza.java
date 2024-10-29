package ar.edu.info.unlp.BalanzaElectronica;

public class Balanza {
	private int cantidadDeProductos; 
	private double precioTotal; 
	private double pesoTotal; 

	// CONSTRUCTOR 
	
	public Balanza() {
		cantidadDeProductos = 0; 
		precioTotal = 0; 
		pesoTotal = 0; 
	}
	
	// METODOS 
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos; 
	}
	
	public double getPesoTotal() {
		return pesoTotal; 
	}
	
	public double getPrecioTotal() {
		return precioTotal; 
	}
	
	public void ponerEnCero() {
		cantidadDeProductos = 0; 
		precioTotal = 0; 
		pesoTotal = 0; 
	}
	
	public void agregarProducto(Producto producto) {
		pesoTotal += producto.getPeso();
		precioTotal += producto.getPrecio();
		cantidadDeProductos++;
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(cantidadDeProductos, pesoTotal, precioTotal);
		ticket.impuesto();
		return ticket; 
	}

}

