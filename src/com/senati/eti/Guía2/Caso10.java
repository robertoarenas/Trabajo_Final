package com.senati.eti.Guía2;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nombre del trabajador: ");
		String empleado = sc.nextLine();
		System.out.print("Horas trabajados: ");
		float ht = sc.nextFloat();
		System.out.print("Tarifa por hora: ");
		float th = sc.nextFloat();
		System.out.print("Minutos de tardanza: ");
		float mt = sc.nextFloat();
		
		float importe = ht * th;
		float bono = 0;
		float dscto = 0;
		float alcanzado = 0;
		
		if (ht >= 60)
			bono = importe * 0.13f;
		else
			bono = importe * 0.04f;
		
		if (mt >= 15)
			dscto = importe *0.03f;
		else
			dscto = 0;
		
		alcanzado = ht/70 * 100;
		
		System.out.println("Resultados");
		System.out.println("-----------------");
		System.out.println("Trabajador: "+ empleado.toUpperCase());
		System.out.println("Horas trabajadas: "+ht);
		System.out.println("Tarifa por horas: "+th);
		System.out.println("Importe: " + importe);
		System.out.println("Bono: "+bono);
		System.out.println("Descuento: "+dscto);
		System.out.println("Meta alcanzada: " + alcanzado+"%");
		
	}

}
