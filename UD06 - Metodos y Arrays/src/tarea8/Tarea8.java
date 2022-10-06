package tarea8;

import java.util.Scanner;

public class Tarea8 {

	public static void main(String[] args) {

		int arrayValores[] = new int[10];					//array inicial vacio
		int arrayLleno[] = rellenarValores(arrayValores);	//array lleno, se devuelve tras lanzar el metodo rellenarValores
		mostrarValores(arrayLleno);							//llamada funcion que muestra los valores

	}
	
	public static int[] rellenarValores(int[] arrayValores) {
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {						//bucle en el que introducimos cada valor a la vez que incrementamos el indice del array
			System.out.println("Introduce un valor");
			int valor = s.nextInt();
			arrayValores[i] = valor;
		}
		
		s.close();
		
		return arrayValores;
	}
	
	public static void mostrarValores(int[] arrayAMostrar) {
		
		System.out.println("ARRAY INTRODUCIDO");
		
		for(int i=0; i<10; i++) {						//bucle en el que se imprime el indice y su valor
			System.out.println("Indice array: " +i);
			System.out.println("Valor array: " +arrayAMostrar[i]);
		}
	}

}
