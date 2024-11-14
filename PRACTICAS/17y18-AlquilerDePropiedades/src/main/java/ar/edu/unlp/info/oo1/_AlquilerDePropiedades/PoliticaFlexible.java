package ar.edu.unlp.info.oo1._AlquilerDePropiedades;

public class PoliticaFlexible implements Politica{
	public double reembolsar(Reserva reserva, double montoReserva) {
		return montoReserva; 
	}
}
