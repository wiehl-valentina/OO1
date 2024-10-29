package ar.edu.unlp.info.oo1.RedAlumbrado;
import java.util.List; 
import java.util.ArrayList; 

public class Farola {
	private boolean estaEncendida; 
	private List<Farola> vecinas; 
	
	public Farola() {
		estaEncendida = false; 
		vecinas = new ArrayList<Farola>();
	}
	
	public void pairWithNeighbor(Farola otraFarola) {
		if (!vecinas.contains(otraFarola)) {
			vecinas.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
	}
	
	public List<Farola> getNeighbors() {
		return vecinas; 
	}
	
	public void turnOn() {
		if (!this.estaEncendida) {
			this.estaEncendida = true; 
			for (Farola vecina : vecinas) {
				vecina.turnOn();
			}
		}
	}
	
	public void turnOff() {
		if (this.estaEncendida) {
			this.estaEncendida = false; 
			for (Farola vecina : vecinas) {
				vecina.turnOff();
			}
		}
	}
	
	public boolean isOn() {
		if (estaEncendida) 
			return true;
		return false; 
	}
	
	public boolean isOff() {
		if (!estaEncendida) 
			return true;
		return false; 
	}
}
