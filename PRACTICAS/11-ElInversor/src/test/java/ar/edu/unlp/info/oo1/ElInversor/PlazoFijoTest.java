package ar.edu.unlp.info.oo1.ElInversor;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlazoFijoTest {
	private PlazoFijo inversion; 
	
	@BeforeEach
	void setUp() {
		inversion = new PlazoFijo(LocalDate.now().minusDays(2),1000,10);
	}
	
	@Test
	void testConstructor() {
		assertEquals(LocalDate.now().minusDays(2), inversion.getFechaDeConstitucion());
		assertEquals(1000, inversion.getMontoDepositado());
		assertEquals(10, inversion.getPorcentajeDeInteresDiario());
	}
	
	void testCalcularTotal() {
		assertEquals(1210, inversion.calcularTotal());
	}
}
