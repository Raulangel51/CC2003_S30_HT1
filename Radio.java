import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Radio implements RadioInterface{
	private boolean tipo;
	private boolean tipoFrecuencia;
	private double estacion;
	private int boton;
	
	public Radio() {
		
	}

	@Override
	public void cambioEstacion(boolean tipo, boolean tipoFrecuencia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cambioTipoFrecuencia(boolean tipo) {
		
		if (tipo == true) {
			JOptionPane.showMessageDialog(null, "Ahora se encuentra en frecuencia: PM");
		}
		if (tipo == false) {
			JOptionPane.showMessageDialog(null, "Ahora se encuentra en frecuencia: AM");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void encender() {
		JOptionPane.showMessageDialog(null, "La radio se ha encendido");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void apagar() {
		JOptionPane.showMessageDialog(null, "La radio se ha apagado");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void guardarEstacion(double estacion, boolean tipoFrecuencia, int boton) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double seleccionarEstacion(int boton, boolean tipoFrecuencia) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}

