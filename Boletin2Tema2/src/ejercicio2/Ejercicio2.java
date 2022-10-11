package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduzca un numero del 1 al 7");
		numero = sc.nextInt();
		
		switch(numero) {
			case 1-> System.out.println("Lunes");
			case 2-> System.out.println("Martes");
			case 3-> System.out.println("Miercoles");
			case 4-> System.out.println("Jueves");
			case 5-> System.out.println("Viernes");
			case 6-> System.out.println("Sabado");
			case 7-> System.out.println("Domingo");
			
		}
		
		sc.close();

	}

}
