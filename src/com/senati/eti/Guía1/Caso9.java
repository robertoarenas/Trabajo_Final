package com.senati.eti.Gu�a1;

import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int base, altura, perimetro, area;
		
		System.out.print("Ingresar lado 1: ");
		base= sc.nextInt();
		
		System.out.print("Ingresar lado 2: ");
		altura= sc.nextInt();
		
		perimetro=2* (base + altura);
		area= base * altura;
		
		System.out.println("El �rea es........: " + area);
		System.out.println("El per�metro es...: " + perimetro);
		
		



	}

}