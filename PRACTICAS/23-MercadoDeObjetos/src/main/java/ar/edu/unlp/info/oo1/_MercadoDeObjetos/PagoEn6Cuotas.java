package ar.edu.unlp.info.oo1._MercadoDeObjetos;

public class PagoEn6Cuotas implements Pago{
	public double calcularCosto(double monto) {
		return monto+monto*0.20; 
	}
}
