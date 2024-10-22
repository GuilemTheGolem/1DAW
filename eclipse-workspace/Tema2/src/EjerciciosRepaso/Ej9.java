package EjerciciosRepaso;

import java.util.Scanner;

public class Ej9 {
	public static final String ADIOS = "adios";
	public static final String HASTA_LUEGO = "hastaluego";
	public static final String HOLA = "hola";

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String texto;

		boolean repetir = false;
		do {
			System.out.println("Escribe el mensaje");
			texto = scanner.nextLine();

			if (texto.startsWith(HOLA) && texto.endsWith(HASTA_LUEGO)) {
				String mensaje = texto.substring(texto.indexOf('a') + 1, texto.lastIndexOf(HASTA_LUEGO));

				repetir = true;
				System.out.println("Lo he entendido. Mensaje: " + mensaje.trim());

			} else if (texto.startsWith(HOLA) && texto.endsWith(ADIOS)) {
				String mensaje = texto.substring(texto.indexOf('a') + 1, texto.lastIndexOf(ADIOS));
				repetir = false;
				System.out.println("Lo he entendido. Mensaje: " + mensaje.trim());
			} else {
				System.out.println("Lo siento, no he entendido el mensaje");
				repetir = true;
			}

		} while (repetir);
		scanner.close();
	}
}
