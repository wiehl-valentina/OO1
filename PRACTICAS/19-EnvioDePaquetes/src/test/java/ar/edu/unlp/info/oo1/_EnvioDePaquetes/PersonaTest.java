package ar.edu.unlp.info.oo1._EnvioDePaquetes;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

class PersonaTest {
	private Cliente cliente1, cliente2;
	private Envio envio1, envio2, envio3; 
	
	@BeforeEach
	void setUp() {
		this.cliente1 = new PersonaFisica("Valentina Wiehl", "Calle 44 567", 123);
		this.cliente2 = new ClienteCorporativo("Ind Dalani", "Calle 45 342", 3434);
		this.envio1 = new EnvioLocal(LocalDate.now(), "Calle 48 967", "Calle 2 345", 350.5, true);
		this.envio2 = new EnvioInterurbano(LocalDate.now(), "La Plata, Calle 38 55", "Pehuajo, Calle Lavarden 530", 600, 350);
		this.envio3 = new EnvioInternacional(LocalDate.now(), "Argentina", "Inglaterra", 550.3); 
	}

	@Test
	void testAgregarEnvio() {
		this.cliente1.agregarEnvio(envio1);
		this.cliente1.agregarEnvio(envio2);
		assertEquals(2, this.cliente1.getEnvios().size());
	}
	
	@Test
	void testCalcularMontoFinal() {
		this.cliente1.agregarEnvio(envio1);
		this.cliente1.agregarEnvio(envio2);
		this.cliente2.agregarEnvio(envio3);
		DateLapse periodo = new DateLapse(LocalDate.of(2024, 11, 1), LocalDate.of(2024, 11, 30));
		assertEquals(14850, this.cliente1.calcularMontoFinal(periodo)); // calcularmontofinal de personafisica
		assertEquals(10503, this.cliente2.calcularMontoFinal(periodo)); // calcularmontofinal de cliente
	}

}
