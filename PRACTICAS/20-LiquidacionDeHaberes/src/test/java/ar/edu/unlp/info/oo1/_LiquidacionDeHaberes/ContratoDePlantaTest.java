package ar.edu.unlp.info.oo1._LiquidacionDeHaberes;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

class ContratoDePlantaTest {
	private Empleado empleadoConHijosSinConyuge, empleadoConHijosConConyuge, empleadoSinHijosSinConyuge, empleadoSinHijosConConyuge;
	private ContratoDePlanta contrato1, contrato2, contrato3, contrato4; 
	
	@BeforeEach 
	void setUp() {
		this.empleadoSinHijosSinConyuge = new Empleado("Valentina", "Wiehl", 234, LocalDate.of(2000, 6, 14), false, false);
		this.empleadoSinHijosConConyuge = new Empleado("Juan", "Perez", 111, LocalDate.of(1998, 8, 14), true, false);
		this.empleadoConHijosConConyuge = new Empleado("Maria", "Gonzalez", 222, LocalDate.of(1990, 11, 20), true, true);
		this.empleadoConHijosSinConyuge = new Empleado("Lucas", "Fernandez", 333, LocalDate.of(2000, 10, 21), false, true);
		this.contrato1 = new ContratoDePlanta(LocalDate.of(2018, 11, 15), empleadoSinHijosSinConyuge, 10000, 1000, 1500);
		this.contrato2 = new ContratoDePlanta(LocalDate.of(2018, 11, 15), empleadoSinHijosConConyuge, 10000, 1000, 1500);
		this.contrato3 = new ContratoDePlanta(LocalDate.of(2018, 11, 15), empleadoConHijosConConyuge, 10000, 1000, 1500);
		this.contrato4 = new ContratoDePlanta(LocalDate.of(2018, 11, 15), empleadoConHijosSinConyuge, 10000, 1000, 1500);
	}
	
	@Test
	void testCalcularMonto() {
		assertEquals(10000, this.contrato1.calcularMonto()); 
		assertEquals(11000, this.contrato2.calcularMonto()); 
		assertEquals(12500, this.contrato3.calcularMonto()); 
		assertEquals(11500, this.contrato4.calcularMonto()); 
	}
}
