package ar.edu.unlp.info.oo1._EnvioDePaquetes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

class EnvioInterurbanoTest {
	private EnvioInterurbano envio1, envio2, envio3, envio4; 
	
	@BeforeEach
	void setUp() {
		this.envio1 = new EnvioInterurbano(LocalDate.of(2024, 8, 10), "La Plata", "Hudson", 1500, 99); // < 100
		this.envio2 = new EnvioInterurbano(LocalDate.of(2024, 8, 27), "La Plata", "Ciudad Autónoma de Buenos Aires", 300, 100); // = 100
		this.envio3 = new EnvioInterurbano(LocalDate.of(2024, 10, 14), "La Plata", "Henderson", 680, 500); // = 500
		this.envio4 = new EnvioInterurbano(LocalDate.of(2024, 10, 25), "La Plata", "Trenque Lauquen", 2300, 501); // > 500
	}

	@Test
	void testCalcularMontoTotal() {
		assertEquals(30000, this.envio1.calcularMontoTotal());
		assertEquals(7500, this.envio2.calcularMontoTotal());
		assertEquals(17000, this.envio3.calcularMontoTotal());
		assertEquals(69000, this.envio4.calcularMontoTotal());
	}

}
