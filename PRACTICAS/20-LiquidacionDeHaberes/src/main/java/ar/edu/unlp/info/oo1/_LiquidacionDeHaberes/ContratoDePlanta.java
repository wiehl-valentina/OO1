package ar.edu.unlp.info.oo1._LiquidacionDeHaberes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContratoDePlanta extends Contrato{
	private int sueldoMensual;
	private int montoPorConyuge;
	private int montoPorHijos;
	
	// CONSTRUCTOR
	public ContratoDePlanta(LocalDate fechaInicio, Empleado empleado, int sueldo, int montoPorConyuge, int montoPorHijos) {
		super(fechaInicio, null, empleado);
		this.sueldoMensual = sueldo; 
		this.montoPorConyuge = montoPorConyuge;
		this.montoPorHijos = montoPorHijos; 
	}
	
	public int calcularMonto() {
		if (this.getEmpleado().tieneHijos() && this.getEmpleado().tieneConyuge())
			return this.sueldoMensual+this.montoPorConyuge+this.montoPorHijos;
		else if (this.getEmpleado().tieneHijos() && !this.getEmpleado().tieneConyuge())
			return this.sueldoMensual+this.montoPorHijos;
		else if (!this.getEmpleado().tieneHijos() && this.getEmpleado().tieneConyuge())
			return this.sueldoMensual+this.montoPorConyuge;
		else
			return this.sueldoMensual; 
	}
	
	public int calcularDuracionEnDias() {
		return (int)ChronoUnit.DAYS.between(this.getFechaDeInicio(), LocalDate.now());
	}
}
