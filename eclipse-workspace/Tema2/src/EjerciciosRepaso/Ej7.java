package EjerciciosRepaso;

import java.util.Scanner;

public class Ej7{

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
	Integer numero;
	Integer suma;
	Integer num;
	
	do {
		System.out.println("Introduce un numero");
		numero = scanner.nextInt();
		suma = 0;
		num = 0;
		if(numero >= 1 && numero <=10) {
			for(Integer contador = 0; contador <10; contador++) {
				num = num + numero;
				suma = suma + num;
				if(contador < 9) {
					System.out.println(num + " + ");
				}else {	
					System.out.println(num);
				}
			}
			System.out.println(" = " + suma);
		} else if (numero > 10 || numero < 0) {
			System.out.println("Numero incorrecto");
		} else {
			System.out.println("Fin");
		}
		
	} while (numero !=0);
	}

}

