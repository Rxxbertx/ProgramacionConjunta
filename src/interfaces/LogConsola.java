package interfaces;

import java.util.Date;

public class LogConsola implements InterfaceLog {

	Date fecha;
	

	@Override
	public void log(String msg) {
		
		fecha= new Date();
		System.out.println(PREFIJO +" "+fecha+" "+msg);
		
	}

}
