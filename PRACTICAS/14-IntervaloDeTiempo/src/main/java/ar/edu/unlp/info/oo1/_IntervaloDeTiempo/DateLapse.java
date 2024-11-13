package ar.edu.unlp.info.oo1._IntervaloDeTiempo;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse implements Date{
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
}
