package interfacelog;

/*A partir de esta interfaz se van a poder almacenar
 * mensajes en memoria, visualizarlos por pantalla, 
 * almacenarlos en ficheros, etc.
 * */

public interface Log {
	
	/*
	 * La constante prefijo almacena un prefijo que llevarán todos los mensajes 
	 * La constante totalMensaje cuenta los mensajes mostrados, almacenados
	 */

	public static final String PREFIJO = "Log>";
	public static final int TOTAL_MENSAJES = 0;
	
	public void log (String msg);

}
