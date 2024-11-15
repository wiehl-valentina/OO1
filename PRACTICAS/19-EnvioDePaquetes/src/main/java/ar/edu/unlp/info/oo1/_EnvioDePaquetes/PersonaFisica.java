package ar.edu.unlp.info.oo1._EnvioDePaquetes;

public class PersonaFisica extends Cliente{
	
	public PersonaFisica(String nombre, String direccion, int dni) {
		super(nombre,direccion,dni);
	}
	
	@Override
	public double calcularMontoFinal(DateLapse periodo) {
		double montoFinal = super.calcularMontoFinal(periodo);
		return montoFinal-montoFinal*0.10; 
	}
}
