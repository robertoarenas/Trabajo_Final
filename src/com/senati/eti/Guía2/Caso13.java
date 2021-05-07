package com.senati.eti.Guía2;

import java.util.Scanner;

public class Caso13{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primer numero : ");
		int num1 = sc.nextInt();
		System.out.print("Segundo numero: ");
		int num2 = sc.nextInt();
		System.out.print("Operacion[1-6]: ");
		int op = sc.nextInt();
		
		String operacion = "";
		float resultado = 0;
		
		switch (op) {
		case 1:
			operacion = "Suma";
			resultado = num1 + num2;
			break;
		case 2:
			operacion = "Resta";
			resultado = num1 - num2;
			break;
		case 3:
			operacion = "Multiplicacion";
			resultado = num1 * num2;
			break;
		case 4:
			if (num2 != 0) {
				operacion = "Division";
				resultado = num1 / num2;
			}else
				operacion = "No es posible hallar la division";
			break;
		case 5:
			if (num2 != 0) {
				operacion ="Resto entero";
				resultado = num1 % num2;
			}else
				operacion = "No es posible hallar el resto entero";
			break;
			
		case 6:
			operacion = "Promedio";
			resultado = (num1+num2)/2;
			break;
						
		}
		System.out.println("\nResultados");
		System.out.println("--------------------");
		System.out.println("Numero  1: "+num1);
		System.out.println("Numero  2: "+num2);
		System.out.println("Operacion: "+operacion);
		System.out.println("Resultado: "+resultado);

	}

}