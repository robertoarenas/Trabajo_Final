package com.senati.eti.Guía1;

import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		int n=sc.nextInt();
		
		int r=(n*(n+1))/2;
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Sumatoria........: " + r);

	}

}

