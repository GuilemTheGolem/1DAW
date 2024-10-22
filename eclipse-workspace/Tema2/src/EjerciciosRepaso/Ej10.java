package EjerciciosRepaso;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String direccion;
		System.out.println("Dime una direccion WEB");
		direccion = scanner.nextLine();

		String protocolo = direccion.substring(0, direccion.lastIndexOf("/") + 1);
		String parte1 = direccion.substring(direccion.lastIndexOf("/") + 1, direccion.indexOf("."));
		String parte2 = direccion.substring(direccion.indexOf(".") + 1, direccion.lastIndexOf("."));
		String parte3 = direccion.substring(direccion.lastIndexOf(".")+1);
		
		System.out.println(protocolo);
		System.out.println(parte1);
		System.out.println(parte2);
		System.out.println(parte3);
		scanner.close();
	}

}
