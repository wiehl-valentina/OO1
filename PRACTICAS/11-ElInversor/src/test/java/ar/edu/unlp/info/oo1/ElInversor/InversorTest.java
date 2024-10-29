package ar.edu.unlp.info.oo1.ElInversor;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class InversorTest {
	private Inversor inversorSinInversiones;
	private Inversor inversorConInversiones;
	private Inversion inversionAcciones; 
	private Inversion plazoFijo;
	private Inversion plazoFijo2; 
	
	@BeforeEach 
	void setUp() {
		inversorConInversiones = new Inversor("Valentina");
		inversorSinInversiones = new Inversor("Juan");
		inversionAcciones = new InversionAcciones("Inversion Acciones Test", 10, 10);
		plazoFijo = new PlazoFijo(LocalDate.now().minusDays(3), 1000, 10);
		plazoFijo2 = new PlazoFijo(LocalDate.now().minusDays(3), 1000, 10);
	}


	@Test
	void testConstructor() {
		assertEquals("Valentina", inversorConInversiones.getNombre());
		assertEquals("Juan", inversorSinInversiones.getNombre());
		assertTrue(inversorConInversiones.getInversiones().isEmpty());
		assertTrue(inversorSinInversiones.getInversiones().isEmpty());
	}

	@Test
	void testAgregarInversion() {
		inversorConInversiones.agregarInversion(inversionAcciones);
		inversorConInversiones.agregarInversion(plazoFijo);
		inversorConInversiones.agregarInversion(plazoFijo2);
		assertEquals(3, inversorConInversiones.getInversiones().size());
		assertEquals(0, inversorSinInversiones.getInversiones().size());
	}
	
	@Test
	void testValorActual() {
		inversorConInversiones.agregarInversion(inversionAcciones);
		inversorConInversiones.agregarInversion(plazoFijo);
		inversorConInversiones.agregarInversion(plazoFijo2);
		assertEquals(2762, inversorConInversiones.valorActual());
		assertEquals(0, inversorSinInversiones.valorActual()); 
	}
}
