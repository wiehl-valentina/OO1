package ar.edu.unlp.info.oo1._MercadoDeObjetos;

public class ExpressADomicilio implements Envio{
	private double distancia1;
	private double distancia2; 
	
	public ExpressADomicilio(double distancia1, double distancia2) {
		this.distancia1 = distancia1;
		this.distancia2 = distancia2; 
	}; 
	
	public double calcularCosto() {
		return CalculadoraDeDistancia.distanciaEntre(distancia1, distancia2)*0.5;
	}
}
