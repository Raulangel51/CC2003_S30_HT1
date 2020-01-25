import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controlador implements Radio{
	private boolean tipoFrecuencia = true;
	private double estacion = 88.1;
	private boolean on = true;
	private double [][] canales = new double [2][12];
	
	public Controlador() {
		
	}
	
	/**
	 * Cambia a la siguiente estacion de la radio
	 * @param tipo(true si pasa a la siguiente y false a la anterior), tipoFrecuencia(true si esta en FM y false si esta en AM)
	 */
		@Override
	public double cambioEstacion(boolean tipo, boolean tipoFrecuencia) {
		// Metodo para pasar a la siguiente estacion, dependiendo la Frecuencia AM o FM
			//Frecuencia AM
			if (tipoFrecuencia == true) {
				if (tipo == true) {
					if (Double.parseDouble(String.format("%.1f", this.getEstacion())) == 107.9) {
						this.setEstacion(87.9);
					}
					double a = Double.parseDouble(String.format("%.1f", this.getEstacion())) + 0.2;
					this.setEstacion(a);
				}
				if (tipo == false) {
					if (Double.parseDouble(String.format("%.1f", this.getEstacion())) == 87.9) {
						this.setEstacion(107.9);
					}
					double a = Double.parseDouble(String.format("%.1f", this.getEstacion())) - 0.2;
					this.setEstacion(a);
				}
			}
			//Frecuencia FM
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
		return estacion;
		
	}

		/**
		 * Cambia la frecuencia del radio de AM a FM
		 * @param tipo, true si es FM y false si es AM
		 */
	@Override
	public boolean cambioTipoFrecuencia(boolean tipo) {
		
		//si tipo es igual a true se encuentra en FM
		if (tipo == true) {
			this.estacion = 540;
			this.setTipoFrecuencia(false);
		}
		//si tipo es igual a False se encuentra en AM
		if (tipo == false) {
			this.estacion = 88.1;
			this.setTipoFrecuencia(true);
			
		}
		return tipoFrecuencia;
	}

	/**
	 * Enciende el radio, activa las funciones
	 */
	@Override
	public boolean encenderApagar(boolean estado)
	{
		//Apaga o enciende el radio
		if(estado == true)
		{
			on = true;
		}
		else
		{
			on = false;
		}
		
		return on;
	}

	/**
	 * Guarda la estacio deseada en la lista de canales
	 * @param estacion(la estacion que desea guardar), tipoFrecuencia(si es AM o FM), boton(el canal donde se va a guardar)
	 */
	@Override
	public void guardarEstacion(double estacion, boolean tipoFrecuencia, int boton) {
		//Guarda la estacion en la lista de FM
			if(tipoFrecuencia == true)
			{
				canales[0][boton-1] = estacion;
			}
			//Guarda la estacion en la lista de AM
			else
			{
				canales[1][boton-1] = estacion;
			}
		
	}

	/**
	 * Cambia la estacion actual de la radio por una especifica
	 * @param boton(el boton donde se guardo la estacion), tipoFrecuencia(la frecuancia de la estacion)
	 * @return la frecuancia guardad en los canales
	 */
	@Override
	public double seleccionarEstacion(boolean tipoFrecuencia, int boton) {
		//selecciona la estacion de la lista correspondiente
		int frecuencia = 0;
		if(tipoFrecuencia == true)//selecciona de la lista de FM
		{
			frecuencia =0;
			if(canales[frecuencia][boton-1] != 0.0)
				estacion = canales[frecuencia][boton-1];
		}
			
		else //selecciona de lista de AM
		{
			frecuencia = 1;
			if(canales[frecuencia][boton-1] != 0.0)
				estacion = canales[frecuencia][boton-1];
			
		}
					
		return canales[frecuencia][boton-1];
	}
	
	/**
	 * getEstacion devuelve la estacion actual del radio
	 */
	public double getEstacion()
	{
		return estacion;
	}
	
	/**
	 * get tipoFrecuencia devuelve si esta en AM o FM
	 */
	public boolean getTipoFrecuencia()
	{
		return tipoFrecuencia;
	}
	
	/**
	 * getEstado devuelve si el radio esta on o off
	 */
	public boolean getEstado()
	{
		return on;
	}


		
	/**
	 * Cambia la frecuencia de la radio
	 * @param tipoFrecuencia, true si esta en FM o false si esta en AM
	 */
	private void setTipoFrecuencia(boolean tipoFrecuencia) {
		this.tipoFrecuencia = tipoFrecuencia;
	}

	/**
	 * Cambia la estacion actual
	 * @param estacion,
	 */
	public void setEstacion(double estacion) {
		this.estacion = estacion;
	}
}
