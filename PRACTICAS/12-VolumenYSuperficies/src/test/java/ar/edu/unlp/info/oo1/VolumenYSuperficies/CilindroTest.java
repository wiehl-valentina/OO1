package ar.edu.unlp.info.oo1.VolumenYSuperficies;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test; 

class CilindroTest {
	private Cilindro cilindro; 
	
	@BeforeEach
	void setUp() {
		cilindro = new Cilindro(2,3,"Hierro","Rojo");
	}
	
	@Test
	void testConstructor() {
		assertEquals(2, cilindro.getRadio());
		assertEquals(3, cilindro.getAltura());
	}
	
	@Test
	void testGetVolumen() {
		assertEquals(38, Math.round(cilindro.getVolumen()));
	}
	
	@Test
	void testGetSuperficie() {
		assertEquals(63, Math.round(cilindro.getSuperficie()));
	}
}
