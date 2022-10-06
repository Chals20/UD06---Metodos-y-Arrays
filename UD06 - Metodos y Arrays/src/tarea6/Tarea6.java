package tarea6;

import java.util.Scanner;

public class Tarea6 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int numero;
		do{ 
            System.out.print("Introduce un numero entero (>= 0) para contar sus cifras: ");                                                
            numero = s.nextInt();
        }while(numero < 0); //controlamos que el numero sea positivo
		
		int cifras = cifrasNumero(numero);
		System.out.println("El número " +numero+ " tiene " +cifras+ " cifras");
		s.close();
	}
	
	public static int cifrasNumero(int numero) {
		
		int cifras=1;
		while(numero >=10 ) {
			numero = numero/10;	//bucle en el que iteramos hasta que el valor sea menor a 10, cada iteración suma 1 a las cifras
			cifras++;
		}
		
		return cifras;
	}

}
