package ar.edu.unlp.info.oo1._ClienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

class EmailTest {
	private Email email1;
	private Archivo archivo1, archivo2; 

	@BeforeEach
	void setUp() {
		archivo1 = new Archivo("Juju");
		archivo2 = new Archivo("Holaaa");
		email1 = new Email("Consulta Herencia", "Herencia en Java");
	}
	
	@Test
	void testConstructor() {
		assertEquals("Consulta Herencia", email1.getTitulo());
		assertEquals("Herencia en Java", email1.getCuerpo());
	}
	
	@Test
	void testAgregarArchivo() {
		email1.agregarArchivo(archivo1);
		email1.agregarArchivo(archivo2);
		assertEquals(2, email1.adjuntos().size());
	}
	
	@Test 
	void testGetTamaño() {
		email1.agregarArchivo(archivo1);
		email1.agregarArchivo(archivo2);
		assertEquals(43, email1.getTamaño());
	}
}
