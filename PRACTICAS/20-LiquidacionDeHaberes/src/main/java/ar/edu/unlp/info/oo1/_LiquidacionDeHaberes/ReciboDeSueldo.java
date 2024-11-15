package ar.edu.unlp.info.oo1._LiquidacionDeHaberes;

import java.time.LocalDate;

public class ReciboDeSueldo {
	private String nombre;
	private String apellido;
	private int CUIL;
	private int antiguedad;
	private LocalDate fechaDeEmision; 
	private double montoAPagar;
	
	// CONSTRUCTOR
	public ReciboDeSueldo(Empleado empleado) {
		this.nombre = empleado.getNombre();
		this.apellido = empleado.getApellido();
		this.CUIL = empleado.getCUIL();
		this.antiguedad = empleado.calcularAntiguedadEnAños();
		this.fechaDeEmision = LocalDate.now();
		this.montoAPagar = empleado.calcularSueldo(); 	
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public int getCUIL() {
		return this.CUIL;
	}

	public int getAntiguedad() {
		return this.antiguedad;
	}

	public LocalDate getFechaDeEmision() {
		return this.fechaDeEmision;
	}

	public double getMontoAPagar() {
		return this.montoAPagar;
	}
}
