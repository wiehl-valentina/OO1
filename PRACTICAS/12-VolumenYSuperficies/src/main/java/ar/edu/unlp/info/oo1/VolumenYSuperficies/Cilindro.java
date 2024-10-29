package ar.edu.unlp.info.oo1.VolumenYSuperficies;


public class Cilindro extends Pieza{
	private int radio;
	private int altura; 
	
	// CONSTRUCTOR
	
	public Cilindro(int radio, int altura, String material, String color) {
		super(material, color);
		this.radio = radio;
		this.altura = altura; 
	}
	
	//MÉTODOS
	
	public int getRadio() {
		return this.radio; 
	}
	
	public int getAltura() {
		return this.altura; 
	}
	
	public double getVolumen() {
		return Math.PI*Math.pow(radio, 2)*altura; 
	}
	
	public double getSuperficie() {
		return 2*Math.PI*radio*altura+2*Math.PI*Math.pow(radio, 2);
	}
}
