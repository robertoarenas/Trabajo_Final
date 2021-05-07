package com.senati.eti.Guía1;

import java.util.Scanner;

public class Caso18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int base, altura, area;
		
		System.out.print("Ingrese la base del triángulo: ");
		base= sc.nextInt();
		
		System.out.print("Ingrese la altura del triángulo: ");
		altura= sc.nextInt();
		
		area= (int)(base*altura)/2;
		
		System.out.println("El área del triángulo es: " + area);

	}

}