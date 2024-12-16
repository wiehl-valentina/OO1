package ar.edu.unlp.info.oo1.Parcial_SegundaFecha;

public class Orco extends Personaje{
	
	public Orco(String nombre, Rol rol) {
		super(nombre, 1, 1, 2, rol);
	}
	
	protected double calcularIncremento(int hora) {
		if ((hora >= 20 && hora <= 23) || (hora >= 0 && hora < 8))
			return 0.60; 
		else 
			return 0; 
	}
	
	public double calcularPoder(int hora) {
		double poder = this.getRol().calcularValorBase();
		return poder += poder*this.calcularIncremento(hora);
	}
	
	public void subirNivel() {
		this.incrementarNivel();
		if (this.getNivel() % 3 == 0)
			this.getRol().incrementarHabilidad();
	}
}
