package ar.edu.unlp.info.oo1._LiquidacionDeHaberes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContratoPorHora extends Contrato{
	private int valorPorHora; 
	private int horasMensuales; 
	
	// CONSTRUCTOR
	public ContratoPorHora(LocalDate fechaInicio, LocalDate fechaFin, Empleado empleado, int valorPorHora, int horasMensuales) {
		super(fechaInicio, fechaFin, empleado);
		this.valorPorHora = valorPorHora; 
		this.horasMensuales = horasMensuales; 
	}
	
	// METODOS
	public int calcularMonto() {
		return this.valorPorHora*this.horasMensuales; 
	}
	
	public int calcularDuracionEnDias() {
		return (int)ChronoUnit.DAYS.between(this.getFechaDeInicio(), this.getFechaDeFin());
	}
}
