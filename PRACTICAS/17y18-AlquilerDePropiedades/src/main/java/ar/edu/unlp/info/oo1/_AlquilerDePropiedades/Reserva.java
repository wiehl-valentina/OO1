package ar.edu.unlp.info.oo1._AlquilerDePropiedades;

public class Reserva {
	private DateLapse periodo;
	private Propiedad propiedad; 
	private Usuario usuario; 
	
	public Reserva(DateLapse periodo, Propiedad propiedad, Usuario usuario) {
		this.periodo = periodo;  
		this.propiedad = propiedad;
		this.usuario = usuario; 
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
	
	public Propiedad getPropiedad() {
		return this.propiedad; 
	}
	
	public Usuario getUsuario() {
		return this.usuario; 
	}
}
