package nodored;

public class NodoRed {

	String nombreEquipo;
	String direccionIP;
	String direccionMAC;
	String puertaEnlace;
	String servidorDNS;
	String broadcastIP;
	static int nodosCreados = 0;
	public static NodoRed[] nodos = new NodoRed[100];

	public NodoRed() {

		nodosCreados++;

		/*
		 * 2- Miembros estáticos. Crea una clase llamada NodoRed que almacene
		 * información sobre: nombre del equipo, dirección IP, máscara de red, dirección
		 * de broadcast, puerta de enlace, dirección de red y servidores DNS. La clase
		 * debe tener una variable estática que se incremente en uno cada vez que se
		 * instancie la clase. Desarrolla los métodos que creas oportunos para
		 * visualizar y modificar las variables, así como una función estática que
		 * permita ver el número de NodoRed creados hasta un momento determinado.
		 * Programa una función Main que use la clase. El objetivo es practicar el uso
		 * de miembros estáticos.
		 */

	}

	public String toString() {
		return "nombreEquipo: " + getNombreEquipo() + "\ndireccionIP: " + getDireccionIP() + "\ndireccionMAC: "
				+ getDireccionMAC() + "\npuertaEnlace: " + getPuertaEnlace() + "\nservidorDNS: " + getServidorDNS()
				+ "\nbroadcastIP: " + getBroadcastIP();

	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public String getDireccionIP() {
		return direccionIP;
	}

	public void setDireccionIP(String direccionIP) {
		this.direccionIP = direccionIP;
	}

	public String getDireccionMAC() {
		return direccionMAC;
	}

	public void setDireccionMAC(String direccionMAC) {
		this.direccionMAC = direccionMAC;
	}

	public String getPuertaEnlace() {
		return puertaEnlace;
	}

	public void setPuertaEnlace(String puertaEnlace) {
		this.puertaEnlace = puertaEnlace;
	}

	public String getServidorDNS() {
		return servidorDNS;
	}

	public void setServidorDNS(String servidorDNS) {
		this.servidorDNS = servidorDNS;
	}

	public String getBroadcastIP() {
		return broadcastIP;
	}

	public void setBroadcastIP(String broadcastIP) {
		this.broadcastIP = broadcastIP;
	}

}
