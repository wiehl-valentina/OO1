package ar.edu.unlp.info.oo1.Parcial_SegundaFecha;

public abstract class Rol {
	protected Personaje personaje; 

	public Personaje getPersonaje() {
		return personaje;
	}
	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}
	
	public abstract double calcularValorBase();
	public abstract void incrementarHabilidad();
}
