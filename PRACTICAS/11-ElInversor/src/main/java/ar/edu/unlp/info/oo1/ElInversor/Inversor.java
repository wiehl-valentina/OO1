package ar.edu.unlp.info.oo1.ElInversor;
import java.util.ArrayList;

public class Inversor {
	private String nombre;
	private ArrayList<Inversion> inversiones;
	
	public Inversor() {
		this.inversiones = new ArrayList<Inversion>(); 
	}
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList<Inversion>();
	}
	
	// MÉTODOS
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarInversion(Inversion inversion) {
		inversiones.add(inversion);
	}
	
	public ArrayList<Inversion> getInversiones() {
		return this.inversiones; 
	}
	
	public double valorActual() {
		return this.inversiones.stream().mapToDouble(inversion -> inversion.calcularTotal()).sum();
	}
}
