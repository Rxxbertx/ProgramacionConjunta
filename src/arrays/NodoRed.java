package arrays;

public class NodoRed {
	
	//Atributos 
	
	private String nombreEquipo;
	private int direccionIP;
	private int broadcast;
	private int puertaEnlace;
	private int red;
	private int dns;
	private static int numNodo=0;
	
	//Constructor por defecto
	
	public NodoRed() {
		
	}

	
	
	//Constructor con parámteros
	
	public NodoRed(String nombreEquipo, int direccionIP, int broadcast, int puertaEnlace, int red, int dns) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.direccionIP = direccionIP;
		this.broadcast = broadcast;
		this.puertaEnlace = puertaEnlace;
		this.red = red;
		this.dns = dns;
	}



	protected String getNombreEquipo() {
		return nombreEquipo;
	}



	protected void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}



	protected int getDireccionIP() {
		return direccionIP;
	}



	protected void setDireccionIP(int direccionIP) {
		this.direccionIP = direccionIP;
	}



	protected int getBroadcast() {
		return broadcast;
	}



	protected void setBroadcast(int broadcast) {
		this.broadcast = broadcast;
	}



	protected int getPuertaEnlace() {
		return puertaEnlace;
	}



	protected void setPuertaEnlace(int puertaEnlace) {
		this.puertaEnlace = puertaEnlace;
	}



	protected int getRed() {
		return red;
	}



	protected void setRed(int red) {
		this.red = red;
	}



	protected int getDns() {
		return dns;
	}



	protected void setDns(int dns) {
		this.dns = dns;
	}
	
	

}
