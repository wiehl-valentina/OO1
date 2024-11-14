package ar.edu.unlp.info.oo1._AlquilerDePropiedades;

import java.util.ArrayList;
import java.util.List;

public class Propiedad {
	private String direccion;
	private String nombre;
	private double precioPorNoche;
	private Usuario propietario;
	private ArrayList<Reserva> reservas; 
	
	public Propiedad() {
		this.reservas = new ArrayList<Reserva>();
	}
	
	public Propiedad(String nombre, String direccion, double precio, Usuario propietario) {
		this.nombre = nombre;
		this.direccion = direccion; 
		this.precioPorNoche = precio;
		this.propietario = propietario;
		this.reservas = new ArrayList<Reserva>(); 
		this.propietario.agregarPropiedad(this);
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion; 
	}
	
	public String getNombre() {
		return this.nombre; 
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre; 
	}
	
	public double getPrecioPorNoche() {
		return this.precioPorNoche; 
	}
	
	public void setPrecioPorNoche(double precio) {
		this.precioPorNoche = precio; 
	}
	
	public Usuario getPropietario() {
		return this.propietario;
	}
	
	public void setPropietario(Usuario propietario) {
		this.propietario = propietario; 
	}
	
	public boolean consultarDisponibilidad(DateLapse periodo) {
		return this.reservas.stream()
		.noneMatch((reserva -> reserva.overlaps(periodo)));
	}
	
	public void agregarReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public void eliminarReserva(Reserva reserva) {
		this.reservas.remove(reserva); 
	}
	
	public ArrayList<Reserva> getReservas() {
		return this.reservas; 
	}
	
	public double calcularIngresosPropiedad(DateLapse periodo) {
		return this.reservas.stream()
		.filter(reserva -> reserva.overlaps(periodo))
		.mapToDouble(reserva -> this.calcularPrecioReserva(reserva)).sum();
	}
	
	public double calcularPrecioReserva(Reserva reserva) {
		return reserva.getPeriodo().sizeInDays()*this.precioPorNoche; 
	}
}
