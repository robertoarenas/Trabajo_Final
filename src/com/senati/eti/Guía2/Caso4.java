package com.senati.eti.Gu�a2;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primer n�mero....: ");
		int n1= sc.nextInt();
		System.out.print("Segundo n�mero...: ");
		int n2= sc.nextInt();
		System.out.print("Tercer n�mero....: ");
		int n3= sc.nextInt();
		System.out.print("Cuarto n�mero....: ");
		int n4= sc.nextInt();
		
		String r="";
		
		if (n1 == n2 && n2==n3 && n3==n4)
			r = "Los n�meros son iguales";
		else
			if (n1 < n2 && n1<n3 && n1<n4)
				r = "El primer n�mero es menor";
			else if (n2<n1 && n2<n3 && n2<n4)
				r="El segundo n�mero es menor";
			else if (n3<n1 && n3<n2 && n3<n4)
				r="El tercer n�mero es menor";
			else
				r= "El cuarto n�mero es menor";
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Respuesta....:" + r);
		
			
		
		
			

	}

}