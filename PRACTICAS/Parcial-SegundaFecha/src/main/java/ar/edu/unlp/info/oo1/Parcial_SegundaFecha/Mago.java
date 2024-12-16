package ar.edu.unlp.info.oo1.Parcial_SegundaFecha;

public class Mago implements Rol{
	public Mago() {}
	
	public double calcularValorBase(Personaje per) {
		return (per.getInteligencia() + per.getNivel())*2;
	}
	
	public void incrementarHabilidad(Personaje per) {
		int aumento = 3/2*per.getNivel();
		per.aumentarInteligencia(aumento);
	}
}
