package com.senati.eti.Guía1;

import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Ingrese nombre.....: ");
		String nombre=sc.nextLine();
		System.out.print("Ingrese apellido...: ");
		String apellido=sc.nextLine();
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Alumno....: " + nombre.toUpperCase()+" "+apellido.toUpperCase());

	}

}
