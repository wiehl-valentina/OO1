package ar.edu.unlp.info.oo1._MercadoDeObjetos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PedidoTest {
	private Cliente cliente; 
	private Producto prod1, prod2, prod3; 
	private Pago pago1, pago2; 
	private Envio envio1, envio2, envio3; 
	
	@BeforeEach
	void setUp() {
		this.cliente = new Cliente("Valentina Wiehl", "Calle 38 567");
		this.prod1 = new Producto("Lapicera de gel", "Librería", 900, 100);
		this.prod2 = new Producto("Lampara de escritorio", "Hogar", 2500, 30);
		this.prod3 = new Producto("Post It transparente", "Librería", 1500, 150);
		this.pago1 = new PagoAlContado(); 
		this.pago2 = new PagoEn6Cuotas(); 
		this.envio1 = new RetirarEnComercio();
		this.envio2 = new RetirarEnSucursalCorreo(); 
		this.envio3 = new ExpressADomicilio(300, 200);
		this.cliente.realizarPedido(pago1, envio2, prod2, 1);
		this.cliente.realizarPedido(pago1, envio3, prod3, 3);
		this.cliente.realizarPedido(pago2, envio1, prod1, 5);
	}

	@Test
	void testCalcularCostoTotal() {
		assertEquals(5500, this.cliente.getPedidos().get(0)); // pago1 y envio2 funcionan bien
		assertEquals(4450, this.cliente.getPedidos().get(1)); // envio3 funciona bien
		assertEquals(5400, this.cliente.getPedidos().get(2)); // pago2 y envio1 funcionan bien
	}

}
