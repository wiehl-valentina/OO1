package ar.edu.info.unlp.FigurasYCuerpos;

public class Cuerpo3D {
	private Figura caraBasal; 
	private double altura; 
	
	// METODOS 
	
	public double getAltura() {
		return altura; 
	}

	public void setAltura(double altura) {
		this.altura = altura; 
	}
	
	public void setCaraBasal(Figura cara) {
		caraBasal = cara; 
	}
	
	public double getVolumen() {
		return caraBasal.getArea()*altura; 
	}
	
	public double getSuperficieExterior() {
		return 2*caraBasal.getArea()+caraBasal.getPerimetro()*altura;
	}
}
