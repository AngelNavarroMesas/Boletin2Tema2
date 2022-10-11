package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String carnet;
		
		System.out.println("Introduzca su carnet de conducir");
		carnet = sc.next();
		
		switch(carnet) {
		case "E": System.out.println("Este carnet corresponde a remolques");
			break;
		case "D":
			break;
		case "C1":
			break;
		case "C2":
			break;
		case "C3":
			break;
		case "C4":
			break;
		case "C5":
			break;
		case "cuatro":
			break;
		case "cinco":
			break;
		case "seis":
			break;
		}
		
		sc.close();
	}

}
