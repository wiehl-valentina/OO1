package ar.edu.unlp.info.oo1._EstadisticasClienteDeCorreo;

public class CategoriasTamaño {
	private int cantidadEmailsPequeños;
	private int cantidadEmailsMedianos; 
	private int cantidadEmailsGrandes; 
	
	public CategoriasTamaño(int pequeños, int medianos, int grandes) {
		this.cantidadEmailsPequeños = pequeños;
		this.cantidadEmailsMedianos = medianos;
		this.cantidadEmailsGrandes = grandes; 
	}

	public int getCantidadEmailsPequeños() {
		return cantidadEmailsPequeños;
	}

	public int getCantidadEmailsMedianos() {
		return cantidadEmailsMedianos;
	}

	public int getCantidadEmailsGrandes() {
		return cantidadEmailsGrandes;
	}
}
