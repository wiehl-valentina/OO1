package ar.edu.unlp.info.oo1._ClienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

class CarpetaTest {
	private Carpeta carpeta, otraCarpeta; 
	private Email email1, email2; 
	
	@BeforeEach
	void setUp() {
		carpeta = new Carpeta("OO1");
		otraCarpeta = new Carpeta("IS1");
		email1 = new Email("Consulta IS1", "Redes de Petri");
		email2 = new Email("Consulta OO1", "Herencia vs Composición");
		carpeta.agregarEmail(email1);
		carpeta.agregarEmail(email2);
	}
	
	@Test
	void testConstructor() {
		assertEquals("OO1", carpeta.getNombre());
		assertEquals(2, carpeta.getEmails().size());
	}

	@Test
	void testAgregarEmail() {
		assertEquals(2, carpeta.getEmails().size());
	}
	
	@Test
	void testEliminarEmail() {
		carpeta.eliminarEmail(email2);
		assertEquals(1, carpeta.getEmails().size());
	}
	
	@Test
	void testGetTamaño() {
		assertEquals(61, carpeta.getTamaño());
	}
	
	@Test
	void testMover() {
		carpeta.mover(email1, otraCarpeta);
		assertEquals(1, otraCarpeta.getEmails().size());
	}
	
	@Test
	void testBuscar() {
		Email resultado = carpeta.buscar("Herencia vs Composición");
		Email resultado2 = carpeta.buscar("Consulta IS1");
		Email resultado3 = carpeta.buscar("Consulta Smalltalk");
		assertEquals(resultado, email2);
		assertEquals(resultado2, email1);
		assertNull(resultado3);
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
}
