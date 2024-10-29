package ar.edu.unlp.info.oo1.VolumenYSuperficies;

public class Esfera extends Pieza{
	private int radio; 
	
	// CONSTRUCTOR
	public Esfera(String material, String color, int radio) {
		super(material,color);
		this.radio = radio; 
	}
	
	//MÉTODOS
	
	public int getRadio() {
		return this.radio; 
	}
	
	public double getVolumen() {
		return ((double)4/3)*Math.PI*Math.pow(this.radio, 3);
	}
	
	public double getSuperficie() {
		return 4*Math.PI*Math.pow(this.radio, 2);
	}
}
