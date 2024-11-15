package ar.edu.unlp.info.oo1._LiquidacionDeHaberes;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit; 

public abstract class Contrato {
	private LocalDate fechaDeInicio; 
	private LocalDate fechaDeFin;
	private Empleado empleado; 
	
	// CONSTRCUTOR
	public Contrato(LocalDate fechaInicio, LocalDate fechaFin, Empleado empleado) {
		this.fechaDeInicio = fechaInicio; 
		this.fechaDeFin = fechaFin; 
		this.empleado = empleado; 
	}

	public LocalDate getFechaDeInicio() {
		return this.fechaDeInicio;
	}

	public LocalDate getFechaDeFin() {
		return this.fechaDeFin;
	}
	
	public Empleado getEmpleado() {
		return this.empleado;
	}

	public abstract int calcularDuracionEnDias();
	public abstract int calcularMonto();
}
