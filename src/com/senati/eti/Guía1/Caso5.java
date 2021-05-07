package com.senati.eti.Guía1;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		float num1= 0, num2= 0;
		
		System.out.print("Primer número....: ");
		num1= sc.nextFloat();
		
		System.out.print("Segundo número...: ");
		num2= sc.nextFloat();
		
		float promedio = (num1 + num2) / 2;
		float aumento = (float) (num1+(num1 * 0.2));
		float disminucion=(float)(num2-(num2*0.3));
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Resultado1..............: " + promedio);
		System.out.println("Resultado2..............: " + aumento);
		System.out.println("Resultado3..............: " + disminucion);

	}

}