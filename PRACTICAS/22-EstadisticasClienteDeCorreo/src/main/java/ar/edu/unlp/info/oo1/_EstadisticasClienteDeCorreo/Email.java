package ar.edu.unlp.info.oo1._EstadisticasClienteDeCorreo;
import java.util.ArrayList;

public class Email {
	private String titulo;
	private String cuerpo; 
	private ArrayList<Archivo> adjuntos; 
	
	//CONSTRCUTOR
	public Email() {
		adjuntos = new ArrayList<Archivo>(); 
	}
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		adjuntos = new ArrayList<Archivo>(); 
	}
	
	//METODOS
	public String getTitulo() {
		return this.titulo; 
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	public String getCuerpo() {
		return this.cuerpo; 
	}
	
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	
	public ArrayList<Archivo> adjuntos() {
		return this.adjuntos; 
	}
	
	public void agregarArchivo(Archivo archivo) {
		this.adjuntos.add(archivo);
	}
	
	public int getTamaño() {
		return this.adjuntos.stream()
		.mapToInt(archivo -> archivo.tamaño())
		.sum()+this.titulo.length()+this.cuerpo.length();
	}
	
	public boolean contiene(String texto) {
		return this.getTitulo().contains(texto) || this.getCuerpo().contains(texto); 
	}
}
