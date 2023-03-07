package biblioteca;

public class Biblioteca {

	// Atributos

	private String bibliotecario;
	static private Coleccionable[] coleccion = new Coleccionable[100];

	// Constructor con parámetros

	public Biblioteca(String bibliotecario, Coleccionable[] coleccion) {
		super();
		this.bibliotecario = bibliotecario;
		this.coleccion = coleccion;
	}

	// Getters y setters

	public String getBibliotecario() {
		return bibliotecario;
	}

	public void setBibliotecario(String bibliotecario) {
		this.bibliotecario = bibliotecario;
	}

	public Coleccionable[] getColeccion() {
		return coleccion;
	}

	public void setColeccion(Coleccionable[] coleccion) {
		this.coleccion = coleccion;
	}

	public static String inventario() {
		int numLibros = 0, numVideos = 0, numSeries = 0;

		for (int i = 0; i < coleccion.length; i++) {
			if (coleccion[i] instanceof Libro) {
				numLibros++;
			} else if (coleccion[i] instanceof SerieTV) {
				numSeries++;
			} else if (coleccion[i] instanceof Videojuego) {
				numVideos++;
			}
		}

		return "Libros: " + numLibros + "\nSeries: " + numSeries + "\nVideos: " + numVideos;
	}

	 public static void anadirColeccionable(Coleccionable colecc) {
		boolean encontrado = false;
		for (int i = 0; i < coleccion.length && !encontrado; i++) {
			if (coleccion[i] == null) {
				coleccion[i] = colecc;
				encontrado = true;
			}
		}
	}

	public static void detalleBiblioteca() {
		for (int i = 0; i < coleccion.length; i++) {
			if (coleccion[i] instanceof Libro) {

			}

		}
		for (int i = 0; i < coleccion.length; i++) {
			if (coleccion[i] instanceof SerieTV) {
				System.out.println(coleccion[i].mostrar());
			}

		}
		for (int i = 0; i < coleccion.length; i++) {
			if (coleccion[i] instanceof Videojuego) {
				System.out.println(coleccion[i].mostrar());
			}

		}
	}

}
