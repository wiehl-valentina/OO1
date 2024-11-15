package ar.edu.unlp.info.oo1._LiquidacionDeHaberes;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

class EmpleadoTest {
	private Empleado empleado1, empleado2, empleado3, empleado4, empleado5, empleado6, empleado7, empleado8, empleado9, empleado10; 
	private Contrato c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;

	@BeforeEach 
	void setUp() {
		this.empleado1 = new Empleado("Juan", "Perez", 234, LocalDate.of(1975, 6, 14), false, false);
		this.empleado10 = new Empleado("Luis", "Sanchez", 999, LocalDate.of(1960, 2, 22), false, false);
	}
	
	@Test
	void testAgregarContrato() {
		this.c10 = new ContratoPorHora(LocalDate.of(1998, 1, 1), LocalDate.of(2000, 10, 1), empleado10, 300, 30);
		this.c1 = new ContratoDePlanta(LocalDate.of(2000, 11, 15), empleado10, 10000, 1000, 1500);
		this.empleado10.agregarContrato(c10);
		this.empleado10.agregarContrato(c1);
		assertEquals(2,empleado10.getContratos().size());
	}
	
	@Test
	void testCalcularAntiguedad() {
		this.c10 = new ContratoPorHora(LocalDate.of(1998, 1, 1), LocalDate.of(2000, 10, 1), empleado10, 300, 30);
		this.c1 = new ContratoDePlanta(LocalDate.of(2000, 11, 15), empleado10, 10000, 1000, 1500);
		this.empleado10.agregarContrato(c10);
		this.empleado10.agregarContrato(c1);
		assertEquals(26, empleado10.calcularAntiguedadEnAños());
	}
//	
	@Test
	void testCalcularSueldo() {
		this.empleado2 = new Empleado("Valentina", "Wiehl", 111, LocalDate.of(1977, 8, 14), true, false);
		this.empleado3 = new Empleado("Maria", "Gonzalez", 222, LocalDate.of(1955, 11, 20), true, true);
		this.empleado4 = new Empleado("Lucas", "Fernandez", 333, LocalDate.of(1980, 10, 21), false, true);
		this.empleado5 = new Empleado("Lucia", "Lopez", 444, LocalDate.of(1992, 3, 30), true, true);
		this.empleado6 = new Empleado("Enzo", "Perez", 555, LocalDate.of(1986, 3, 30), true, true);
		this.empleado7 = new Empleado("Milena", "Gutierrez", 666, LocalDate.of(1982, 3, 30), true, true);
		this.empleado8 = new Empleado("Dana", "Martinez", 777, LocalDate.of(1990, 3, 30), false, true);
		this.empleado9 = new Empleado("Mateo", "Aguirrez", 888, LocalDate.of(1990, 3, 30), false, true);
		this.c1 = new ContratoDePlanta(LocalDate.of(2000, 11, 15), empleado1, 10000, 1000, 1500);
		this.c2 = new ContratoDePlanta(LocalDate.of(2004, 11, 15), empleado2, 10000, 1000, 1500);
		this.c3 = new ContratoDePlanta(LocalDate.of(2006, 11, 15), empleado3, 10000, 1000, 1500);
		this.c4 = new ContratoDePlanta(LocalDate.of(2009, 11, 15), empleado4, 10000, 1000, 1500);
		this.c5 = new ContratoDePlanta(LocalDate.of(2012, 11, 15), empleado5, 10000, 1000, 1500);
		this.c6 = new ContratoDePlanta(LocalDate.of(2014, 11, 15), empleado6, 10000, 1000, 1500);
		this.c7 = new ContratoDePlanta(LocalDate.of(2017, 11, 15), empleado7, 10000, 1000, 1500);
		this.c8 = new ContratoDePlanta(LocalDate.of(2019, 11, 15), empleado8, 10000, 1000, 1500);
		this.c9 = new ContratoDePlanta(LocalDate.of(2022, 11, 15), empleado9, 10000, 1000, 1500);
		
		// tests
		assertEquals(20000, this.empleado1.calcularSueldo()); // > 20 años antiguedad
		assertEquals(20000, this.empleado2.calcularSueldo()); // 20 años antiguedad
		assertEquals(17000, this.empleado3.calcularSueldo()); // > 15 años antiguedad
		assertEquals(17000, this.empleado4.calcularSueldo()); // 15 años antiguedad
		assertEquals(15000, this.empleado5.calcularSueldo()); // > 10 años antiguedad
		assertEquals(15000, this.empleado6.calcularSueldo()); // 10 años antiguedad
		assertEquals(13000, this.empleado7.calcularSueldo()); // > 5 años antiguedad
		assertEquals(13000, this.empleado8.calcularSueldo()); // 5 años antiguedad
		assertEquals(10000, this.empleado9.calcularSueldo()); // < 5 años
	}

}
