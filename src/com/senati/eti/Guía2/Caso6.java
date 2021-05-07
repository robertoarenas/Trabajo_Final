package com.senati.eti.Guía2;

import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese sueldo: ");
		float sueldo = sc.nextFloat();
		
		if (sueldo >= 2800)
			System.out.println("Impuesto Calculado: "+(sueldo*0.05));
		else
			System.out.println("Impuesto Calculado: "+(sueldo*0.02));

	}

}