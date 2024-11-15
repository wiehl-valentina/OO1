package ar.edu.unlp.info.oo1._MercadoDeObjetos;

public class Producto {
	private String nombre;
	private String categoria;
	private double precio;
	private int unidadesDisponibles; 
	
	// CONSTRUCTOR
	public Producto(String nombre, String categoria, double precio, int unidades) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio; 
		this.unidadesDisponibles = unidades; 
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public double getPrecio() {
		return this.precio;
	}

	public int getUnidadesDisponibles() {
		return this.unidadesDisponibles;
	}	
	
	public void actualizarStock(int cantidad) {
		if (this.unidadesDisponibles == 0) // solo se repone cuando el stock llega a 0
			this.unidadesDisponibles+= cantidad; 
		else
			this.unidadesDisponibles-= cantidad; 
	}
}
