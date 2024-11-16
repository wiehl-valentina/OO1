package ar.edu.unlp.info.oo1._MercadoDeObjetos;

public abstract class Usuario {
	private String nombre;
	private String direccion;
	 
	
	// CONSTRUCTOR
	public Usuario(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}
}
