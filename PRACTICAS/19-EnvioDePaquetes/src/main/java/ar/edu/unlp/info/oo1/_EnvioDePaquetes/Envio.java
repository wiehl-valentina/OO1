package ar.edu.unlp.info.oo1._EnvioDePaquetes;
import java.time.LocalDate;

public abstract class Envio {
	private LocalDate fechaDespacho;
	private String direccionOrigen;
	private String direccionDestino;
	private double pesoEnGramos; 
	
	public Envio(LocalDate fechaDespacho, String dirOrigen, String dirDestino, double pesoEnGramos) {
		this.fechaDespacho = fechaDespacho;
		this.direccionOrigen = dirOrigen;
		this.direccionDestino = dirDestino;
		this.pesoEnGramos = pesoEnGramos;
	}
	
	
	
	public LocalDate getFechaDespacho() {
		return fechaDespacho;
	}



	public String getDireccionOrigen() {
		return direccionOrigen;
	}



	public String getDireccionDestino() {
		return direccionDestino;
	}



	public double getPesoEnGramos() {
		return pesoEnGramos;
	}

	
	public abstract double calcularMontoTotal();
}
