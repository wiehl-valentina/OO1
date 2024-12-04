package ar.edu.unlp.info.oo1._DistribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

class TestUsuario {
	private Usuario usuario; 
	private Consumo consumoConBonificacion;
	private Consumo consumoSinBonificacion; 
	private CuadroTarifario cuadro; 
	
	@BeforeEach 
	void setUp() {
		cuadro = new CuadroTarifario(); 
		consumoConBonificacion = new Consumo(cuadro, 100, 46);
		consumoSinBonificacion = new Consumo(cuadro, 100, 75);
		usuario = new Usuario("Valentina Wiehl", "Calle 50 345");
		usuario.agregarConsumo(consumoConBonificacion);
		usuario.agregarConsumo(consumoSinBonificacion);
	}
	
	@Test
	void testGetUltimoConsumo() {
		assertEquals(consumoSinBonificacion, usuario.getUltimoConsumo());
	}
}
