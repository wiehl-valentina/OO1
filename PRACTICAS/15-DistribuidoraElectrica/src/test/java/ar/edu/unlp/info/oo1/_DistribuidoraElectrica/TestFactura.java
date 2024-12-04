package ar.edu.unlp.info.oo1._DistribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

class TestFactura {
	private Factura factura1;
	private Factura factura2;
	private Usuario usuario;
	private Consumo consumoConBonificacion;
	private Consumo consumoSinBonificacion; 
	private CuadroTarifario cuadro;
	
	@BeforeEach
	void setUp() {
		cuadro = new CuadroTarifario(); 
		consumoConBonificacion = new Consumo(cuadro, 100, 46);
		consumoSinBonificacion = new Consumo(cuadro, 100, 75); 
		usuario = new Usuario("Juan Perez", "Calle 59 nro 456");
		factura1 = new Factura(usuario,consumoSinBonificacion); 
		factura2 = new Factura(usuario,consumoConBonificacion); 
	}
	
	@Test
	void testGetMontoFinal() {
		assertEquals(10000, factura1.getMontoFinal()); // fdp <= 0.8
		assertEquals(9000, factura2.getMontoFinal()); // fdp > 0.8
	}

	@Test
	void testFechaEmision() {
		assertEquals(LocalDate.now().minusDays(2), factura1.getFechaEmision());
	}
}
