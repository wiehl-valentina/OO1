package ar.edu.unlp.info.oo1._EnvioDePaquetes;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

class EnvioInternacionalTest {
	private EnvioInternacional envioDeUnKilo, envioDeDosKilos; 
	
	@BeforeEach 
	void setUp() {
		this.envioDeUnKilo = new EnvioInternacional(LocalDate.now(), "Argentina", "Chile", 1000); 
		this.envioDeDosKilos = new EnvioInternacional(LocalDate.now(), "Argentina", "Chile", 2000);
	}

	@Test
	void testCalcularMontoTotal() {
		assertEquals(15000, this.envioDeUnKilo.calcularMontoTotal()); // <= 1000 gramos
		assertEquals(29000, this.envioDeDosKilos.calcularMontoTotal()); // > 1000 gramos
	}
}
