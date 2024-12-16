package ar.edu.unlp.info.oo1.Parcial_SegundaFecha;

public class Guerrero extends Rol{
	
	public Guerrero() {}
	
	public double calcularValorBase() {
		return this.personaje.getFuerza()*2 + this.personaje.getNivel() + this.personaje.getInteligencia();
	}
	
	public void incrementarHabilidad() {
		int aumento = this.personaje.getNivel() / 6;
		this.personaje.aumentarFuerza(aumento); 
	}
}
