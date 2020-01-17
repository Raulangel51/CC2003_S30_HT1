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
		if (tipoFrecuencia == true) {
			if (tipo == true) {
				if (this.getEstacion() == 107.9) {
					this.setEstacion(87.9);
				}
				double a = this.getEstacion() + 0.2;
				this.setEstacion(a);
			}
			if (tipo == false) {
				if (this.getEstacion() == 87.9) {
					this.setEstacion(107.9);
				}
				double a = this.getEstacion() - 0.2;
				this.setEstacion(a);
			}
		}
		if (tipoFrecuencia == false) {
			if (tipo == true) {
				if (this.getEstacion() == 1610) {
					this.setEstacion(530);
				}
				double a = this.getEstacion() + 10;
				this.setEstacion(a);
			}
			if (tipo == false) {
				if (this.getEstacion() == 530) {
					this.setEstacion(1610);
				}
				double a = this.getEstacion() - 10;
				this.setEstacion(a);
			}
		}
		
	}

	@Override
	public void cambioTipoFrecuencia(boolean tipo) {
		
		if (tipo == true) {
			setEstacion(88.1);
		}
		if (tipo == false) {
			setEstacion(540);
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


	public boolean isTipo() {
		return tipo;
	}


	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}


	public boolean isTipoFrecuencia() {
		return tipoFrecuencia;
	}


	public void setTipoFrecuencia(boolean tipoFrecuencia) {
		this.tipoFrecuencia = tipoFrecuencia;
	}


	public double getEstacion() {
		return estacion;
	}


	public void setEstacion(double estacion) {
		this.estacion = estacion;
	}


	public int getBoton() {
		return boton;
	}


	public void setBoton(int boton) {
		this.boton = boton;
	}
	

}


