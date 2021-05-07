package com.senati.eti.Guía1;

import java.util.Scanner;

public class Caso21 {

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		
		float g= 0;
		
		System.out.print("Gasto....: ");
		g= sc.nextFloat();
		
		float disminucion = (float)(g * 0.12);
		float total= g - disminucion ;
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Valor disminuido en 12%.............: " + total);

	}

}