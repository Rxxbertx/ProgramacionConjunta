package biblioteca;

public interface Coleccionable {

	//Sus atributos son constantes
	//Todos los métodos son abstractos (solo están definidos)
	
	static public final String LIBRO="Libro";
	static public final String SERIE_TV="Serie de TV";
	static public final String VIDEOJUEGO="Videojuego";
	
	public String mostrar();

}
