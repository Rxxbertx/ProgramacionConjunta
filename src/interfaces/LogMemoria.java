package interfaces;

import java.util.Arrays;
import java.util.Date;

public class LogMemoria  implements InterfaceLog  {

	
	static String []logs=new String[0];
	Date fecha;
	
	
	@Override
	public void log(String msg) {
		
		fecha= new Date();
		String temp=PREFIJO+" "+fecha+" "+msg;
		añadirMensaje(temp);
		
		

	}
	
	public void añadirMensaje(String msg) {
		
		logs=Arrays.copyOf(logs, logs.length+1);//1
		
		logs[logs.length-1]=msg; //0
		
		
	}
	
	

	
	
	
	
	
	

}
