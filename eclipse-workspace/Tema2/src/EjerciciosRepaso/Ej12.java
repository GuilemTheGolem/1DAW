package EjerciciosRepaso;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Indica la demension del tablero");

		Integer dimension = scanner.nextInt();

		for (int x = 0; x < dimension; x++) {
			if (x == 0) {
				System.out.println(" __");
			} else {
				System.out.println("___");

			}
		}

		System.out.println();

		for (int fila = 0; fila < dimension; fila++) {
			for (int columna = 0; columna < dimension; columna++) {
				System.out.println("|__");
			}
			System.out.println("|");
		}

		scanner.close();

	}

}
