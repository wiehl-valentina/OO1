package ar.edu.unlp.info.oo1.CuentaConGanchos;

public class CuentaCorriente extends Cuenta {
	private double limiteDeDescubierto; 
	
	public CuentaCorriente() {
		this.limiteDeDescubierto = 0; 
	}
	
	protected boolean puedeExtraer(double monto) {
		if (monto >= this.getSaldo()-this.limiteDeDescubierto)
			return false;
		else return true; 
	}
}
