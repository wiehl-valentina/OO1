package ar.edu.unlp.info.oo1.CuentaConGanchos;

public class CajaDeAhorro extends Cuenta {
	
	public CajaDeAhorro() {
		
	}
	
	protected boolean puedeExtraer(double monto) {
		if (this.getSaldo() >= monto*1.02) {
			return true; 
		}
		else return false; 
	}
}
