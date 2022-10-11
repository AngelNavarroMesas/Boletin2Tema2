package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String dado1, dado2;
		int suma=0;
		
		System.out.println("Introduzca el resultado de la primera tirada");
		dado1 = sc.next();
		
		switch(dado1) {
			case "uno": suma=1;
				break;
			case "dos": suma=2;
				break;
			case "tres": suma=3;
				break;
			case "cuatro": suma=4;
				break;
			case "cinco": suma=5;
				break;
			case "seis": suma=6;
				break;
			default: System.out.println("Introduzca un numero entre el uno y el seis");
				break;
		}
		
		System.out.println("Introduzca el resultado de la segunda tirada");
		dado2 = sc.next();
		
		switch(dado2) {
			case "uno": suma+=1;
				break;
			case "dos": suma+=2;
				break;
			case "tres": suma+=3;
				break;
			case "cuatro": suma+=4;
				break;
			case "cinco": suma+=5;
				break;
			case "seis": suma+=6;
				break;
			default: System.out.println("Introduzca un numero entre el uno y el seis");
				break;
		}
		
		System.out.println("La suma de las dos tiradas es " +suma);
		
		sc.close();
	}

}
