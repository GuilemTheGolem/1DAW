package EjerciciosRepaso;

import java.util.Scanner;

public class Ej13 {
	public static final String FIN = "fin";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String acumulativo = "";
		String frase;

		do {

			System.out.println("Dime una frase");
			frase = scanner.nextLine();
			acumulativo = acumulativo + frase + " ";
			
			if(!frase.equalsIgnoreCase(FIN)) {
				acumulativo = acumulativo + frase + " ";
			
		}
		
	}while(!frase.equalsIgnoreCase(FIN));
	System.out.println("frase completa: "+acumulativo);
	scanner.close();
}

}
