package ar.edu.unlp.info.oo1._EnvioDePaquetes;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

class EnvioInternacional {
	private EnvioInternacional envio1, envio2; 

	@BeforeEach 
	void setUp() {
		this.envio1 = new EnvioInternacional(LocalDate.now(), "Argentina", "Chile", 1000);
		this.envio1 = new EnvioInternacional(LocalDate.now(), "Argentina", "Chile", 2000);
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
