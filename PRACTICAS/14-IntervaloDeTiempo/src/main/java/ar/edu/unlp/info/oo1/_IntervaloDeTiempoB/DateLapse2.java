package ar.edu.unlp.info.oo1._IntervaloDeTiempoB;
import java.time.LocalDate;
import ar.edu.unlp.info.oo1._IntervaloDeTiempo.Date;

public class DateLapse2 implements Date{
	private LocalDate from; 
	private int sizeInDays; 
	
	//CONSTRUCTOR
	public DateLapse2(LocalDate from, int sizeInDays) {
		this.from = from;
		this.sizeInDays = sizeInDays; 
	}
	
	public LocalDate getFrom() {
		return this.from; 
	}
	
	public LocalDate getTo() {
		return this.from.plusDays(this.sizeInDays);
	}
	
	public int sizeInDays() {
		return this.sizeInDays;
	}
	
	public boolean includesDate(LocalDate other) {
		return this.from.isBefore(other) && this.getTo().isAfter(other);
	}
}
