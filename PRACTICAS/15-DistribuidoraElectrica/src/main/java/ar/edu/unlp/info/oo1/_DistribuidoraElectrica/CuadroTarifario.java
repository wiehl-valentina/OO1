package ar.edu.unlp.info.oo1._DistribuidoraElectrica;

public class CuadroTarifario {
	private double precio;
	
	public CuadroTarifario() {
		this.precio = 100; 
	}
	
	public double getPrecio() {
		return this.precio; 
	}
	
	public void setPrecio(double precio) {
		this.precio = precio; 
	}
}
