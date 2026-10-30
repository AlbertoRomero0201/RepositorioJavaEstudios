/*
 * Objetivo:
 * Nombre: Alberto Romero Meléndez
 * Fecha:29/10/2026
 * 
 */


package Romero;

import java.util.Scanner;

public class Alberto2 {
	
	public static void main(String[] args) {
		
		//definimos variables
		int NumeroN, NumeroM, NumeroMayor, NumeroMenor;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("encontremos divisores de tanto 7 como 13!");	
		
		//pedimos dos numeros asegurandonos de que son distintos y los almacenamos en dos variables distintas.
		do {
		System.out.print("Introduzca un primer numero: ");
		NumeroN = scanner.nextInt();
		System.out.print("Introduzca un segundo numero: ");
		NumeroM = scanner.nextInt();
		}while(NumeroN == NumeroM);
		
		//comprobamos cual de los numeros es mayor y los almacenamos en otras variables para realizar los calculos.
		if (NumeroN > NumeroM) {
			NumeroMayor = NumeroN;
			NumeroMenor = NumeroM;
		}else {
			NumeroMayor = NumeroM;
			NumeroMenor = NumeroN;
		}
		
		//utilizamos un bucle y dos condiciones que se deben cumplir para determinar que son multiplos de ambos, imprimiendolos posteriormente.
		for(int i = NumeroMenor; i <= NumeroMayor; i++) {
			if ((i % 7) == 0 && (i % 13) == 0) {
				System.out.println(i + " es multiplo de 7 y 13");
				
			}
			
			
		}
		scanner.close();
	}

}
