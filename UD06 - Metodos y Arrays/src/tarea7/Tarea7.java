package tarea7;

import java.util.Scanner;

public class Tarea7 {

	public static void main(String[] args) {

		System.out.println("Introduce la cantidad de euros: ");		//introducimos numero de € y moneda a cambiar
		Scanner s = new Scanner(System.in);
		double valor = s.nextDouble();
		System.out.println("Introduce la divisa para consultar el cambio (yen/dolar/libra):");
		String divisa = s.next();
		
		cambioDivisias(valor, divisa);
		
		s.close();

	}
	
	public static void cambioDivisias (double cantidad, String moneda) {
		
		double conversion = 0;
		
		switch (moneda) {					//usamos un switch para cada caso (yen/dolar/libra) sin controlar que se escriba otra cosa
		case "libra": 
			conversion = cantidad*0.86;			
			break;
		case "dolar": 
			conversion = cantidad*1.28611;			
			break;
		case "yen": 
			conversion = cantidad*129.852;			
			break;
		}
		System.out.println(cantidad+" € equivalen a " + conversion + " " + moneda);
	}

}
