package ar.edu.unlp.info.oo1.Parcial_SegundaFecha;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HumanoTest {
	
	private Personaje personaje = new Humano("Pablo", new Mago());
	private Personaje personaje2 = new Orco("Juan", new Guerrero());

	@Test
	void test() {
		personaje.enfrentarOponente(personaje2, 22);
		assertEquals(personaje2.getNivel(), 2);
	}
	
	@Test
	void testCambio() {
		personaje.enfrentarOponente(personaje2, 22);
		assertEquals(personaje2.getNivel(), 2);
		personaje.cambiarRol(new Guerrero());
		personaje.enfrentarOponente(personaje2, 14);
		assertEquals(personaje.getNivel(), 2);
	}

}
