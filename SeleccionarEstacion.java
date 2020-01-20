import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SeleccionarEstacion {

	@Test
	void SeleccionarEstacion() {
		Controlador test = new Controlador();
		Double result = test.seleccionarEstacion(1, true);
		assertEquals(0, result);
	}

}
