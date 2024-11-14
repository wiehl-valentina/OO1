package ar.edu.unlp.info.oo1._AlquilerDePropiedades;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

class DisponibilidadTest {
	private SistemaDeAlquileres sistema; 
	private Propiedad propiedad; 
	private Usuario propietario;
	private DateLapse periodo1, periodo2; 
	private Reserva res; 
	
	@BeforeEach
	void setUp() {
		sistema = new SistemaDeAlquileres(); 
		propietario = new Usuario("Valentina Wiehl", "Calle 34 568", 123);
		propiedad = new Propiedad("Depto 2 personas MDQ", "Córdoba 1060", 30000, propietario);
		periodo1 = new DateLapse(LocalDate.now(), LocalDate.now().plusDays(5));
		periodo2 = new DateLapse(LocalDate.now().plusDays(20), LocalDate.now().plusDays(40));
		res = new Reserva(periodo2);
		propiedad.agregarReserva(res);
	}
	
	
	@Test
	void testVerificarDisponibilidad() {
		assertTrue(propiedad.consultarDisponibilidad(periodo1)); // no tiene reservas en dicho período
		assertFalse(propiedad.consultarDisponibilidad(periodo2)); // tiene reservas en dicho período 
	}
	
}
