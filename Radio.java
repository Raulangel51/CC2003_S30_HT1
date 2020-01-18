
/**
 * @author Raul Angel Jimenez Hernandez 
 * 	19017
 * @author Donaldo Sebastian Garcia Jimenez
 * 	
 * Fecha 15/01/2020
 * 
 * Clase Inteface del radio
 *	donde se encunetran todos los metodos que puede realizar
 */
public interface Radio {
	//cambio de frecuencia ejemplo: 99.9 al 100.0
	public void cambioEstacion(boolean tipo, boolean tipoFrecuencia);

	//cambio de AM a FM
	public void cambioTipoFrecuencia(boolean tipo);

	//Encender radio
	public void encender();
	public void apagar();

	//guardar una estacion en un boton
	public void guardarEstacion(double estacion, boolean tipoFrecuencia, int boton);

	//seleccionar una estacion guardada
	public double seleccionarEstacion(int boton, boolean tipoFrecuencia);
		
	
}
