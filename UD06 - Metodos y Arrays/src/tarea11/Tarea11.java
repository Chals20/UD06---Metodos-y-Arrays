package tarea11;

import java.util.Scanner;

public class Tarea11 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el tamaño de los arrays:");
		int medida = s.nextInt();
		int[] array1 = new int[medida];
		
		for(int i=0; i<array1.length; i++) {		//bucle para rellenar array1
			
			array1[i] = (int) (Math.random()*100+0);	//valores aleatorios entre 0-100
			
		}
		
		int[] array2 = array1;	//array2 apunta a array1, al ser así cuando modifiquemos array2 también se modificará el 1, siendo iguales
		
		for(int i=0; i<array2.length; i++) {		//bucle para rellenar array2
			
			array2[i] = (int) (Math.random()*100+0);	//valores aleatorios entre 0-100
			
		}
		
		int[] arrayFinal = multiplicarArray(array1, array2);
		
		System.out.println("Array 1:");
		mostrarArray(array1);
		System.out.println("Array 2:");
		mostrarArray(array2);
		System.out.println("Array final:");
		mostrarArray(arrayFinal);
		
		s.close();
		
	}
	
	public static int[] multiplicarArray(int[] array1, int[] array2) {
		
		int[] array = new int[array1.length];
		
		for(int i=0; i<array1.length; i++) {	//bucle en el que se multiplican las posiciones del mismo indice de los dos arrays
			 array[i] = array1[i] * array2[i];
		}
		
		return array;
	}
	
	public static void mostrarArray(int[] arrayAMostrar) {
		
		
		for(int i=0; i<arrayAMostrar.length; i++) {
			System.out.println("El valor de la posicion " +i+ " del array es: " +arrayAMostrar[i]);		//bucle para mostrar cada valor del array usando el lenght (longitud) de este para iterar

		}
		
	}

}
