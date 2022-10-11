package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Introduzca la nota del alumno");
		nota = sc.nextInt();
		
		switch(nota) {
			case 0-> System.out.println("Un "+nota+" es un insuficiente");
			case 1-> System.out.println("Un "+nota+" es un insuficiente");
			case 2-> System.out.println("Un "+nota+" es un insuficiente");
			case 3-> System.out.println("Un "+nota+" es un insuficiente");
			case 4-> System.out.println("Un "+nota+" es un insuficiente");
			case 5-> System.out.println("Un "+nota+" es un suficiente");
			case 6-> System.out.println("Un "+nota+" es un bien");
			case 7-> System.out.println("Un "+nota+" es un notable");
			case 8-> System.out.println("Un "+nota+" es un notable");
			case 9-> System.out.println("Un "+nota+" es un sobresaliente");
			case 10-> System.out.println("Un "+nota+" es un sobresaliente");
		}
		
		sc.close();

	}

}
