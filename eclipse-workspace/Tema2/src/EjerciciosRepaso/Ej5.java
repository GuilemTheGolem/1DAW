package EjerciciosRepaso;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 1;
		do {
			System.out.print(numero + "_");
			numero++;
		}
		while(numero <=19);
		System.out.print(numero);
		
	scanner.close();
	}

}