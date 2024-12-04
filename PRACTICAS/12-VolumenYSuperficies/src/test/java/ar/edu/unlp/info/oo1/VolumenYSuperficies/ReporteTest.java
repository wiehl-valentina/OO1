package ar.edu.unlp.info.oo1.VolumenYSuperficies;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReporteTest {
	private ReporteDeConstruccion reporteSinPiezas; 
	private ReporteDeConstruccion reporteConPiezas;
	private ArrayList<Pieza> piezas;
	
	@BeforeEach 
	void setUp() {
		reporteSinPiezas = new ReporteDeConstruccion(); 
		piezas = new ArrayList<Pieza>(); 
		piezas.add(new Cilindro(2,3,"Hierro","Rojo")); 
		piezas.add(new Cilindro(1,2,"Madera","Azul")); 
		piezas.add(new PrismaRectangular("Hierro", "Rojo", 3, 2, 2));
		reporteConPiezas = new ReporteDeConstruccion(piezas);
	}

	@Test
	void testConstructor() {
		assertTrue(reporteSinPiezas.getPiezas().isEmpty());
		assertTrue(!reporteConPiezas.getPiezas().isEmpty());
	}
	
	@Test
	void testGetVolumenDeMaterial() {
		assertEquals(50, Math.round(reporteConPiezas.getVolumenDeMaterial("Hierro")));
		assertEquals(0, reporteSinPiezas.getVolumenDeMaterial("Hierro"));
	}
	
	@Test
	void testGetSuperficieDeColor() {
		assertEquals(95, Math.round(reporteConPiezas.getSuperficieDeColor("Rojo")));
		assertEquals(0, reporteSinPiezas.getSuperficieDeColor("Rojo"));
	}
}
