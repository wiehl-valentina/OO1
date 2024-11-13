package ar.edu.unlp.info.oo1._DistribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

class TestCuadroTarifario {
	private CuadroTarifario cuadro;
	
	@BeforeEach 
	void setUp() {
		cuadro = new CuadroTarifario();
	}
	
	@Test
	void testModificarPrecio() {
		cuadro.setPrecio(250);
		assertEquals(250, cuadro.getPrecio());
	}
}
