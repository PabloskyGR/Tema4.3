package ejercicios;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		int tabla[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		int tablaFin[][] = gira90(tabla);
		for(int[] fila: tablaFin) {
			for(int valor: fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}
		
	}

	public static int[][] gira90(int tablaInicio[][]) {
		int[][] tablaFinal = null;

		if (tablaInicio != null) {
			if (tablaInicio.length == tablaInicio[0].length) {
				tablaFinal = new int[tablaInicio.length][tablaInicio.length];

				for (int i = 0; i < tablaInicio.length; i++) {
					for (int j = 0; j < tablaInicio[0].length; i++) {
						tablaFinal[j][tablaInicio.length - i - 1] = tablaInicio[i][j];

					}
				}
			}
		}

		return tablaFinal;
	}

}
