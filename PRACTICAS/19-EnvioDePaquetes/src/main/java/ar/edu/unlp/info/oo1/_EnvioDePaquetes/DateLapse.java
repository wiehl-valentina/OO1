package ar.edu.unlp.info.oo1._EnvioDePaquetes;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	private LocalDate from;
	private LocalDate to; 
	
	//CONSTRUCTOR
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to; 
	}
	
	//MÉTODOS
	public LocalDate getFrom() {
		return this.from; 
	}
	
	public LocalDate getTo() {
		return this.to; 
	}
	
	public int sizeInDays() {
		long days = ChronoUnit.DAYS.between(this.from, this.to);
		return (int)days; 
	}
	
	public boolean includesDate(LocalDate other) {
		return this.from.isBefore(other) && this.to.isAfter(other);
	}
	
	public boolean equalsFrom(LocalDate other) {
		return this.from.equals(other);
	}
	
	public boolean equalsTo(LocalDate other) {
		return this.to.equals(other);
	}
	
	public boolean overlaps (LocalDate other) {
		return this.includesDate(other) || this.equalsFrom(other) || this.equalsTo(other);
	}
		
	public boolean laterFrom() {
		return this.from.isAfter(LocalDate.now());
	}
	
}
