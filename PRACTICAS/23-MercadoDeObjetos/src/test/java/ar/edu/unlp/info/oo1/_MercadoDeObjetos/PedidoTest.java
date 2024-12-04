package ar.edu.unlp.info.oo1._MercadoDeObjetos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PedidoTest {
	private Cliente cliente; 
	private Producto producto; 
	private Pago pagoEnCuotas, pagoAlContado; 
	private Envio expressADomicilio, retiroEnComercio, retiroEnSucursal; 
	
	@BeforeEach
	void setUp() {
		this.cliente = new Cliente("Valentina Wiehl", "Calle 38 567");
		this.producto = new Producto("Lapicera de gel", "Librería", 900, 100);
		
		this.pagoEnCuotas = new PagoEn6Cuotas(); 
		this.pagoAlContado = new PagoAlContado(); 
		
		this.expressADomicilio = new ExpressADomicilio(300, 200);
		this.retiroEnComercio = new RetirarEnComercio();
		this.retiroEnSucursal = new RetirarEnSucursalCorreo(); 
		
		this.cliente.registrarPedido(pagoEnCuotas, expressADomicilio, producto, 1);
		this.cliente.registrarPedido(pagoEnCuotas, retiroEnComercio, producto, 3);
		this.cliente.registrarPedido(pagoEnCuotas, retiroEnSucursal, producto, 5);
		
		this.cliente.registrarPedido(pagoAlContado, expressADomicilio, producto, 1);
		this.cliente.registrarPedido(pagoAlContado, retiroEnComercio, producto, 3);
		this.cliente.registrarPedido(pagoAlContado, retiroEnSucursal, producto, 5);
	}

	@Test
	void testCalcularCostoTotal() {
		// pago en cuotas
		assertEquals(1140, this.cliente.getPedidos().get(0).calcularCostoTotal()); // con envío a domiclio
		assertEquals(3240, this.cliente.getPedidos().get(1).calcularCostoTotal()); // con retiro en comercio
		assertEquals(9000, this.cliente.getPedidos().get(2).calcularCostoTotal()); // con retiro en sucursal
		
		// pago al contado
		assertEquals(950, this.cliente.getPedidos().get(3).calcularCostoTotal()); // con envío a domicilio
		assertEquals(2700, this.cliente.getPedidos().get(4).calcularCostoTotal()); // con retiro en comercio
		assertEquals(7500, this.cliente.getPedidos().get(5).calcularCostoTotal()); // con retiro en sucursal
	}

}
