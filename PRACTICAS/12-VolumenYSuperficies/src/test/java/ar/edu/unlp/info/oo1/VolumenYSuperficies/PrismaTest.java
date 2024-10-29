package ar.edu.unlp.info.oo1.VolumenYSuperficies;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test; 

class PrismaTest {
	private PrismaRectangular prisma; 
	
	@BeforeEach
	void setUp() {
		prisma = new PrismaRectangular("Plata", "Verde", 3, 2, 2);
	}
	
	@Test
	void testConstructor() {
		assertEquals(3, prisma.getLadoMayor());
		assertEquals(2, prisma.getLadoMenor());
		assertEquals(2, prisma.getAltura());
	}
	
	@Test
	void testGetVolumen() {
		assertEquals(12, prisma.getVolumen());
	}
	
	@Test
	void testGetSuperficie() {
		assertEquals(32, prisma.getSuperficie());
	}
}
