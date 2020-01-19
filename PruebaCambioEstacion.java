import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PruebaCambioEstacion {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		Controlador test = new Controlador();
		test.cambioEstacion(true, true);
		double resultado = test.getEstacion();
		assertEquals(88.5, resultado);
	}

}
