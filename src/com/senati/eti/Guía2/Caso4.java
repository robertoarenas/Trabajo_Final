package com.senati.eti.Guía2;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primer número....: ");
		int n1= sc.nextInt();
		System.out.print("Segundo número...: ");
		int n2= sc.nextInt();
		System.out.print("Tercer número....: ");
		int n3= sc.nextInt();
		System.out.print("Cuarto número....: ");
		int n4= sc.nextInt();
		
		String r="";
		
		if (n1 == n2 && n2==n3 && n3==n4)
			r = "Los números son iguales";
		else
			if (n1 < n2 && n1<n3 && n1<n4)
				r = "El primer número es menor";
			else if (n2<n1 && n2<n3 && n2<n4)
				r="El segundo número es menor";
			else if (n3<n1 && n3<n2 && n3<n4)
				r="El tercer número es menor";
			else
				r= "El cuarto número es menor";
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Respuesta....:" + r);
		
			
		
		
			

	}

}