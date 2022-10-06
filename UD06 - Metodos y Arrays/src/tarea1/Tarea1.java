package tarea1;

import java.util.Scanner;

public class Tarea1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Qué area quieres calcular: (Circulo, Triangulo o Cuadrado)?");
		String figura = s.nextLine();
		
		if(figura.equals("Circulo")) {								//si la figura es un circulo
			System.out.println("Que radio tiene el circulo?");		//pedimos radio
			String radioString = s.nextLine();						//lo recogemos como string
			double radio = Double.parseDouble(radioString);			//lo parseamos a double
			double areaCirculo = areaCirculo(radio);				//llamamos al metodo que calcula el area pasandole el radio
			System.out.println("El area del círculo es de: " +areaCirculo);
		}else if(figura.equals("Cuadrado")) {						//si la figura es cuadrado
			System.out.println("Que valor tiene el lado?");			//pedimos valor del lado
			String ladoString = s.nextLine();						//lo recogemos como string
			double lado = Double.parseDouble(ladoString);			//lo parseamos a double
			double areaCuadrado = areaCuadrado(lado);				//llamamos al metodo que calcula el area pasandole el lado
			System.out.println("El area del cuadrado es de: " +areaCuadrado);
		}else if(figura.equals("Triangulo")) {						//si la figura es triangulo
			System.out.println("Que valor tiene la base?");			//pedimos valor de la base
			String baseString = s.nextLine();						//lo recogemos como string
			double base = Double.parseDouble(baseString);			//lo parseamos a double
			System.out.println("Que valor tiene la altura?");		//pedimos valor de la altura
			String alturaString = s.nextLine();						//lo recogemos como string
			double altura = Double.parseDouble(alturaString);		//lo parseamos a double
			double areaTriangulo = areaTriangulo(base, altura);		//llamamos al metodo que calcula el area pasandole la base y altura
			System.out.println("El area del triangulo es de: " +areaTriangulo);
		}
		
		s.close();
		
	}
	
	public static double areaCirculo(double radio) {
		
		double area = Math.PI * Math.pow(radio, 2);
		
		return area;
	}
	
	public static double areaCuadrado(double lado) {
		
		double area = lado*lado;
		
		return area;
	}
	
	public static double areaTriangulo(double base, double altura) {
		
		double area = (base*altura)/2;
		
		return area;
	}

}
