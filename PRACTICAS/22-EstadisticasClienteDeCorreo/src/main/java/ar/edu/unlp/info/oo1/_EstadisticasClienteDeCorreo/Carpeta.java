package ar.edu.unlp.info.oo1._EstadisticasClienteDeCorreo;
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
	
	public int getCantidadEmails() {
		return this.emails.size(); 
	}
	
	public CategoriasTamaño getCantidadEmailsPorCategoria() {
		int pequeños = (int)this.emails.stream().filter(email -> email.getTamaño() <= 300).count(); 
		int medianos = (int)this.emails.stream().filter(email -> email.getTamaño() > 300 && email.getTamaño() <= 500).count(); 
		int grandes = (int)this.emails.stream().filter(email -> email.getTamaño() > 500).count(); 
		CategoriasTamaño categorias = new CategoriasTamaño(pequeños, medianos, grandes); 
		return categorias; 
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