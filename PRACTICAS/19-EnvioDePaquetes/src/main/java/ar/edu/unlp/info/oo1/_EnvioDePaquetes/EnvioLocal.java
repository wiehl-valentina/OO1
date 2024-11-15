package ar.edu.unlp.info.oo1._EnvioDePaquetes;

import java.time.LocalDate;

public class EnvioLocal extends Envio{
	private boolean entregaRapida; 
	
	// CONSTRUCTOR
	public EnvioLocal(LocalDate fechaDespacho, String dirOrigen, String dirDestino, double pesoEnGramos, boolean tipoEntrega) {
		super(fechaDespacho, dirOrigen, dirDestino, pesoEnGramos); 
		this.entregaRapida = tipoEntrega;
	}
	
	// METODOS
	public double calcularMontoTotal() {
		if (entregaRapida)
			return 1500;
		else
			return 1000; 
	}
}
