package ar.edu.unlp.info.oo1._EnvioDePaquetes;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio{
	private double distanciaEnKm;
	
	// CONSTRUCTOR
	public EnvioInterurbano(LocalDate fechaDespacho, String dirOrigen, String dirDestino, double pesoEnGramos, double km) {
		super(fechaDespacho, dirOrigen, dirDestino, pesoEnGramos);
		this.distanciaEnKm = km; 
	}
	
	// METODOS
	public double calcularMontoTotal() {
		if (this.distanciaEnKm < 100)
			return this.getPesoEnGramos()*20; 
		else if ((this.distanciaEnKm >= 100) && (this.distanciaEnKm <= 500))
			return this.getPesoEnGramos()*25; 
		else
			return this.getPesoEnGramos()*30; 
	}
}
