package EjerciciosRepaso;

import java.util.Scanner;

public class Ej16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);	
		
		String palabra = "";
		
		System.out.println("Dime una palabra");
		palabra = scanner.nextLine();
		
		for(int i = 0; i < palabra.length(); i++) {
			System.out.println(palabra.substring(i, i + 1));
		}
		scanner.close();
	}

}