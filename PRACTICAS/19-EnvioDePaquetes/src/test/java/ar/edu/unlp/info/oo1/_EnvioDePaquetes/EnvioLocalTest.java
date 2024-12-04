package ar.edu.unlp.info.oo1._EnvioDePaquetes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;
import java.time.LocalDate; 

class EnvioLocalTest {
	private EnvioLocal envioSinEntregaRapida, envioConEntregaRapida; 
	
	@BeforeEach 
	void setUp() {
		this.envioSinEntregaRapida = new EnvioLocal(LocalDate.of(2024, 8, 12), "Calle 40 456", "Calle 67 82", 250.4, false);
		this.envioConEntregaRapida = new EnvioLocal(LocalDate.of(2024, 6, 21), "Calle 32 736", "Calle 1 725", 140, true);
	}
	
	@Test
	void testCalcularMontoTotal() {
		assertEquals(1000, this.envioSinEntregaRapida.calcularMontoTotal());
		assertEquals(1500, this.envioConEntregaRapida.calcularMontoTotal());
	}
}
