package biblioteca;

public class Libro implements Coleccionable {

	// Atributos
	private String titulo;
	private String autor;
	private String editorial;
	private int paginas;

	// Constructor con parámetros

	public Libro(String titulo, String autor, String editorial, int paginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.paginas = paginas;
	}

	// Constructor por defecto

	public Libro() {
		super();

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	// Es obligatorio en las clases que implementan la interfaz meter los métodos de
	// la interfaz

	public String mostrar() {
		return Coleccionable.LIBRO + "\n----------------\nTitulo: " + titulo + "\nAutor: " + autor + "\nEditorial: "
				+ editorial + "\nNumero Paginas: " + paginas;
	}
}
