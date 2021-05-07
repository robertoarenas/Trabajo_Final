package com.senati.eti.Guía2;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nota[1-20]: ");
		int nota = sc.nextInt();
		
		if (nota >= 0 && nota <= 7)
			System.out.println("Sin palabras");
		else if(nota >= 8 && nota <= 10)
			System.out.println("Malo");
		else if(nota <=11 && nota <= 14)
			System.out.println("Regular");
		else if(nota >= 15 && nota <= 17)
			System.out.println("Notable");
		else if(nota >=18 && nota <= 20)
			System.out.println("Excelente");
		else
			System.out.println("Introduzca un numero entre [1-20]");
			
	}

}
