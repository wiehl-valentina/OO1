package ar.edu.unlp.info.oo1._AlquilerDePropiedades;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private String direccion;
	private int dni; 
	private ArrayList<Propiedad> propiedades; 
	private ArrayList<Reserva> reservas; 
	
	public Usuario() {
		this.propiedades = new ArrayList<Propiedad>();
		this.reservas = new ArrayList<Reserva>();
	}
	
	public Usuario(String nombre, String direccion, int dni) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni; 
		this.propiedades = new ArrayList<Propiedad>();
		this.reservas = new ArrayList<Reserva>(); 
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public void agregarReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public void eliminarReserva(Reserva reserva) {
		this.reservas.remove(reserva);
	}
	
	public boolean buscarReserva(Reserva reserva) {
		return this.reservas.stream()
		.anyMatch(res -> res.equals(reserva));
	}
	
	public void agregarPropiedad(Propiedad propiedad) {
		this.propiedades.add(propiedad);
	}
	
	public void eliminarPropiedad(Propiedad propiedad) {
		this.propiedades.remove(propiedad);
	}
	
	public double calcularIngresos(DateLapse periodo) {
		return this.propiedades.stream()
		.mapToDouble(propiedad -> propiedad.calcularIngresosPropiedad(periodo)).sum(); 
	}
}
