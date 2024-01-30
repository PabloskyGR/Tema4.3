package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int notas[][] = new int[4][5];

		int nota, aux;

		int max = 0, min = 0, med = 0;

		for (int i = 0; i < 4; i++) {
			aux = 1;
			for (int j = 0; j < 5; j++) {
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
