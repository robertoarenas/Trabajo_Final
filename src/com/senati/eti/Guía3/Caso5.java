package com.senati.eti.Gu�a3;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
				
		int[] arrNumero = new int[5];
		
		int num_menor = 0;
		
		System.out.println("REGISTRO DE N�MEROS");
		System.out.println("-------------------");
		
		for (int x = 0; x < arrNumero.length; x++ ) {
			System.out.print("Ingrese n�mero " + (x + 1) + ": ");
			arrNumero[x] = sc.nextInt();
			
			if (x == 0) {
				num_menor = arrNumero[0];	
			}
			else {
				
				if (arrNumero[x] < num_menor) num_menor = arrNumero[x]; 
			}
			
		}
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("N�mero menor.....: " + num_menor);

	}

}