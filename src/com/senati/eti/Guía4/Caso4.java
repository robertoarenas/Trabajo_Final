package com.senati.eti.Guía4;
import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		Integer[] arrNumero = new Integer[5];
		int par = 0;
		int impar = 0;
		int promedio = 0;
	
	
		System.out.println("REGISTRO DE NUMEROS");
		System.out.println("-------------------");
		
		for (int x = 0; x < arrNumero.length; x++) {
			System.out.print("Numero " + (x + 1) + ": ");
			arrNumero[x] = sc.nextInt();
		}
		for (int x = 0; x < arrNumero.length; x++) {
			if (arrNumero[x] % 2 == 0) { 
				par = par + 1;
			} else {
				impar = impar + 1;
			}
			promedio += arrNumero[x];
		}
		System.out.println("-----------------");
		System.out.println("Resultados");
		System.out.println("-----------------");
		System.out.println("Numeros pares: " + par);
		System.out.println("Numeros impares: " + impar);
		System.out.println("Promedio de los numeros: " + promedio/5.0);
	}	
}