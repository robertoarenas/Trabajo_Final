package com.senati.eti.Gu�a1;

import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int base, altura1,altura2, perimetro;
		
		System.out.print("Ingresar base: ");
		base= sc.nextInt();
		
		System.out.print("Ingresar altura1: ");
		altura1= sc.nextInt();
		
		System.out.print("Ingresar altura2: ");
		altura2= sc.nextInt();
		
		perimetro=base + altura1+altura2;
		
		System.out.println("El per�metro del tri�ngulo es...: " + perimetro);
		
	}

}