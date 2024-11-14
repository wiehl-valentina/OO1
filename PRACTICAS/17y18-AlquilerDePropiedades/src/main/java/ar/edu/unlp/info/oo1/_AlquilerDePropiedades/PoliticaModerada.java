package ar.edu.unlp.info.oo1._AlquilerDePropiedades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PoliticaModerada implements Politica{
	public double reembolsar(Reserva reserva, double montoReserva) {
		if (ChronoUnit.DAYS.between(LocalDate.now(), reserva.getPeriodo().getFrom()) > 7)
			return (double)montoReserva;
		else if ((ChronoUnit.DAYS.between(LocalDate.now(), reserva.getPeriodo().getFrom()) <= 7) && (ChronoUnit.DAYS.between(LocalDate.now(), reserva.getPeriodo().getFrom()) > 2))
			return (double)montoReserva/2;
		else return 0; 
	}
}
