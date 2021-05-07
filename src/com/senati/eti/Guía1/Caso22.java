package com.senati.eti.Guía1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Nombre del Alumno: ");
		String nombre = sc.nextLine();
		
		System.out.print("Nota 1: ");
		float n1 = sc.nextFloat();
		System.out.print("Nota 2: ");
		float n2 = sc.nextFloat();
		System.out.print("Nota 3: ");
		float n3 = sc.nextFloat();
		
		float r1 = (float)(n1 * 0.20);
		float r2 = (float)(n2 * 0.30);
		float r3 = (float)(n3 * 0.50);
		
		float promedio = r1 + r2 + r3 / 3;
		
		System.out.println("\nResultados");
		System.out.println("Alumno    :" + nombre.toUpperCase());
		System.out.println("Promedio  :" + df.format(promedio));
		
		
	}

}