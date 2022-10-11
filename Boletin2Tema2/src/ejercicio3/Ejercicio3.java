package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1, num2;
		int operacion;
		
		System.out.println("Introduzca dos numeros");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		
		System.out.println("[1] SUMAR LOS NUMEROS");
		System.out.println("[2] RESTAR LOS NUMEROS");
		System.out.println("[3] MULTIPLICAR LOS NUMEROS");
		System.out.println("[4] DIVIDIR LOS NUMEROS");
		operacion = sc.nextInt();
		
		switch(operacion) {
		case 1: System.out.println(num1 + "+"+num2+"="+(num1+num2));
			break;
		case 2: System.out.println(num1 + "-"+num2+"="+(num1-num2));
			break;
		case 3: System.out.println(num1 + "*"+num2+"="+(num1*num2));
			break;
		case 4: System.out.println(num1 + "/"+num2+"="+(num1/num2));
			break;
		default: System.out.println("Elija una de las 4 opciones");
			break;
		}
		
		sc.close();
	}

}
