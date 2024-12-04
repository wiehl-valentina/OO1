package ar.edu.unlp.info.oo1._EnvioDePaquetes;

import java.time.LocalDate;

public class EnvioInternacional extends Envio{
	
	// CONSTRUCTOR
	public EnvioInternacional(LocalDate fechaDespacho, String dirOrigen, String dirDestino, int pesoEnGramos) {
		super(fechaDespacho, dirOrigen, dirDestino, pesoEnGramos); 
	}
	
	//METODOS
	public double calcularMontoTotal() {
		if (this.getPesoEnGramos() <= 1000)
			return this.getPesoEnGramos()*10+5000; 
		else
			return this.getPesoEnGramos()*12+5000; 
	}
}
