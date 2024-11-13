package ar.edu.unlp.info.oo1._DistribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

class TestUsuario {
	private Usuario usuario; 
	private Consumo consumo1;
	private Consumo consumo2; 
	private Consumo consumo3;
	
	@BeforeEach 
	void setUp() {
		consumo1 = new Consumo(65,105);
		consumo2 = new Consumo(100,60);
		consumo3 = new Consumo(100, 75); 
		usuario = new Usuario("Valentina Wiehl", "Calle 50 345");
		usuario.agregarConsumo(consumo3);
		usuario.agregarConsumo(consumo1);
		usuario.agregarConsumo(consumo2);
	}

	@Test
	void testConstructor() {
		assertEquals("Valentina Wiehl", usuario.getNombre());
		assertEquals("Calle 50 345", usuario.getDomicilio());
	}
	
	@Test
	void testAgregarConsumo() {
		assertEquals(3, usuario.getConsumos().size());
	}
	
	@Test
	void testGetUltimoConsumo() {
		assertEquals(consumo2, usuario.getUltimoConsumo());
	}
	
	@Test 
	void testFacturarConsumo() {
		assertEquals(consumo2, usuario.facturarConsumo().getConsumo());
		assertEquals(usuario, usuario.facturarConsumo().getUsuario());
	}
}
