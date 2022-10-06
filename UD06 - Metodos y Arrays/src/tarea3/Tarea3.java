package tarea3;

import java.util.Scanner;

public class Tarea3 {

	public static void main(String[] args) {

		System.out.println("Escribe un número para comprobar si es primo o no: ");
		Scanner s = new Scanner(System.in);
		int valor = s.nextInt();
		boolean primo = esPrimo(valor);
		if(primo)
			System.out.println("El valor " + valor + " es primo!");
		else System.out.println("El valor " + valor + " NO es primo!");
		s.close();
	}
	
	public static boolean esPrimo(int numero) {
		
		for (int x = 2; x < numero / 2; x++) {			//bucle de comprobación de divisibilidad entre numeros a partir del 2 hasta numero/2
			if (numero % x == 0)						// Si es divisible por cualquiera de estos números, no es primo
				return false;
		}
		
		if (numero == 0 || numero == 1 || numero == 4) {//casos no controlados por el bucle de números que tampoco son primos
			return false;
		}
		
		
		return true;	//Si no se cumple alguna de las condiciones anteriores, el numero es primo

	}

}
