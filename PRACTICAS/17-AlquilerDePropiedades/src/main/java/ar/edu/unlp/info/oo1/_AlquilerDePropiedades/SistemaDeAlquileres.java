package ar.edu.unlp.info.oo1._AlquilerDePropiedades;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SistemaDeAlquileres {
	private List<Usuario> usuarios;
	private List<Propiedad> propiedades;
	
	public SistemaDeAlquileres() {
		this.usuarios = new ArrayList<Usuario>(); 
		this.propiedades = new ArrayList<Propiedad>(); 
	}
	
	public Usuario registrarUsuario(String nombre, String direccion, int dni) {
		Usuario nuevoUser = new Usuario(nombre, direccion, dni);
		this.usuarios.add(nuevoUser);
		return nuevoUser; 
	}
	
	public Propiedad registrarPropiedad(String nombre, String direccion, double precio, Usuario propietario) {
		Propiedad propiedad = new Propiedad(nombre, direccion, precio, propietario);
		this.propiedades.add(propiedad);
		this.usuarios.stream()
		.filter(usuario -> usuario.equals(propietario))
		.findAny().orElse(null).agregarPropiedad(propiedad);
		return propiedad; 
	}
	
	public List<Propiedad> listarPropiedadesDisponibles(DateLapse periodo) {
		return this.propiedades.stream()
		.filter(propiedad -> propiedad.consultarDisponibilidad(periodo))
		.collect(Collectors.toList()); 
	}
	
	public Reserva realizarReserva(Propiedad propiedad, DateLapse periodo, Usuario usuario) {
		if (propiedad.consultarDisponibilidad(periodo)) {
			Reserva reserva = new Reserva(periodo);
			usuario.agregarReserva(reserva);
			propiedad.agregarReserva(reserva);
			return reserva;
		}
		return null; 
	}
	
	public void cancelarReserva(Reserva reserva) {
		if (reserva.inicioPosteriorAFechaActual()) {
			this.usuarios.stream().forEach(usuario -> usuario.eliminarReserva(reserva));
			this.propiedades.stream().forEach(propiedad -> propiedad.eliminarReserva(reserva));
		}
	}
	
	public double calcularIngresosPropietario(Usuario usuario, DateLapse periodo) {
		return this.usuarios.stream()
		.filter(usu -> usu.equals(usuario)).findAny().orElse(null).calcularIngresos(periodo);
	}
}
