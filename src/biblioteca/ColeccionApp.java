package biblioteca;

import java.util.Scanner;

public class ColeccionApp {
	static Scanner sc = new Scanner(System.in);
	static Coleccionable coleccion;
	static String [] arrayPlataformas = {"PC", "Mobile", "Play Station", "XBOX"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;
		System.out.println("Nombre bibliotecario: ");
		String bibliotecario = sc.nextLine();

		do {
			menu();
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				altaLibro();
				break;
			case 2:
				altaSerie();
				break;
			}
		} while (opcion != 6);
	}

	private static void altaSerie() {
		System.out.println("*** ALTA SERIE ***");
		System.out.println("\tSerie: ");
		System.out.println("\tTemporadas: ");
		int temporadas = sc.nextInt();
		int capTemporada[] = new int[temporadas];
		for(int i =0; i<=temporadas; i++) {
			System.out.println("\tCapítulos temporada " + i);
			capTemporada[i] =(int) sc.nextInt();
		}
		
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
	}

}
