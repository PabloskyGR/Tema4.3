package ejercicios;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		int[][] tabla = new int[6][10];
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = (int) (Math.random() * 1001); 
			}
		}

		int[] minMax = obtenerMinMax(tabla);

		System.out.println("El número mínimo en la tabla es: " + minMax[0]);
		System.out.println("El número máximo en la tabla es: " + minMax[1]);
	}


	public static int[] obtenerMinMax(int[][] tabla) {
		int min = tabla[0][0];
		int max = tabla[0][0];

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				if (tabla[i][j] < min) { 
					min = tabla[i][j];
				}
				if (tabla[i][j] > max) { 
					max = tabla[i][j];
				}
			}
		}

		return new int[] { min, max };
	}

}
