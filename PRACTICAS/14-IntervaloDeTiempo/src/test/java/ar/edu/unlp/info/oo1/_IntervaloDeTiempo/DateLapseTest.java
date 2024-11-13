package ar.edu.unlp.info.oo1._IntervaloDeTiempo;
import ar.edu.unlp.info.oo1._IntervaloDeTiempoB.DateLapse2;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

class DateLapseTest {
	private DateLapse date1;
	private DateLapse2 date2; 
	
	@BeforeEach
	void setUp() {
		date1 = new DateLapse(LocalDate.of(2020, 3, 20), LocalDate.of(2020, 4, 10));
		date2 = new DateLapse2(LocalDate.of(2020, 3, 20), 21);
	}
	
	@Test
	void testConstructor() {
		assertEquals(LocalDate.of(2020, 3, 20), date1.getFrom());
		assertEquals(LocalDate.of(2020, 4, 10), date1.getTo());
		assertEquals(LocalDate.of(2020, 3, 20), date2.getFrom());
		assertEquals(LocalDate.of(2020, 4, 10), date2.getTo());
	}
	
	@Test
	void testSizeInDays() {
		assertEquals(21, date1.sizeInDays());
		assertEquals(21, date2.sizeInDays());
	}
	
	@Test
	void testIncludesDate() {
		assertFalse(date1.includesDate(LocalDate.of(2019, 4, 21))); //date before from
		assertFalse(date1.includesDate(LocalDate.now())); //date after to
		assertTrue(date1.includesDate(LocalDate.of(2020, 3, 30))); //date between from and to
	}
}
