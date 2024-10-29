package ar.edu.unlp.info.oo1._ClienteDeCorreo;
import java.util.ArrayList;

public class Carpeta {
	private ArrayList<Email> emails;
	private String nombre; 
	
	//CONSTRUCTOR
	public Carpeta() {
		emails = new ArrayList<Email>(); 
	}
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		emails = new ArrayList<Email>(); 
	}
	
	//MÉTODOS
	public String getNombre() {
		return this.nombre; 
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre; 
	}
	
	public ArrayList<Email> getEmails() {
		return this.emails; 
	}
	
	public void agregarEmail(Email email) {
		this.emails.add(email);
	}
	
	public void eliminarEmail(Email email) {
		this.emails.remove(email); 
	}
	
	public int getTamaño() {
		return this.emails.stream()
		.mapToInt(email -> email.getTamaño())
		.sum();
	}
	
	public void mover(Email email, Carpeta destino) {
		destino.agregarEmail(email);
		this.eliminarEmail(email);
	}
	
	public Email buscar(String texto) {
		return this.emails.stream()
		.filter(email -> email.contiene(texto))
		.findFirst().orElse(null); 
	}
}