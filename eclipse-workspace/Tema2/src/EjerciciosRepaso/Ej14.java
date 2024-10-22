package EjerciciosRepaso;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String contraseña;
		Integer cadena;
		String contraseña2 = "";
		String a;
		String e;
		String i;
		String o;
		String u;
		
		do {
		System.out.println("Dime una contraseña");
		contraseña = scanner.nextLine();
		
		cadena = contraseña.length();
		
		a = contraseña2.replaceAll("a","4");
		e = contraseña2.replaceAll("e","3");
		i = contraseña2.replaceAll("i","1");
		o = contraseña2.replaceAll("o","0");
		u = contraseña2.replaceAll("u","7");
		
		
		}
		while(contraseña.length() <= 8);
		System.out.println("La contraseña sería:" + contraseña2);
		
		
		scanner.close();
	}

}
