package ar.edu.unlp.info.oo1._LiquidacionDeHaberes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class ContratoTest {
	private Contrato c1, c2, c3, c4, c5;
	private Empleado empleado1, empleado2, empleado3, empleado4, empleado5; 
	
	@BeforeEach
	void setUp() {
		this.empleado1 = new Empleado("Valentina", "Wiehl", 234, LocalDate.of(2000, 6, 14), false, false);
		this.empleado2 = new Empleado("Juan", "Perez", 111, LocalDate.of(1998, 8, 14), true, false);
		this.empleado3 = new Empleado("Maria", "Gonzalez", 222, LocalDate.of(1990, 11, 20), true, true);
		this.empleado4 = new Empleado("Lucas", "Fernandez", 333, LocalDate.of(2000, 10, 21), false, true);
		this.empleado5 = new Empleado("Lucia", "Lopez", 444, LocalDate.of(1992, 3, 30), true, true);
		this.c1 = new ContratoDePlanta(LocalDate.of(2018, 11, 15), empleado1, 10000, 1000, 1500);
		this.c2 = new ContratoDePlanta(LocalDate.of(2018, 11, 15), empleado2, 10000, 1000, 1500);
		this.c3 = new ContratoDePlanta(LocalDate.of(2018, 11, 15), empleado3, 10000, 1000, 1500);
		this.c4 = new ContratoDePlanta(LocalDate.of(2018, 11, 15), empleado4, 10000, 1000, 1500);
		this.c5 = new ContratoPorHora(LocalDate.of(2024, 1, 15), LocalDate.of(2024, 12, 15), empleado5, 300, 30);
	}

	@Test
	void testCalcularMonto() {
		assertEquals(10000, this.c1.calcularMonto()); // monto sin conyuge ni hijos
		assertEquals(11000, this.c2.calcularMonto()); // monto con conyuge y sin hijos
		assertEquals(12500, this.c3.calcularMonto()); // monto con conyuge y con hijos
		assertEquals(11500, this.c4.calcularMonto()); // monto sin conyuge y con hijos

		assertEquals(9000, this.c5.calcularMonto());
	}
	
	@Test
	void testCalcularDuracion() {
//		System.out.print(ChronoUnit.DAYS.between(LocalDate.of(2024, 1, 15),LocalDate.of(2024, 12, 15))); // c5 335 dias
//		System.out.print(ChronoUnit.DAYS.between(LocalDate.of(2018, 11, 15),LocalDate.now())); // c1 2192 dias
		assertEquals(335, this.c5.calcularDuracionEnDias());
		assertEquals(2192, this.c1.calcularDuracionEnDias());
	}
}
