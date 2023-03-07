package biblioteca;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ColeccionApp {
	static Scanner sc = new Scanner(System.in);
	static Coleccionable coleccion;
	static String[] arrayPlataformas = { "PC", "Mobile", "Play Station", "XBOX" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0;
		System.out.println("Nombre bibliotecario: ");
		String bibliotecario = sc.nextLine();

		do {
			menu();

			try {
				opcion = sc.nextInt();

			} catch (Exception e) {
				sc.next();
			} finally {
				switch (opcion) {

				case 1:
					altaLibro();
					break;
				case 2:
					altaSerie();
					break;
				case 3:
					altaVideojuego();
					break;
				case 4:
					System.out.println(Biblioteca.inventario());
					break;
				case 5:
					Biblioteca.detalleBiblioteca();
					break;
				case 6:
					break;
				default:
					break;
				}
			}

		} while (opcion != 6);
	}

	private static void altaVideojuego() {
		System.out.println("*** ALTA VIDEOJUEGO ***");
		System.out.println("\tNombre: ");
		String nombre = sc.next();
		System.out.println("\tPlataforma: ");
		String plataforma = (String) JOptionPane.showInputDialog(null, "Seleccione opcion", "Selector de opciones",
				JOptionPane.QUESTION_MESSAGE, null, // null para icono defecto
				arrayPlataformas, arrayPlataformas[0]);

		coleccion = new Videojuego(nombre, plataforma);
		Biblioteca.anadirColeccionable(coleccion);
	}

	private static void altaSerie() {
		System.out.println("*** ALTA SERIE ***");
		System.out.println("\tSerie: ");
		String serie = sc.next();
		System.out.println("\tTemporadas: ");
		int temporadas = sc.nextInt();
		int capTemporada[] = new int[temporadas];

		for (int i = 0; i < temporadas; i++) {
			System.out.println("\tCapítulos temporada " + (i + 1) + ": ");
			try {
				capTemporada[i] = sc.nextInt();

			} catch (Exception e) {
				sc.nextLine();
				i--;
			}
		}
		coleccion = new SerieTV(serie, temporadas, capTemporada);
		Biblioteca.anadirColeccionable(coleccion);

	}

	private static void altaLibro() {
		System.out.println("*** ALTA LIBRO ***");
		System.out.println("\tTitulo: ");
		String titulo = sc.next();
		System.out.println("\tAutor: ");
		String autor = sc.next();
		System.out.println("\tEditorial: ");
		String editorial = sc.next();
		System.out.println("\tNúmero de páginas: ");
		int paginas = sc.nextInt();

		coleccion = new Libro(titulo, autor, editorial, paginas);
		Biblioteca.anadirColeccionable(coleccion);
	}

	private static void menu() {
		System.out.println("---- ALTA BIBLIOTECA ----");
		System.out.println("1-Alta libro");
		System.out.println("2-Alta serie");
		System.out.println("3-Alta videojuego");
		System.out.println("4-Muéstrame el número de coleccionables");
		System.out.println("5-Muéstrame el detalle de la colección");
		System.out.println("6-Salir de la biblioteca");
	}

}
