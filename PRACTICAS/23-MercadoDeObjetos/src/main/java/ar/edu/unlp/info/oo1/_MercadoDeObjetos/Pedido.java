package ar.edu.unlp.info.oo1._MercadoDeObjetos;

public class Pedido {
	private Usuario cliente;
	private Pago tipoDePago;
	private Envio tipoDeEnvio; 
	private Producto producto; 
	private int cantidad; 
	
	// CONSTRUCTOR
	public Pedido(Usuario cliente, Pago tipoPago, Envio tipoEnvio, Producto producto, int cantidad) {
		this.cliente = cliente;
		this.tipoDePago = tipoPago; 
		this.tipoDeEnvio = tipoEnvio; 
		this.producto = producto; 
		this.cantidad = cantidad; 
	}

	public Usuario getCliente() {
		return this.cliente;
	}

	public Pago getTipoDePago() {
		return this.tipoDePago;
	}

	public Envio getTipoDeEnvio() {
		return this.tipoDeEnvio;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public int getCantidad() {
		return this.cantidad;
	}
	
	public double calcularPrecio() {
		return this.producto.getPrecio()*this.cantidad; 
	}
	
	public double calcularCostoTotal() {
		return this.tipoDePago.calcularCosto(this.calcularPrecio()+this.tipoDeEnvio.calcularCosto());
	}
}
