package ar.edu.info.unlp.FigurasYCuerpos;

public class Circulo implements Figura{
	private double radio; 
	private double diametro; 
	
	// CONSTRUCTOR 
	
	
	// METODOS 
	
	public double getRadio() {
		return radio; 
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getDiametro() {
		return radio*2; 
	}
	
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	
	public double getArea() {
		double area = Math.pow(radio, 2)*Math.PI;
		return area; 
	}
	
	public double getPerimetro() {
		double perimetro = Math.PI*this.getDiametro(); 
		return perimetro; 
	}
}
