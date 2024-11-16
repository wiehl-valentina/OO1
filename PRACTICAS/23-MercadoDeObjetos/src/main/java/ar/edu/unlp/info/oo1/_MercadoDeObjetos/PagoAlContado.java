package ar.edu.unlp.info.oo1._MercadoDeObjetos;

public class PagoAlContado implements Pago{
	public PagoAlContado() {}; 
	
	public double calcularCosto(double monto) {
		return monto; 
	}
}
