package arrays;

import java.util.Iterator;

public class ArrayBidimensionalEjemplo {

	public static void main(String[] args) {

		int[][] alumnos = { { 100, 200, 300, 400, 500 }, { 600, 700, 800, 900, 100 }, { 100, 200, 300, 400, 500 },
				{ 100, 200, 300, 400, 500 } };

		for (int i = 0; i < alumnos.length; i++) {

			System.out.print("Instituto " + (i + 1) + " ");

			for (int j = 0; j < alumnos[0].length; j++) {

				System.err.print(alumnos[i][j] + " ");

			}

			System.out.println();

		}

		// 2

		float[][] notaAlumnos = { { 1, 2, 3, 4 }, { 1, 2, 3, 4, 5, 6, 7 }, { 1, 2, 3 }, { 1, 2 } };

		/*
		 * 
		 * float[][]notaAlumnos; notaAlumnos=new float[4][]; notaAlumnos[0]=new
		 * float[4]; notaAlumnos[1]=new float[7]; notaAlumnos[2]=new float[3];
		 * notaAlumnos[3]=new float[2];
		 * 
		 */

		for (int i = 0; i < notaAlumnos.length; i++) {

			System.out.print("ALUMNO:" + (i + 1) + " ");

			for (int j = 0; j < notaAlumnos[i].length; j++) {

				System.out.print(notaAlumnos[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();

		String modulos[] = { "Sistemas informaticos", "Bases de datos", "Programacion", "Lenguajes de marcas",
				"Entornos de Desarrollo", "Formacion y Orientacion Laboral" };
		
		int[][]alumnosMatriculados= {{30,21},{27,17},{25,24},{21,26},{19,30},{16,30}};
		
		System.err.println("MODULOS            GRUPO1       GRUPO2");
		for (int i = 0; i < modulos.length; i++) {
			System.out.print(modulos[i]+"-------");
			
			for (int j = 0; j < alumnosMatriculados[i].length; j++) {
				System.out.print(alumnosMatriculados[i][j]+" ");
			}
			System.out.println();
			
		}
		

	}

}
