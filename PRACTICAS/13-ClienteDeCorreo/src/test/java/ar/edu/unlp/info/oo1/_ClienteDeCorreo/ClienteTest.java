package ar.edu.unlp.info.oo1._ClienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

class ClienteTest {
	private ClienteDeCorreo cliente;
	private Email email1, email2; 
	private Carpeta c1;
	
	@BeforeEach
	void setUp() {
		this.cliente = new ClienteDeCorreo();
		this.email1 = new Email("Hola", "Cómo estás?");
		this.email2 = new Email("Promos!", "Promos Farmacity");
		this.c1 = new Carpeta("Favoritos");
		this.cliente.recibir(email1);
		this.cliente.recibir(email2);
		this.cliente.agregarCarpeta(c1);
	}

	@Test
	void testConstructor() {
		assertEquals(1, this.cliente.getCarpetas().size());
		assertEquals(2, this.cliente.getInbox().getEmails().size());
	}
	
	@Test
	void testRecibirYMover() {
		assertEquals(2, this.cliente.getInbox().getEmails().size());
		this.cliente.mover(this.cliente.getInbox(), this.c1, this.email1);
		assertEquals(1, this.cliente.getInbox().getEmails().size());
	}
	
	@Test
	void testAgregarCarpeta() {
		this.c1 = new Carpeta("Favoritos");
		assertEquals(1, this.cliente.getCarpetas().size());
	}
	
	@Test
	void testBuscar() {
		this.cliente.mover(this.cliente.getInbox(), this.c1, this.email1);
		assertEquals(this.email1, this.cliente.buscar("Hola")); //se encuentra en el inbox
		assertEquals(this.email2, this.cliente.buscar("Promos Farmacity")); // se encuentra en las carpetas
		assertNull(this.cliente.buscar("Email inexistente :$")); // no se encuentra en ningún lado
	}
	
	@Test
	void testEspacioOcupado() {
		assertEquals(38, this.cliente.espacioOcupado());
	}
}
