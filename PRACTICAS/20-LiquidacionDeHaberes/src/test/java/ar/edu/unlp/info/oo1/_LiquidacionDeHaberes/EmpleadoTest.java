package ar.edu.unlp.info.oo1._LiquidacionDeHaberes;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

class EmpleadoTest {
	private Empleado emp1, emp2, emp3, emp4, emp5; 

	@BeforeEach 
	void setUp() {
		this.emp1 = new Empleado("Valentina", "Wiehl", 111, LocalDate.of(1977, 8, 14), true, false);
		this.emp1.agregarContrato(new ContratoDePlanta(LocalDate.of(2004, 1, 1), emp1, 10000, 1000, 1500));
		
		this.emp2 = new Empleado("Lucas", "Fernandez", 333, LocalDate.of(1980, 10, 21), false, true);
		this.emp2.agregarContrato(new ContratoDePlanta(LocalDate.of(2009, 1, 1), emp2, 10000, 1000, 1500)); // 11500
		
		this.emp3 = new Empleado("Enzo", "Perez", 555, LocalDate.of(1986, 3, 30), true, true);
		this.emp3.agregarContrato(new ContratoDePlanta(LocalDate.of(2014, 1, 1), emp3, 10000, 1000, 1500)); // 12500
		
		this.emp4 = new Empleado("Dana", "Martinez", 777, LocalDate.of(1990, 3, 30), false, true);
		this.emp4.agregarContrato(new ContratoDePlanta(LocalDate.of(2019, 1, 1), emp4, 10000, 1000, 1500));
		
		this.emp5 = new Empleado("Mateo", "Aguirrez", 888, LocalDate.of(1990, 3, 30), false, true);
		this.emp5.agregarContrato(new ContratoPorHora(LocalDate.of(2020, 1, 1), LocalDate.of(2024, 1, 1), emp5, 50, 40));
	}

	@Test
	void testCalcularSueldo() {
		assertEquals(22000, this.emp1.calcularSueldo()); // 20 años antiguedad y tiene cónyuge 
		assertEquals(19550, this.emp2.calcularSueldo()); // 15 años antiguedad y tiene hijos
		assertEquals(18750, this.emp3.calcularSueldo()); // 10 años antiguedad y tiene cónyuge e hijos
		assertEquals(14950, this.emp4.calcularSueldo()); // 5 años antiguedad y tiene hijos
		assertEquals(2000, this.emp5.calcularSueldo()); // < 5 años antiguedad. al ser contrato por hora no modifica que tenga hijos
	}

}
