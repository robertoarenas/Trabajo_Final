package com.senati.eti.Guía1;

import java.util.Scanner;

public class Caso20 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		float v= 0;
		
		System.out.print("Venta....: ");
		v= sc.nextFloat();
		
		float aumento = (float)(v * 0.42);
		float total= aumento + v;
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Valor incrementado en 42%..............: " + total);
		
		
	}

}