package ejercicios;

import java.util.Random;

public class Ejericicio05 {

	public static int[][] rellenaArray() {
		int[][] tabla = new int[4][5];
		Random rand = new Random();

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = rand.nextInt(100, 1000);
			}
		}

		return tabla;
	}

	public static void main(String[] args) {
		int[][] sumatorios = rellenaArray();

		int sumaFila = 0;
		int sumaColumna = 0;
		int total = 0;

		for (int[] fila : sumatorios) {
			sumaFila = 0;
			for (int valor : fila) {
				System.out.print(valor + "\t");
				sumaFila += valor;
			}
			System.out.println(sumaFila);
		}

		for (int j = 0; j < sumatorios[0].length; j++) {
			sumaColumna = 0;
			for (int i = 0; i < sumatorios.length; i++) {
				sumaColumna += sumatorios[i][j];
			}
			total += sumaColumna;
			System.out.print(sumaColumna + "\t");
		}
		System.out.println(total);
	}

}
