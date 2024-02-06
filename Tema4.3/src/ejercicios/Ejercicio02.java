package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos el array de tipo entero donde iremos guardando los valores de las
		// notas
		int notas[][] = new int[4][5];

		// Variables que nos servirán como apoyo para guardar valores para adornar el
		// código
		int nota, aux;

		// Variables donde guardaremos el máximo, mínimo y la media de las notas de cada
		// alumno
		int max = 0, min = 0, med = 0;

		// Bucle for para recorrer las filas del array de las notas
		for (int i = 0; i < 4; i++) {

			// Inicializamos el auxiliar a 1 para llevar el orden de cada alumno
			aux = 1;

			// Vamos recorriendo cada columna de su respectiva fila con un bucle for
			for (int j = 0; j < 5; j++) {

				// Le pedimos al usuario la nota que quiere introducir
				System.out.println("Dime la " + aux + "º" + " nota:");
				nota = sc.nextInt();
				if (nota > 10 || nota < 0) {
					System.err.println("Error con la nota");
					System.out.println("Dime la " + aux + "º" + " nota:");
					nota = sc.nextInt();
				}
				notas[i][j] = nota;
				aux++;
			}
		}

		aux = 1;
		for (int i = 0; i < 4; i++) {
			System.out.println("Alumno " + aux + ": " + Arrays.toString(notas[i]));
			aux++;
		}

		aux = 1;
		for (int[] alumnoNotas : notas) {
			max = alumnoNotas[0];
			min = alumnoNotas[0];
			med = 0;

			for (int notaAlumno : alumnoNotas) {
				med += notaAlumno;
				if (notaAlumno > max) {
					max = notaAlumno;
				}
				if (notaAlumno < min) {
					min = notaAlumno;
				}
			}

			med /= 5;

			System.out.println();
			System.out.println("Nota máxima del " + aux + "º alumno: " + max);
			System.out.println("Nota mínima del " + aux + "º alumno: " + min);
			System.out.println("Nota media del " + aux + "º alumno: " + med);
			System.out.println("");

			aux++;
		}

		sc.close();
	}

}
