package tarea10;

import java.util.Scanner;

public class Tarea10 {

	public static void main(String[] args) {


		int minimo = 0;		//numeros entre los que se generaran los valores del array
		int maximo = 100;
		
		int[] arrayLleno = rellenarArray(minimo, maximo);
		mostrarArray(arrayLleno);

	}
	
	public static int[] rellenarArray(int min, int max) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el tamaño del array:");
		int medida = s.nextInt();
		int[] array = new int[medida];		//creacion del array con la medida indicada por teclado
		
		for(int i=0; i<medida; i++) {		//bucle para rellenar array
			do {
				array[i] = (int) (Math.random()*max+min);	//anidamos un bucle dentro del for para ir generando numeros aleatorios hasta que sea primo
			} while (!esPrimo(array[i]));
			
		}
		
		s.close();
		return array;
	}
	
	public static void mostrarArray(int[] arrayAMostrar) {
		
		int mayor = 0;
		
		for(int i=0; i<arrayAMostrar.length; i++) {
			System.out.println("El valor de la posicion " +i+ " del array es: " +arrayAMostrar[i]);		//bucle para mostrar cada valor del array usando el lenght (longitud) de este para iterar
			if(arrayAMostrar[i] > mayor)
				mayor = arrayAMostrar[i];
		}
		
		System.out.println("El mayor valor de los numeros del array es: " +mayor);
	}
	
	public static boolean esPrimo(int numero) {

		for (int i = 2; i < numero / 2; i++) {
			if (numero % i == 0)
				return false;
		}

		if (numero == 0 || numero == 1 || numero == 4) {
			return false;
		}
		return true;
	}


}
