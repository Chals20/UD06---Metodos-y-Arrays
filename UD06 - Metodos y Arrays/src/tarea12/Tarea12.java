package tarea12;

import java.util.Scanner;

public class Tarea12 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el tamaño del array:");
		int medida = s.nextInt();
		int[] array1 = new int[medida];
		
		for(int i=0; i<array1.length; i++) {		//bucle para rellenar array1
			
			array1[i] = (int) (Math.random()*300+0);	//valores aleatorios entre 0-300
			
		}
		
		mostrarNumeros(array1);
		s.close();
	}
	
	public static void mostrarNumeros(int[] array) {
		
		Scanner s = new Scanner(System.in);
		int digito;									//variables: digito final, array nuevo y indice de este array
		int indice = 0;				
		int[] arrayDigito = new int[array.length];
		do {
			System.out.println("Indica el dígito final de los números a mostrar");	//pedimos digito final
			digito = s.nextInt();			
		} while (digito<= 0 && digito > 10);
		
		System.out.println("Numeros terminados en el digito " + digito + " del array.");
		for(int i=0; i<array.length; i++) {			//bucle en el array pasado por parametro
			
			if((array[i] - digito) % 10 == 0) {		//en el que comparamos si la resta del valor en cada posicion - digito es divisible entre 10, lo que nos dara los valores con ese digito final
				arrayDigito[indice] = array[i];		//añadimos el valor del array en la posicion correspondiente (empezando por la 0)
				System.out.println(arrayDigito[indice]);
				indice++;							//e incrementamos este indice
			}
		}
		s.close();
	}

}
