package com.senati.eti.Gu�a3;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Ingresa un n�mero: ");
		
		int numero = sc.nextInt();
		
		int factorial = 1;
		
		while(numero!=0 && numero<=7) {
			factorial*=numero;
			numero --;
		}
		if(numero>7)
			System.out.println("El n�mero es superior de 7");
		else
			System.out.println("El factorial es: " + factorial);
	}
}
