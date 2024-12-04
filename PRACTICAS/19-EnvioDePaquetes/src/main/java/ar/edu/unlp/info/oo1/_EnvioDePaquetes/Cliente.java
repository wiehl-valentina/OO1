package ar.edu.unlp.info.oo1._EnvioDePaquetes;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	private String nombre;
	private String direccion; 
	private int id; 
	private List<Envio> envios;
	
	public Cliente(String nombre, String direccion, int id) {
		this.nombre = nombre;
		this.direccion = direccion; 
		this.id = id; 
		this.envios = new ArrayList<Envio>(); 
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public List<Envio> getEnvios() {
		return envios;
	}
	
	public int getId() {
		return id; 
	}

	public void agregarEnvio(Envio envio) {
		this.envios.add(envio);
	}
	
	public double calcularMontoFinal(DateLapse periodo) {
		return this.envios.stream()
		.filter(envio -> periodo.overlaps(envio.getFechaDespacho()))
		.mapToDouble(envio -> envio.calcularMontoTotal()).sum();
	}
}
