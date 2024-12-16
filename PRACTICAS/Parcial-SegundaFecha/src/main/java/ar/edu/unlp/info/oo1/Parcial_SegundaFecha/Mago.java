package ar.edu.unlp.info.oo1.Parcial_SegundaFecha;

public class Mago extends Rol{
	public Mago() {}
	
	public double calcularValorBase() {
		return (this.personaje.getInteligencia() + this.personaje.getNivel())*2;
	}
	
	public void incrementarHabilidad() {
		int aumento = 3/2*this.personaje.getNivel();
		this.personaje.aumentarInteligencia(aumento);
	}
}
