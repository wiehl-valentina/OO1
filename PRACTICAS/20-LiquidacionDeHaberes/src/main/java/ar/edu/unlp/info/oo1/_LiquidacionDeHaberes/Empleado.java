package ar.edu.unlp.info.oo1._LiquidacionDeHaberes;

import java.time.LocalDate;
import java.util.*; 

public class Empleado {
	private String nombre;
	private String apellido; 
	private int CUIL;
	private LocalDate fechaDeNacimiento; 
	private boolean tieneHijos;
	private boolean tieneConyuge; 
	private List<Contrato> contratos; 
	
	// CONSTRUCTOR
	public Empleado(String nombre, String apellido, int CUIL, LocalDate fechaDeNacimiento, boolean tieneConyuge, boolean tieneHijos) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.CUIL = CUIL;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.tieneHijos = tieneHijos;
		this.tieneConyuge = tieneConyuge;
		contratos = new ArrayList<Contrato>();
	}
	
	// METODOS
	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public int getCUIL() {
		return this.CUIL;
	}

	public LocalDate getFechaDeNacimiento() {
		return this.fechaDeNacimiento;
	}

	public boolean tieneHijos() {
		return this.tieneHijos;
	}

	public boolean tieneConyuge() {
		return this.tieneConyuge;
	}

	public List<Contrato> getContratos() {
		return this.contratos;
	}
	
	public void agregarContrato(Contrato contrato) {
		if (this.contratos.getLast().getFechaDeFin() != null && this.contratos.getLast().getFechaDeFin().isBefore(LocalDate.now()))
			this.contratos.add(contrato);
		else
			System.out.print("No se pudo agregar el contrato");
	}
	
	public int calcularAntiguedadEnAños() {
		return this.contratos.stream()
			.mapToInt(contrato -> contrato.calcularDuracionEnDias()).sum()/365; 
	}
	
	public double calcularSueldo() {
		Contrato ultContratoActivo = this.contratos.getLast();
		if (this.calcularAntiguedadEnAños() >= 20) 
			return ultContratoActivo.calcularMonto()*2;
		else if (this.calcularAntiguedadEnAños() >= 15)
			return ultContratoActivo.calcularMonto()+ultContratoActivo.calcularMonto()*0.70;
		else if (this.calcularAntiguedadEnAños() >= 10)
			return ultContratoActivo.calcularMonto()+ultContratoActivo.calcularMonto()*0.50;
		else if (this.calcularAntiguedadEnAños() >= 5)
			return ultContratoActivo.calcularMonto()+ultContratoActivo.calcularMonto()*0.30;
		else
			return ultContratoActivo.calcularMonto();
	}
}
