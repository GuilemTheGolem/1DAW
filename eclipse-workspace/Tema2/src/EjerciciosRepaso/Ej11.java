package EjerciciosRepaso;

public class Ej11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Dame un número entero");

		Integer numero1 = scanner.nextInt();

		System.out.println("Dame otro número entero");

		Integer numero2 = scanner.nextInt();

		int suma = numero1 + numero2;

		int resta = numero1 - numero2;

		int multiplicacion = numero1 * numero2;

		int division = numero1 / numero2;

		int respuesta;

		do {

			System.out.println("*** MENÚ ***");

			System.out.println("  1. Sumar");

			System.out.println("  2. Restar");

			System.out.println("  3. Multiplicar");

			System.out.println("  4. Dividir");

			System.out.println("  0. Salir");

			respuesta = scanner.nextInt();

			if (respuesta == 1) {

				System.out.println("Has elegido sumar, la suma es: " + suma);

			}

			else if (respuesta == 2) {

				System.out.println("Has elegido restar, la restar es: " + resta);

			}

			else if (respuesta == 3) {

				System.out.println("Has elegido multiplicar, la multiplicación es: " + multiplicacion);

			}

			else if (respuesta == 4) {

				if (numero2 == 0) {

					System.out.println("La división no es posible");

				} else {
					System.out.println("Has elegido dividir, la división es: " + division);
				}

			}

			else {

				System.out.println("Termina el programa");

			}

		}

		while (respuesta != 0);

		scanner.close();
	}
}