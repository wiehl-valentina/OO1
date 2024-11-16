package ar.edu.unlp.info.oo1._MercadoDeObjetos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {
	private Cliente cliente;
	private Producto producto1, producto2, producto3;
	private Pago tipoPago; 
	private Envio tipoEnvio; 
	
	@BeforeEach
	void setUp() {
		this.cliente = new Cliente("Valentina Wiehl", "Calle 38 567");
		this.producto1 = new Producto("Lapicera de gel", "Librería", 900, 100);
		this.producto2 = new Producto("Lampara de escritorio", "Hogar", 2500, 30);
		this.producto3 = new Producto("Post It transparente", "Librería", 1500, 150);
		this.tipoPago = new PagoAlContado();
		this.tipoEnvio = new RetirarEnSucursalCorreo(); 
		
	}
	
	@Test
	void testRealizarPedido() {
		this.cliente.realizarPedido(tipoPago, tipoEnvio, producto1, 6);
		this.cliente.realizarPedido(tipoPago, tipoEnvio, producto2, 1);
		this.cliente.realizarPedido(tipoPago, tipoEnvio, producto3, 3);
		assertEquals(3, cliente.getPedidos().size());
	}
	
	@Test
	void testCalcularProductosPorCategoria() {
		this.cliente.realizarPedido(tipoPago, tipoEnvio, producto1, 6);
		this.cliente.realizarPedido(tipoPago, tipoEnvio, producto2, 1);
		this.cliente.realizarPedido(tipoPago, tipoEnvio, producto3, 3);
		assertEquals(2, this.cliente.calcularProductosPorCategoria("Librería")); 
	}

}
