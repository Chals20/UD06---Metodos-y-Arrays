package tarea2;

import java.util.Scanner;

public class Tarea2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la cantidad de numeros aleatorios que se generaran: ");
		int cantidad = s.nextInt();
		System.out.println("Introduce el valor mínimo de estos números: ");
		int numMin = s.nextInt();		
		System.out.println("Introduce el valor máximo de estos números: ");
		int numMax = s.nextInt();
		
		int valorAleatorio = devuelveAleatorio(numMin, numMax, cantidad);
		System.out.println("El numero aleatorio es: " +valorAleatorio);
		
		s.close();
	}
	
	public static int devuelveAleatorio(int numeroMin, int numeroMax, int cantidadNum) {
		
		int arrayValores[] = new int[cantidadNum];
		
		for(int i=0; i<cantidadNum; i++) {
			int numRandom = (int) (Math.random() * numeroMax + numeroMin);
			arrayValores[i] = numRandom;
			System.out.println(arrayValores[i]);
		}
		
		int aleatorio = arrayValores[(int) (Math.random() * cantidadNum + 0)];
		
		return aleatorio;
	}

}
