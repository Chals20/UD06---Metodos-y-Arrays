package tarea5;

import java.util.Scanner;

public class Tarea5 {

	public static void main(String[] args) {

		System.out.println("Escribe un número para calcular su binario: ");
		Scanner s = new Scanner(System.in);
		int valor = s.nextInt();
		int binario = (int) numBinario(valor);
		System.out.println("El numero binario del valor " +valor+ " es: " +binario);
		s.close();

	}
	
	public static double numBinario(int numero) {
		
		double binario = 0;
		int exponente = 0;
		while(numero!=0){											//mientras el numero sea diferente a 0
            int digito = numero % 2;           						//calculamos el resto de la division del numero entre 2 (sera cada uno de los digitos 0/1)
            binario = binario + digito * Math.pow(10, exponente);   //añadimos digito en digito sumando el numero que ya tenemos + nuevo digito multiplicado por 10 elevado al exponente, que se va incrementando en 1 en cada iteracion                                             
            exponente++;
            numero = numero/2;										//en cada iteración dividimos el numero a la mitad
    }
		
		return binario;
	}

}
