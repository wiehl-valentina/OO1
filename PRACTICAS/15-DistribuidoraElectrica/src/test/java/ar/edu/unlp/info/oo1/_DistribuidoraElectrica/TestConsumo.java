package ar.edu.unlp.info.oo1._DistribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestConsumo {
	private Consumo consumo1; 
	private Consumo consumo2; 
	private CuadroTarifario cuadro; 
	
	@BeforeEach
	void setUp() {
		consumo1 = new Consumo(65,105);
		consumo2 = new Consumo(100,60);
		cuadro = new CuadroTarifario(); 
	}

	@Test
	void testCalcularConsumo() {
		assertEquals(6500, consumo1.calcularConsumo(cuadro));
	}
	
	@Test
	void testCalcularFactorDePotencia() {
		assertEquals(0.85, consumo2.calcularFactorDePotencia());
	}

	@Test
	void testCalcularBonificacion() {
		assertEquals(1000, consumo2.calcularBonificacion(cuadro));
	}
}
