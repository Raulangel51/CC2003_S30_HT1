
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
	public double cambioEstacion(boolean subirBajar, boolean tipoFrecuencia);

	//cambio de AM a FM
	public boolean cambioTipoFrecuencia(boolean tipo); //tipo es el tipo frecuencia

	//Encender radio
	public boolean encenderApagar(boolean estado);

	//guardar una estacion en un boton
	public void guardarEstacion(double estacion, boolean tipoFrecuencia, int boton);

	//seleccionar una estacion guardada
	public double seleccionarEstacion(boolean tipoFrecuencia, int boton);
	
	//devuelve la estacion actual
	public double getEstacion();
	
	//devuelve si es AM o FM
	public boolean getTipoFrecuencia();
	
	//devuelve el estado del radio on o off
	public boolean getEstado();	
		
	
}
