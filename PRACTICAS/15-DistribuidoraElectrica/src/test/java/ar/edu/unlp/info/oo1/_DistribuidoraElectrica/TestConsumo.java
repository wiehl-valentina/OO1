package ar.edu.unlp.info.oo1._DistribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestConsumo {
	private Consumo consumoSinBonificacion; 
	private Consumo consumoConBonificacion; 
	private CuadroTarifario cuadro; 
	
	@BeforeEach
	void setUp() {
		cuadro = new CuadroTarifario();
		consumoConBonificacion = new Consumo(cuadro, 100, 46);
		consumoSinBonificacion = new Consumo(cuadro, 100, 75);
	}

	@Test
	void testCalcularConsumo() {
		assertEquals(10000, consumoSinBonificacion.calcularConsumo());
	}
	
	@Test
	void testCalcularFactorDePotencia() {
		assertEquals(0.9, consumoConBonificacion.calcularFactorDePotencia());
		assertEquals(0.8, consumoSinBonificacion.calcularFactorDePotencia());
	}

	@Test
	void testCalcularBonificacion() {
		assertEquals(1000, consumoConBonificacion.calcularBonificacion()); // fdp > 0.8
		assertEquals(0, consumoSinBonificacion.calcularBonificacion()); // fdp <= 0.8
	}
}
