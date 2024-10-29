package ar.edu.unlp.info.oo1.VolumenYSuperficies;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test; 

class EsferaTest {
	private Esfera esfera; 
	
	@BeforeEach
	void setUp() {
		esfera = new Esfera("Hierro", "Azul", 2);
	}

	@Test
	void testConstructor() {
		assertEquals(2, esfera.getRadio());
	}
	
	@Test
	void testGetVolumen() {
		assertEquals(34, Math.round(esfera.getVolumen()));
	}
	
	@Test
	void testGetSuperficie() {
		assertEquals(50, Math.round(esfera.getSuperficie()));
	}
}
