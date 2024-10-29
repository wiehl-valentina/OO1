package ar.edu.info.unlp.FigurasYCuerpos;

public class Cuadrado implements Figura{
	private double lado; 
	
	// CONSTRUCTOR 
	
	// MÉTODOS 
	
	public double getLado() {
		return lado; 
	}
	
	public void setLado(double lado) {
		this.lado = lado; 
	}
	
	public double getPerimetro() {
		return lado*4; 
	}
	
	public double getArea() {
		return lado*lado; 
	}
}
