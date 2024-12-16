package ar.edu.unlp.info.oo1.Parcial_SegundaFecha;

public class Guerrero implements Rol{
	
	public Guerrero() {}
	
	public double calcularValorBase(Personaje per) {
		return per.getFuerza()*2 + per.getNivel() + per.getInteligencia();
	}
	
	public void incrementarHabilidad(Personaje per) {
		int aumento = per.getNivel() / 6;
		per.aumentarFuerza(aumento); 
	}
}
