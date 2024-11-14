package ar.edu.unlp.info.oo1._AlquilerDePropiedades;

public class Reserva {
	private DateLapse periodo;
	
	public Reserva(DateLapse periodo) {
		this.periodo = periodo;  
	}
	
	public DateLapse getPeriodo() {
		return this.periodo; 
	}
	
	public boolean overlaps(DateLapse periodo) {
		return this.periodo.overlaps(periodo);
	}
	
	public boolean inicioPosteriorAFechaActual() {
		return this.periodo.laterFrom();
	}
}
