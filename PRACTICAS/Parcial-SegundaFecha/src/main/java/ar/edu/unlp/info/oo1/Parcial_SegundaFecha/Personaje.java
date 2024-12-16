package ar.edu.unlp.info.oo1.Parcial_SegundaFecha;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Personaje {
	private String nombre;
	private int nivel; 
	private int inteligencia; 
	private int fuerza; 
	private Rol rol; 
	
	public Personaje(String nombre, int nivel, int inteligencia, int fuerza, Rol rol) {
		this.nombre = nombre; 
		this.nivel = nivel; 
		this.inteligencia = inteligencia; 
		this.fuerza = fuerza; 
		this.rol = rol; 
	}
	
	public String getNombre() {
		return nombre; 
	}
		
	public int getNivel() {
		return nivel;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public int getFuerza() {
		return fuerza;
	}
	
	public Rol getRol() {
		return rol; 
	}
	
	public void cambiarRol(Rol rol) {
		this.rol = rol;
	}
	
	public abstract void subirNivel();
	public abstract double calcularPoder(int hora);
	protected abstract double calcularIncremento(int hora);
	
	public void aumentarInteligencia(double aumento) {
		this.inteligencia += aumento; 
	}
	
	public void aumentarFuerza(double aumento) {
		this.fuerza += aumento; 
	}
	
	public void incrementarNivel() {
		this.nivel += 1; 
	}
	
	public void enfrentarOponente(Personaje oponente, int hora) {
		if (this.calcularPoder(hora) > oponente.calcularPoder(hora))
			this.subirNivel(); 
		else if (this.calcularPoder(hora) < oponente.calcularPoder(hora))
			oponente.subirNivel(); 
		else {
			this.subirNivel();
			oponente.subirNivel();
		}
	}
	
	public List<Personaje> buscarOponentes(List<Personaje> oponentes) {
		return oponentes.stream()
				.filter(oponente -> (oponente.getNivel() == this.getNivel() && oponente.calcularPoder(12) < 5) || Math.abs(oponente.getNivel() - this.getNivel()) <= 2)
				.collect(Collectors.toList());
	}
	
}
