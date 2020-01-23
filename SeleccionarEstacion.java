import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SeleccionarEstacion {

	@Test
	void SeleccionarEstacion() {
		Controlador test = new Controlador();
		Double result = test.seleccionarEstacion(true,1);
		assertEquals(0, result);
	}

}
