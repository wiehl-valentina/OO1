package ar.edu.unlp.info.oo1.VolumenYSuperficies;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReporteTest {
	private ReporteDeConstruccion reporte1; 
	private ReporteDeConstruccion reporte2;
	@SuppressWarnings("serial")
	private ArrayList<Pieza> piezas = new ArrayList<Pieza>() {{add(new Cilindro(2,3,"Hierro","Rojo")); add(new Cilindro(1,2,"Madera","Azul")); add(new PrismaRectangular("Hierro", "Rojo", 3, 2, 2));}};
	
	@BeforeEach 
	void setUp() {
		reporte1 = new ReporteDeConstruccion(); 
		reporte2 = new ReporteDeConstruccion(piezas);
	}

	@Test
	void testConstructor() {
		assertTrue(reporte1.getPiezas().isEmpty());
		assertEquals(piezas, reporte2.getPiezas());
	}
	
	@Test
	void testAgregarPieza() {
		Pieza pieza1 = new Cilindro(2,2,"Madera","Rojo");
		Pieza pieza2 = new Cilindro(2,3,"Hierro","Rojo");
		Pieza pieza3 = new Esfera("Hierro","Azul",2);
		reporte1.agregarPieza(pieza1);
		reporte1.agregarPieza(pieza2);
		reporte1.agregarPieza(pieza3);
		assertEquals(3, reporte1.getPiezas().size());
	}
	
	@Test
	void testGetVolumenDeMaterial() {
		assertEquals(50, Math.round(reporte2.getVolumenDeMaterial("Hierro")));
	}
	
	@Test
	void testGetSuperficieDeColor() {
		assertEquals(95, Math.round(reporte2.getSuperficieDeColor("Rojo")));
	}
}
