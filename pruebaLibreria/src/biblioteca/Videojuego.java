package biblioteca;

public class Videojuego implements Coleccionable{

	// Atributos
	private String nombre;
	private String plataforma;

	public Videojuego(String nombre, String plataforma) {
		super();
		this.nombre = nombre;
		this.plataforma = plataforma;
	}

	public Videojuego() {
		super();

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String mostrar() {
		return Coleccionable.VIDEOJUEGO + "\n--------------------" + "\nVideojuego: " + nombre + "\nPlataforma: " + plataforma;

	}

}
