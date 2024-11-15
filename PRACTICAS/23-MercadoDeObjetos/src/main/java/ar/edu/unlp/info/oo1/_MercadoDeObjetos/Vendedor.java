package ar.edu.unlp.info.oo1._MercadoDeObjetos;
import java.util.*;

public class Vendedor extends Usuario{
	private List<Producto> productos;
	
	public Vendedor(String nombre, String direccion) {
		super(nombre, direccion);
		this.productos = new ArrayList<Producto>(); 
	}
	
	public List<Producto> getProductos() {
		return this.productos; 
	}
	
	public void actualizarStockProducto(Producto producto, int unidades) {
		this.productos.stream()
		.filter(prod -> prod.equals(producto)).findAny().orElse(null).actualizarStock(unidades);
	}
}
