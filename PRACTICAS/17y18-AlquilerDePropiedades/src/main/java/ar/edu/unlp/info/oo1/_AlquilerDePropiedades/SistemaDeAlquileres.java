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
	
	public Propiedad registrarPropiedad(String nombre, String direccion, double precio, Usuario propietario, Politica politicaReembolso) {
		Propiedad propiedad = new Propiedad(nombre, direccion, precio, propietario, politicaReembolso);
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
			Reserva reserva = new Reserva(periodo, propiedad, usuario);
			usuario.agregarReserva(reserva);
			propiedad.agregarReserva(reserva);
			return reserva;
		}
		return null; 
	}
	
	public double cancelarReserva(Reserva reserva) {
		if (reserva.inicioPosteriorAFechaActual()) {
			double reembolso = reserva.getPropiedad().calcularReembolso(reserva);
			// elimina reserva en lista de usuarios 
			this.usuarios.stream().forEach(usuario -> usuario.eliminarReserva(reserva));
			// elimina reserva en lista de propiedades 
			this.propiedades.stream().forEach(propiedad -> propiedad.eliminarReserva(reserva));
			return reembolso; 
		}
		return -1; 
	}
	
	public double calcularIngresosPropietario(Usuario usuario, DateLapse periodo) {
		return this.usuarios.stream()
		.filter(usu -> usu.equals(usuario)).findAny().orElse(null).calcularIngresos(periodo);
	}
}
