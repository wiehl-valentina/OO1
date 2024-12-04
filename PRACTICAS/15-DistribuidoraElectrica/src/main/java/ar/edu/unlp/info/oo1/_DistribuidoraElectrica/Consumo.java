package ar.edu.unlp.info.oo1._DistribuidoraElectrica;

public class Consumo {
	private double energiaActiva;
	private double energiaReactiva;
	private CuadroTarifario cuadro; 
	
	public Consumo(CuadroTarifario cuadro) {
		this.cuadro = cuadro; 
	}
	
	public Consumo(CuadroTarifario cuadro, double energiaActiva, double energiaReactiva) {
		this.cuadro = cuadro; 
		this.energiaActiva = energiaActiva;
		this.energiaReactiva = energiaReactiva; 
	}
	
	public double calcularConsumo() {
		return this.energiaActiva*this.cuadro.getPrecio();
	}
	
	public double calcularFactorDePotencia() {
		double res = this.energiaActiva/Math.sqrt(Math.pow(this.energiaActiva, 2)+Math.pow(energiaReactiva, 2));
		return Math.floor(res*100.0)/100.0; 
	}
	
	public double calcularBonificacion() {
		if (this.calcularFactorDePotencia() > 0.8) 
			return this.calcularConsumo()*0.10;
		else
			return 0; 
	}
}
