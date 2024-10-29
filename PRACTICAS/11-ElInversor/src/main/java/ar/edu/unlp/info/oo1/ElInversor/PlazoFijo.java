package ar.edu.unlp.info.oo1.ElInversor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
	private LocalDate fechaDeConstitucion; 
	private double montoDepositado; 
	private double porcentajeDeInteresDiario;
	
	// CONSTRUCTORES
	public PlazoFijo() {
		this.fechaDeConstitucion = LocalDate.now();
	}
	
	public PlazoFijo(LocalDate fecha, double monto, double interes) {
		this.fechaDeConstitucion = fecha;
		this.montoDepositado = monto;
		this.porcentajeDeInteresDiario = interes; 
	}
	
	// MÉTODOS
	public void setPorcentajeDeInteresDiario(double porcentaje) {
		this.porcentajeDeInteresDiario = porcentaje; 
	}
	
	public double getPorcentajeDeInteresDiario() {
		return this.porcentajeDeInteresDiario; 
	}
	
	public void setMontoDepositado(double monto) {
		this.montoDepositado = monto; 
	}
	
	public double getMontoDepositado() {
		return this.montoDepositado; 
	}
	
	public LocalDate getFechaDeConstitucion() {
		return this.fechaDeConstitucion;
	}
	
	public double calcularTotal() {
		double total = this.montoDepositado;
		long diasTotales = ChronoUnit.DAYS.between(this.fechaDeConstitucion, LocalDate.now());
		for (int i = 0; i<diasTotales; i++) {
			total+= total*this.porcentajeDeInteresDiario/100; 
		}
		return total; 
	}
}
