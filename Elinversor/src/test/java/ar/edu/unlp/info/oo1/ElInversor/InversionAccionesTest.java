package ar.edu.unlp.info.oo1.ElInversor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

class InversionAccionesTest {
	
	private InversionAcciones inversion; 
	
	@BeforeEach
	void setUp() {
		inversion = new InversionAcciones("Inversion de Test", 10, 10);
	}
	
	@Test
	void testConstructor() {
		assertEquals("Inversion de Test", inversion.getNombre());
		assertEquals(10, inversion.getCantidad());
		assertEquals(10, inversion.getValorUnitario());
	}

	@Test
	void testCalcularTotal() {
		assertEquals(100, inversion.calcularTotal());
	}
	
	
}
