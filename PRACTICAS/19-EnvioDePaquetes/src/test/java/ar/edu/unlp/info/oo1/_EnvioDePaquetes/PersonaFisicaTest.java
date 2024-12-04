package ar.edu.unlp.info.oo1._EnvioDePaquetes;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

class PersonaFisicaTest {
	private PersonaFisica cliente;
	
	@BeforeEach 
	void setUp() {
		this.cliente = new PersonaFisica("Valentina Wiehl", "Calle 44 567", 123);
		Envio envio1 = new EnvioLocal(LocalDate.now(), "Calle 48 967", "Calle 2 345", 350.5, true); // total = 1500pesos
		Envio envio2 = new EnvioInterurbano(LocalDate.now(), "La Plata, Calle 38 55", "Pehuajo, Calle Lavarden 530", 600, 350); // total = 15000pesos
		Envio envio3 = new EnvioInternacional(LocalDate.now(), "Argentina", "Inglaterra", 1050); // total = 17600pesos
		this.cliente.agregarEnvio(envio1);
		this.cliente.agregarEnvio(envio2);
		this.cliente.agregarEnvio(envio3);
	}
	
	@Test
	void testCalcularMontoFinal() {
		DateLapse periodo = new DateLapse(LocalDate.of(2024, 11, 15), LocalDate.of(2024, 12, 15));
		assertEquals(30690, this.cliente.calcularMontoFinal(periodo));
	}
}
