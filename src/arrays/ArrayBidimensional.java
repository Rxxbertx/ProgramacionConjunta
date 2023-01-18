package arrays;

import java.util.Arrays;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Declara y crea una variable que sea capaz de contener el número de alumnos
		 * matriculados en 4 institutos en 5 niveles de estudios: ESO, BACHILLERATO,
		 * CGM, CGS, FP BASICA
		 */

		int[][] alumnos = new int[4][5];

		/*
		 * Declara y crea una variable para contener la nota (puede contener decimales),
		 * obtenida por 4 alumnos en los diferentes módulos en los que están
		 * matriculados. El primer alumno está matriculado en 4 módulos, el segundo en
		 * 7, el tercero en 3 y el cuarto en 2 módulos.
		 */

		double[][] notas;
		notas = new double[4][];
		notas[0] = new double[4];
		notas[1] = new double[7];
		notas[2] = new double[3];
		notas[3] = new double[2];

		/*
		 * Declara e inicializa la(s) estructura(s) necesaria(s) para guardar los
		 * módulos y el número de alumnos matriculados en cada uno de los módulos del
		 * ciclo “Desarrollo de Aplicaciones Web”. Los datos son los siguientes
		 */

		int[][] alumnosDAW = new int[2][6];

		String[] modulos = { "Sistemas informáticos", "BBDD", "Programación", "Lenguajes", "Entornos", "FOL" };

		int[][] numAlumnos = { { 30, 27, 25, 21, 19, 16 }, { 21, 17, 24, 26, 30, 30 } };

		System.out.println(Arrays.toString(numAlumnos[0]));
		System.out.println(Arrays.toString(numAlumnos[1]));

		/*
		 * Crea un programa que trabaje con la tabla que se muestra a continuación. Debe
		 * declararla, crearla, inicializarla y acceder a cada una de sus posiciones
		 * mostrando sus valores en la forma que se indica:
		 * 
		 */

		int[][] elementos = { { 23, 45, 11, 2 }, { 67, 2 }, { 1, 2, 3, 4, 5, 6 } };
		System.out
				.println(Arrays.toString(elementos[0]) + Arrays.toString(elementos[1]) + Arrays.toString(elementos[2]));

		for (int posFila = 0; posFila < elementos.length; posFila++) {
			System.out.println("Los elementos de la fila " + (posFila + 1) + " son: ");
			for (int posCol = 0; posCol < elementos[posFila].length; posCol++) {
				System.out.println("Columna " + (posCol + 1) + " valor " + elementos[posFila][posCol]);
			}
		}

	}

}
