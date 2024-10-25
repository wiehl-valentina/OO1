package ar.edu.unlp.info.oo1.ElInversor;
import java.util.ArrayList;

public class Inversor {
	private String nombre;
	private ArrayList<Inversion> inversiones;
	
	public Inversor() {}
	
	public Inversor(String nombre) {
		this.nombre = nombre;
	}
	
	// MÉTODOS
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double valorActual() {
		double total = 0;
		for (Inversion inversion : inversiones) {
			total+= inversion.calcularTotal();
		}
		return total;
	}
}
