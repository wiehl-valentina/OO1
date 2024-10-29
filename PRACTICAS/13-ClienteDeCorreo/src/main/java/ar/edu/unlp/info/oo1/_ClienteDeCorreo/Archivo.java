package ar.edu.unlp.info.oo1._ClienteDeCorreo;

public class Archivo {
	private String nombre; 
	
	//CONSTRUCTOR
	public Archivo(String nombre) {
		this.nombre = nombre; 
	}
	
	//METODOS
	public int tamaño() {
		return this.nombre.length();
	}
	
	public String getNombre() {
		return this.nombre; 
	}
}
