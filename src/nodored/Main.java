package nodored;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean inicioPrograma = true;

		while (inicioPrograma) {

			System.out.println("Que deseas hacer? 1-VER NODOS 2-CREAR NODOS 3-SALIR");

			switch (sc.nextInt()) {

			case 1:

				visualizarNodo();

				break;
			case 2:

				crearNodo();

				break;

			case 3:
				inicioPrograma = false;

				break;

			default:

				System.out.println("HAS INTRODUCIDO ALGO INCORRECTO");
				break;
			}

		}

	}

	private static void visualizarNodo() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Tienes " + NodoRed.nodosCreados + " nodos; Cual deseas ver?");

		int resp = sc.nextInt();

		if (resp != NodoRed.nodosCreados) {

			System.out.println("Error has introducido un nodo inexsitente");

		} else {

			System.out.println(NodoRed.nodos[resp].toString());
		}

	}

	private static void crearNodo() {

		NodoRed nodo = new NodoRed();

		Scanner sc = new Scanner(System.in);

		System.out.println("DIME EL NOMBRE DEL EQUIPO");
		nodo.setNombreEquipo(sc.nextLine());

		System.out.println("DIME LA DIRECCION IP");
		nodo.setDireccionIP(sc.nextLine());

		System.out.println("DIME LA DIRECCION DNS");
		nodo.setServidorDNS(sc.nextLine());

		System.out.println("DIME LA DIRECCION MAC");
		nodo.setDireccionMAC(sc.nextLine());

		System.out.println("DIME LA PUERTA DE ENLACE");
		nodo.setPuertaEnlace(sc.nextLine());

		System.out.println("DIME LA DIRECCION BROADCAST");
		nodo.setBroadcastIP(sc.nextLine());

		NodoRed.nodos[NodoRed.nodosCreados] = nodo;

	}

}
