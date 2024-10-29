package ar.edu.unlp.info.oo1.VolumenYSuperficies;
import java.util.ArrayList; 

public class ReporteDeConstruccion {
	private ArrayList<Pieza> piezas; 
	
	//CONSTRUCTOR
	public ReporteDeConstruccion() {
		piezas = new ArrayList<Pieza>();
	}
	
	public ReporteDeConstruccion(ArrayList<Pieza> piezas) {
		this.piezas = piezas; 
	}
	
	//MÉTODOS
	
	public void agregarPieza(Pieza pieza) {
		this.piezas.add(pieza);
	}
	
	public ArrayList<Pieza> getPiezas() {
		return this.piezas; 
	}
	
	public double getVolumenDeMaterial(String material) {
		return piezas.stream()
				.filter(pieza -> pieza.getMaterial() == material)
				.mapToDouble(pieza -> pieza.getVolumen())
				.sum();
				
	}
	
	public double getSuperficieDeColor(String color) {
		return piezas.stream()
				.filter(pieza -> pieza.getColor() == color)
				.mapToDouble(pieza -> pieza.getSuperficie())
				.sum();
	}
}
