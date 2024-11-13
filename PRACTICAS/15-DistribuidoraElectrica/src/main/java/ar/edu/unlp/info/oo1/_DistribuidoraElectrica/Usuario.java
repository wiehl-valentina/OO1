package ar.edu.unlp.info.oo1._DistribuidoraElectrica;
import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private String domicilio; 
	private ArrayList<Consumo> consumos; 
	
	public Usuario() {}
	
	public Usuario(String nombre, String domicilio) {
		this.nombre = nombre;
		this.domicilio = domicilio; 
		this.consumos = new ArrayList<Consumo>(); 
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre; 
	}
	
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio; 
	}
	
	public String getNombre() {
		return this.nombre; 
	}
	
	public String getDomicilio() {
		return this.domicilio; 
	}
	
	public void agregarConsumo(Consumo consumo) {
		this.consumos.add(consumo);
	}
	
	public ArrayList<Consumo> getConsumos() {
		return this.consumos; 
	}
	
	public Consumo getUltimoConsumo() {
		return consumos.getLast(); 
	}
	
	public Factura facturarConsumo() {
		Factura factura = new Factura(this, this.getUltimoConsumo());
		return factura; 
	}
}
