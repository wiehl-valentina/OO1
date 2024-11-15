package ar.edu.unlp.info.oo1._EnvioDePaquetes;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

class EnviosTest {
	private Envio envio1, envio2, envio3, envio4, envio5, envio6, envio7, envio8, envio9, envio10; 
	
	@BeforeEach 
	void setUp() {
		this.envio1 = new EnvioLocal(LocalDate.of(2024, 8, 12), "Calle 40 456", "Calle 67 82", 250.4, true);
		this.envio2 = new EnvioLocal(LocalDate.of(2024, 6, 21), "Calle 32 736", "Calle 1 725", 140, false);
		this.envio3 = new EnvioInterurbano(LocalDate.of(2024, 8, 10), "La Plata", "Gonnet", 250.3, 4.2); // < 100
		this.envio4 = new EnvioInterurbano(LocalDate.of(2024, 8, 27), "La Plata", "Quilmes", 300, 100); // = 100
		this.envio5 = new EnvioInterurbano(LocalDate.of(2024, 11, 2), "La Plata", "Saladillo", 700, 250); // >100 y <500
		this.envio6 = new EnvioInterurbano(LocalDate.of(2024, 10, 14), "La Plata", "Henderson", 355.5, 500); // = 500
		this.envio7 = new EnvioInterurbano(LocalDate.of(2024, 10, 25), "La Plata", "Bariloche", 250.3, 1800); // >500
		this.envio8 = new EnvioInternacional(LocalDate.of(2024, 11, 26), "Argentina", "Chile", 350.2); // < 1000
		this.envio9 = new EnvioInternacional(LocalDate.of(2024, 6, 24), "Argentina", "Brasil", 1000); // = 1000
		this.envio10 = new EnvioInternacional(LocalDate.now(), "Argentina", "Colombia", 1250); // > 1000
	}

	@Test
	void testCalcularMontoTotal() {
		assertEquals(1500, this.envio1.calcularMontoTotal());
		assertEquals(1000, this.envio2.calcularMontoTotal());
		assertEquals(5006, this.envio3.calcularMontoTotal());
		assertEquals(7500, this.envio4.calcularMontoTotal());
		assertEquals(17500, this.envio5.calcularMontoTotal());
		assertEquals(8887.5, this.envio6.calcularMontoTotal());
		assertEquals(7509, this.envio7.calcularMontoTotal());
		assertEquals(8502, this.envio8.calcularMontoTotal());
		assertEquals(15000, this.envio9.calcularMontoTotal());
		assertEquals(20000, this.envio10.calcularMontoTotal());
	}

}
