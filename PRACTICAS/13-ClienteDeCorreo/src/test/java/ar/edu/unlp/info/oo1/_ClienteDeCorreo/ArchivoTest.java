package ar.edu.unlp.info.oo1._ClienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

class ArchivoTest {
	private Archivo archivo; 
	
	@BeforeEach
	void setUp() {
		archivo = new Archivo("Holaaa");
	}
	
	
	@Test
	void testConstructor() {
		assertEquals("Holaaa", archivo.getNombre());
	}
	
	@Test
	void testTamaño() {
		assertEquals(6, archivo.tamaño());
	}
}
