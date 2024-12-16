package ar.edu.unlp.info.oo1.Parcial_SegundaFecha;

public class Humano extends Personaje{
	
	public Humano(String nombre, Rol rol) {
		super(nombre, 1, 2, 1, rol);
	}
	
	protected double calcularIncremento(int hora) {
		if (hora >= 8 && hora < 20)
			return 0.40; 
		else
			return 0;
	}
	
	public double calcularPoder(int hora) {
		double poder = this.getRol().calcularValorBase();
		return poder += poder*this.calcularIncremento(hora);
	}
	
	public void subirNivel() {
		this.incrementarNivel();
		if (this.getNivel() >= 7)
			this.getRol().incrementarHabilidad(); 
	}
}
