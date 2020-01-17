import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Radio implements RadioInterface{
	private boolean tipo = true;
	private boolean tipoFrecuencia = true;
	private double estacion = 88.1;
	private int boton;
	//private String[] [] canales = new String[3] [12];
	private double [][] canales = new double [2][12];
	
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
		
		//si tipo es igual a true se encuentra en FM
		if (tipo == true) {
			setEstacion(88.1);
		}
		//si tipo es igual a False se encuentra en AM
		if (tipo == false) {
			setEstacion(540);
		}
	}

	@Override
	public void encender() {
		//JOptionPane.showMessageDialog(null, "La radio se ha encendido");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void apagar() {
		//JOptionPane.showMessageDialog(null, "La radio se ha apagado");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void guardarEstacion(double estacion, boolean tipoFrecuencia, int boton) {
		// Metodo para guardar la estacion, la frecuencia y el canal en una matriz
		//String [] datos = new String[3];
		//datos[0] = String.valueOf(estacion); datos [1] = String.valueOf(tipoFrecuencia); datos[2] = String.valueOf(boton);
		//for(int i = 0; i < 3; i++)
		//{
			//canales[i][boton] = datos[i];
		//}
		if(tipoFrecuencia == true)
		{
			canales[0][boton] = estacion;
		}
		else
		{
			canales[1][boton] = estacion;
		}
		
	}

	@Override
	public double seleccionarEstacion(int boton, boolean tipoFrecuencia) {
		// devuelve la estacion dependiendo el boton y la estacion que desea
		int frecuencia = 0;
		if(tipoFrecuencia == true) 
			frecuencia =0;
		else 
			frecuencia = 1;
		return canales[frecuencia][boton];
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


