package ar.edu.unlp.info.oo1._MercadoDeObjetos;

import java.util.*;

public class Cliente extends Usuario{
	private List<Pedido> pedidos;
	
	// CONSTRUCTOR
	public Cliente(String nombre, String direccion) {
		super(nombre, direccion); 
		this.pedidos = new ArrayList<Pedido>(); 
	}
	
	public List<Pedido> getPedidos() {
		return this.pedidos; 
	}
	
	public void agregarPedido(Pedido pedido) {
		this.pedidos.add(pedido); 
	}
	
	public void registrarPedido(Pago tipoPago, Envio tipoEnvio, Producto producto, int cantidad) {
		if (producto.getUnidadesDisponibles() >= cantidad) {
			Pedido pedido = new Pedido(this, tipoPago, tipoEnvio, producto, cantidad);
			this.agregarPedido(pedido);
			producto.actualizarStock(cantidad);
		}
	}
	
	public int calcularProductosPedidosPorCategoria(String categoria) {
		return (int)this.pedidos.stream()
		.filter(pedido -> pedido.getProducto().getCategoria() == categoria)
		.count(); 
	}
}
