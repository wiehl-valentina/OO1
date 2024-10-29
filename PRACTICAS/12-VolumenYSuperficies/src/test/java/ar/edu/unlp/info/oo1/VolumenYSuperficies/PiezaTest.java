package ar.edu.unlp.info.oo1.VolumenYSuperficies;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PiezaTest {
	private Pieza pieza; 
	
	@BeforeEach
	void setUp() {
		pieza = new Cilindro(2,3,"Plata","Azul");
	}
	
	@Test
	void testConstructor() {
		assertEquals("Azul", pieza.getColor());
		assertEquals("Plata", pieza.getMaterial());
	}
}
