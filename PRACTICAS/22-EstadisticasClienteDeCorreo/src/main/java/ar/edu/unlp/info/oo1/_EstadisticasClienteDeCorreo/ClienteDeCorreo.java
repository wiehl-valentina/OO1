package ar.edu.unlp.info.oo1._EstadisticasClienteDeCorreo;
import java.util.ArrayList;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private ArrayList<Carpeta> carpetas; 
	
	//CONSTRUCTOR
	public ClienteDeCorreo() {
		this.carpetas = new ArrayList<Carpeta>();
		this.inbox = new Carpeta("Inbox"); 
	}
	
	public ClienteDeCorreo(ArrayList<Carpeta> carpetas) {
		this.carpetas = carpetas; 
		this.inbox = new Carpeta("Inbox");
	}
	
	//MÉTODOS
	public void recibir(Email email) {
		this.inbox.agregarEmail(email);
	}
	
	public Carpeta getInbox() {
		return this.inbox; 
	}
	
	public void agregarCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}
	
	public ArrayList<Carpeta> getCarpetas() {
		return this.carpetas; 
	}
	
	public int getCantidadEmailsTotal() {
		return this.carpetas.stream().mapToInt(carpeta -> carpeta.getCantidadEmails()).sum() + this.inbox.getCantidadEmails(); 
	}
	
	public void mover(Carpeta origen, Carpeta destino, Email email) {
		origen.mover(email, destino);
	}
	
	public Email buscar(String texto) {
		if (this.inbox.buscar(texto) != null)
			return this.inbox.buscar(texto);
		else {
			return this.carpetas.stream()
			.map(carpeta -> carpeta.buscar(texto))
			.filter(email -> email != null)
			.findFirst().orElse(null);
		}
	}
	
	public int espacioOcupado() {
		return this.inbox.getTamaño()+this.carpetas.stream()
		.mapToInt(carpeta -> carpeta.getTamaño())
		.sum(); 
	}
}

