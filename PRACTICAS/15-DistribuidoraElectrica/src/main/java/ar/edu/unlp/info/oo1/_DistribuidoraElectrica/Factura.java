package ar.edu.unlp.info.oo1._DistribuidoraElectrica;
import java.time.LocalDate; 

public class Factura {
	private Usuario usuario;
	private LocalDate fechaEmision;
	private double bonificacion; 
	private double montoFinal;
	private Consumo consumo; 
	
	public Factura(Usuario usuario, Consumo consumo) {
		CuadroTarifario cuadro = new CuadroTarifario(); 
		this.fechaEmision = LocalDate.now().minusDays(2);
		this.usuario = usuario;
		this.consumo = consumo;
		
		if (consumo.calcularFactorDePotencia() > 0.8) {
			this.bonificacion = this.consumo.calcularBonificacion(cuadro); 
			this.montoFinal = this.consumo.calcularConsumo(cuadro) - this.bonificacion;
		}
		else {
			this.bonificacion = 0; 
			this.montoFinal = this.consumo.calcularConsumo(cuadro);
		}
	}
	
	public Usuario getUsuario() {
		return this.usuario; 
	}
	
	public LocalDate getFechaEmision() {
		return this.fechaEmision; 
	}
	
	public double getMontoFinal() {
		return this.montoFinal; 
	}
	
	public double getBonificacion() {
		return this.bonificacion; 
	}
	
	public Consumo getConsumo() {
		return this.consumo; 
	}
}
