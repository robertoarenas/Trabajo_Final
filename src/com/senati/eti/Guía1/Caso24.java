package com.senati.eti.Guía1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Primero monto: ");
		float n1 = sc.nextFloat();
		System.out.print("Segundo monto: ");
		float n2 = sc.nextFloat();
		System.out.print("Tercer monto : ");
		float n3 = sc.nextFloat();
		
		float f1 = (n1 / 5) + (n2 * 0.2f);
		float f2 = (n3+(n3 * 0.6f)) / 2;
		float f3 = (n1 + n2 + n3)* 0.08f;
		
		System.out.println("\nResultados");
		System.out.println("Primero: " + df.format(f1));
		System.out.println("Segundo: " + df.format(f2));
		System.out.println("Tercero: " + df.format(f3));
	}

}