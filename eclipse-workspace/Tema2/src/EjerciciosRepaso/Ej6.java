package EjerciciosRepaso;

import java.util.Scanner;

public class Ej6 {
	Scanner scanner = new Scanner(System.in);
	
	Integer numero = 3;
	Integer sumatotal = 3;
	
	while(numero < 30) {
		System.out.println(numero + " + ");
		numero = numero + 3;
		sumatotal = sumatotal + numero;
		
	}
System.out.println(numero + " = " + sumatotal);

scanner.close();
}
}