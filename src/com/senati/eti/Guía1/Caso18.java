package com.senati.eti.Gu�a1;

import java.util.Scanner;

public class Caso18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int base, altura, area;
		
		System.out.print("Ingrese la base del tri�ngulo: ");
		base= sc.nextInt();
		
		System.out.print("Ingrese la altura del tri�ngulo: ");
		altura= sc.nextInt();
		
		area= (int)(base*altura)/2;
		
		System.out.println("El �rea del tri�ngulo es: " + area);

	}

}