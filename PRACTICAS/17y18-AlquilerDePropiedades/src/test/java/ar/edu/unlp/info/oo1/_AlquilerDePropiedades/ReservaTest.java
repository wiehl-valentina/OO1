package ar.edu.unlp.info.oo1._AlquilerDePropiedades;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

class ReservaTest {
	private SistemaDeAlquileres sistema; 
	private Propiedad propiedad1, propiedad2, propiedad3; 
	private Usuario propietario, usuario, propietario2;
	private DateLapse periodo1, periodo2, periodo3, periodo4;
	private Reserva res1, res2, res3, res4, res5, res6; 
	
	@BeforeEach
	void setUp() {
		this.sistema = new SistemaDeAlquileres(); 
		this.propietario = this.sistema.registrarUsuario("Valentina Wiehl", "Calle 34 568", 123);
		this.usuario = this.sistema.registrarUsuario("Juan Perez", "Calle 55 730", 234);
		this.propietario2 = this.sistema.registrarUsuario("Maria Gonzalez", "Calle 44 865", 345);
		this.propiedad1 = this.sistema.registrarPropiedad("Depto 2 personas MDQ", "Córdoba 1060", 30000, propietario, new PoliticaModerada());
		this.propiedad2 = this.sistema.registrarPropiedad("Depto 4 personas San Rafael", "San Martín 1060", 25000, propietario, new PoliticaEstricta());
		this.propiedad3 = this.sistema.registrarPropiedad("Depto 2 personas Mar del Tuyu", "Calle 15 390", 20000, propietario2, new PoliticaFlexible());
		this.periodo1 = new DateLapse(LocalDate.of(2024, 11, 14), LocalDate.of(2024, 11, 15));
		this.periodo2 = new DateLapse(LocalDate.of(2024, 12, 1), LocalDate.of(2024, 12, 8));
		this.periodo3 = new DateLapse(LocalDate.of(2024, 11, 16), LocalDate.of(2024, 11, 18));
		this.periodo4 = new DateLapse(LocalDate.of(2024, 11, 21), LocalDate.of(2024, 11, 28));
		res1 = this.sistema.realizarReserva(propiedad1, periodo4, usuario);
		res2 = this.sistema.realizarReserva(propiedad1, periodo2, usuario);
		res3 = this.sistema.realizarReserva(propiedad2, periodo2, usuario);
		res4 = this.sistema.realizarReserva(propiedad2, periodo1, usuario);
		res5 = this.sistema.realizarReserva(propiedad3, periodo2, usuario);
		res6 = this.sistema.realizarReserva(propiedad1, periodo3, usuario);
	}
	
	@Test
	void testRealizarReserva() {
		assertEquals(6, this.usuario.getReservas().size());
	}
	
	@Test
	void testCancelarReserva() {
		// intento cancelacion reserva4
		assertEquals(-1, this.sistema.cancelarReserva(res4)); // El comienzo del periodo coincide con el dia actual y no se puede cancelar la reserva, devuelve -1
		assertEquals(2, this.sistema.listarPropiedadesDisponibles(periodo1).size()); // prop1 y prop3 libre 
		assertEquals(0, this.sistema.listarPropiedadesDisponibles(periodo2).size()); // todas las propiedades reservadas 
		assertEquals(2, this.sistema.listarPropiedadesDisponibles(periodo3).size()); // prop2 y prop3 libres
		assertEquals(2, this.sistema.listarPropiedadesDisponibles(periodo4).size()); // prop2 y prop 3 libres
		// cancelacion reserva3
		assertEquals(0, this.sistema.cancelarReserva(res3)); // El comienzo del periodo es despúes del día actual y la politica de cancelación estricta, reembolso = 0
		// cancelacion reserva5
		assertEquals(140000, this.sistema.cancelarReserva(res5)); // Comienza el periodo despues del dia actual con política de cancelación flexible, reembolso 100%
		// cancelacion reserva1
		assertEquals(105000, this.sistema.cancelarReserva(res1)); // comienza el período 7 días desp del dia actual con política de cancelación moderada, reembolso 50%
		// cancelacion reserva 2
		assertEquals(210000, this.sistema.cancelarReserva(res2)); // comienza el período 17 días desp del día actual con política de cancelación moderada, reembolso del 100%
		// cancelacion reserva 6
		assertEquals(0, this.sistema.cancelarReserva(res6)); // comienza el período dos días después del día actual con política de cancelación moderada, reembolso = 0
	}
}
