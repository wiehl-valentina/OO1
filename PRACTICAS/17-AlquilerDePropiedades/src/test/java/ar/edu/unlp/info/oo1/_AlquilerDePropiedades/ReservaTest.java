package ar.edu.unlp.info.oo1._AlquilerDePropiedades;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

class ReservaTest {
	private SistemaDeAlquileres sistema; 
	private Propiedad propiedad1, propiedad2; 
	private Usuario propietario, usuario;
	private DateLapse periodo1, periodo2;
	
	@BeforeEach
	void setUp() {
		this.sistema = new SistemaDeAlquileres(); 
		this.propietario = this.sistema.registrarUsuario("Valentina Wiehl", "Calle 34 568", 123);
		this.usuario = this.sistema.registrarUsuario("Juan Perez", "Calle 55 730", 234);
		this.propiedad1 = this.sistema.registrarPropiedad("Depto 2 personas MDQ", "Córdoba 1060", 30000, propietario);
		this.propiedad2 = this.sistema.registrarPropiedad("Depto 4 personas San Rafael", "San Martín 1060", 30000, propietario);
		this.periodo1 = new DateLapse(LocalDate.of(2024, 11, 14), LocalDate.of(2024, 11, 28));
		this.periodo2 = new DateLapse(LocalDate.of(2024, 12, 15), LocalDate.of(2024, 12, 20));
	}
	
	@Test
	void testRealizarReserva() {
		assertNotNull(this.sistema.realizarReserva(propiedad1, periodo1, usuario));
		assertNotNull(this.sistema.realizarReserva(propiedad1, periodo2, usuario));
		assertNotNull(this.sistema.realizarReserva(propiedad2, periodo2, usuario));
	}
	
	@Test
	void testCancelarReserva() {
		Reserva res1 = this.sistema.realizarReserva(propiedad1, periodo1, usuario);
		Reserva res2 = this.sistema.realizarReserva(propiedad1, periodo2, usuario);
		Reserva res3 = this.sistema.realizarReserva(propiedad2, periodo2, usuario);
		Reserva res4 = this.sistema.realizarReserva(propiedad2, periodo1, usuario);
		this.sistema.cancelarReserva(res1); // El comienzo del periodo coincide con el dia actual y no se puede cancelar la reserva
		assertTrue(this.sistema.listarPropiedadesDisponibles(periodo1).isEmpty());
		assertTrue(this.sistema.listarPropiedadesDisponibles(periodo2).isEmpty()); 
		sistema.cancelarReserva(res3); // El comienzo del periodo es despúes del día actual y se cancela la reserva
		assertEquals(1, this.sistema.listarPropiedadesDisponibles(periodo2).size());
		assertTrue(this.sistema.listarPropiedadesDisponibles(periodo1).isEmpty()); 
	}
}
