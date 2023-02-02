package arrays;

public class NodoRed {
	
	//Atributos 
	
	private String nombreEquipo;
	private int direccionMAC;
	private int direccionIP;
	private int broadcast;
	private int puertaEnlace;
	private int direccionRed;
	private int servidorDNS;
	static int numNodos=0;
	
	//Constructor por defecto
	
	public NodoRed() {
		//Aumentamos la variable estática
		numNodos++;
		
	}

	
	
	//Constructor con parámetros
	
	public NodoRed(String nombreEquipo, int direccionIP, int broadcast, int puertaEnlace, int direccionRed, int dns, int direccionMAC) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.direccionIP = direccionIP;
		this.direccionMAC = direccionMAC;
		this.broadcast = broadcast;
		this.puertaEnlace = puertaEnlace;
		this.direccionRed = direccionRed;
		this.servidorDNS = dns;
	}


	//Getters y setters

	protected String getNombreEquipo() {
		return nombreEquipo;
	}



	protected void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}



	protected int getDireccionMAC() {
		return direccionMAC;
	}



	protected void setDireccionMAC(int direccionMAC) {
		this.direccionMAC = direccionMAC;
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



	protected int getDireccionRed() {
		return direccionRed;
	}



	protected void setDireccionRed(int direccionRed) {
		this.direccionRed = direccionRed;
	}



	protected int getServidorDNS() {
		return servidorDNS;
	}



	protected void setServidorDNS(int servidorDNS) {
		this.servidorDNS = servidorDNS;
	}

	
	//Visualizar los nodos
	
	public String toString() {
		return "nombreEquipo: " + getNombreEquipo() + "\ndireccionIP: " + getDireccionIP() + "\ndireccionMAC: "
				+ getDireccionMAC() + "\npuertaEnlace: " + getPuertaEnlace() + "\nservidorDNS: " + getServidorDNS()
				+ "\nbroadcastIP: " + getBroadcast();
	}
	



	
}
