package ar.edu.unlp.info.oo1._DistribuidoraElectrica;

public class Consumo {
	private double energiaActiva;
	private double energiaReactiva; 
	
	public Consumo() {}
	
	public Consumo(double energiaActiva, double energiaReactiva) {
		this.energiaActiva = energiaActiva;
		this.energiaReactiva = energiaReactiva; 
	}
	
	public double calcularConsumo(CuadroTarifario cuadro) {
		return this.energiaActiva*cuadro.getPrecio();
	}
	
	public double calcularFactorDePotencia() {
		double res = this.energiaActiva/Math.sqrt(Math.pow(this.energiaActiva, 2)+Math.pow(energiaReactiva, 2));
		return Math.floor(res*100.0)/100.0; 
	}
	
	public double calcularBonificacion(CuadroTarifario cuadro) {
		return this.calcularConsumo(cuadro)*0.10;
	}
}
