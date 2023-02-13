package interfacelog;

import java.util.Date;

public class LogConsola implements Log{
	
	/*
	 * Esta clase implementa la interface Log, implementa el métofo log para visualizar los mensajes por pantalla
	 */
	
	//Variable que indica la fecha del mensaje
	
	Date fecha;
	
	public LogConsola () {
		super();
	}
	
	/*
	 * Implementacion del metodo log de la interface log para mostrar mensaje por pantalla con la fecha
	 */
	
	public void log (String msg) {
		fecha= new Date();
		System.out.println(PREFIJO + " " + fecha + " " + msg);
		
		
	}
	
	

}
