package tarea9;

import java.util.Scanner;

public class Tarea9 {

	public static void main(String[] args) {

		int minimo = 0;		//numeros entre los que se generaran los valores del array
		int maximo = 9;
		
		int[] arrayLleno = rellenarArray(minimo, maximo);
		mostrarArray(arrayLleno);

	}
	
	public static int[] rellenarArray(int min, int max) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el tamaño del array:");
		int medida = s.nextInt();
		int[] array = new int[medida];		//creacion del array con la medida indicada por teclado
		
		for(int i=0; i<medida; i++) {
			array[i] = (int) (Math.random()*max+min);	//bucle en el que asignamos el valor de cada posicion mediante un random entre 0-9
		}
		
		s.close();
		return array;
	}
	
	public static void mostrarArray(int[] arrayAMostrar) {
		
		int suma = 0;
		
		for(int i=0; i<arrayAMostrar.length; i++) {
			System.out.println("El valor de la posicion " +i+ " del array es: " +arrayAMostrar[i]);		//bucle para mostrar cada valor del array usando el lenght (longitud) de este para iterar
			suma = suma + arrayAMostrar[i];		//en cada iteración sumamos acumulativamente el valor del array
		}
		
		System.out.println("La suma de todos los valores del array es: " +suma);
	}

}
