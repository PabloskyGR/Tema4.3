package ejercicios;

public class Ejercicio09 {

	public static void main(String[] args) {
		int tabla[][] = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };
		System.out.println(esMagica(tabla));

		for (int i = 0; i < tabla.length; i++) {
			System.out.println(tabla[i][tabla.length - i - 1]);
		}

	}

	static boolean esMagica(int tabla[][]) {
		boolean magica = true;
		int suma = 0;
		int nuevaSuma = 0;
		int i = 1;

		for (int j = 0; j < tabla[0].length; j++) {
			suma += tabla[0][j];
		}

		while (i < tabla.length && magica) {
			nuevaSuma = 0;
			for (int j = 0; j < tabla[i].length; j++) {
				nuevaSuma += tabla[i][j];
			}
			if (nuevaSuma != suma) {
				magica = false;
			}
			i++;
		}

		if (magica) {
			i = 0;
			while (i < tabla.length && magica) {
				nuevaSuma = 0;
				for (int j = 0; j < tabla[i].length; j++) {
					nuevaSuma += tabla[j][i];
				}
				if (nuevaSuma != suma) {
					magica = false;
				}
				i++;
			}
		}

		return magica;

	}

}
