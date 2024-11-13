package ar.edu.unlp.info.oo1._DistribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

class TestFactura {
	private Factura factura1;
	private Factura factura2;
	private Factura factura3;
	private Usuario usuario;
	private Consumo consumo1;
	private Consumo consumo2; 
	private Consumo consumo3; 
	
	@BeforeEach
	void setUp() {
		consumo1 = new Consumo(65,105);
		consumo2 = new Consumo(100,60);
		consumo3 = new Consumo(100, 75); 
		usuario = new Usuario("Juan Perez", "Calle 59 nro 456");
		factura1 = new Factura(usuario,consumo1); 
		factura2 = new Factura(usuario,consumo2); 
		factura3 = new Factura(usuario,consumo3); 
	}
	
	@Test 
	void testGetBonificacion() {
		assertEquals(0, factura1.getBonificacion());
		assertEquals(1000, factura2.getBonificacion());
		assertEquals(0, factura3.getBonificacion());
	}
	
	@Test
	void testGetMontoFinal() {
		assertEquals(6500, factura1.getMontoFinal());
		assertEquals(9000, factura2.getMontoFinal());
		assertEquals(10000, factura3.getMontoFinal());
	}

	@Test
	void testFechaEmision() {
		assertEquals(LocalDate.now().minusDays(2), factura1.getFechaEmision());
	}
}
