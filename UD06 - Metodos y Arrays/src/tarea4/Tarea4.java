package tarea4;

import java.util.Scanner;

public class Tarea4 {

	public static void main(String[] args) {

		System.out.println("Escribe un número para calcular su factorial: ");
		Scanner s = new Scanner(System.in);
		int valor = s.nextInt();
		int resultado = factorial(valor);
		System.out.println("El factorial de " +valor+ " es " +resultado);

		s.close();
	}
	
	public static int factorial(int valor) {
		
		int factorial = 1;
		for(int i=valor; i>0; i--)
			factorial = factorial*i;
		
		return factorial;
	}

}
