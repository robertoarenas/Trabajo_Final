package com.senati.eti.Guía1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese horas trabajadas...: ");
		int horas = sc.nextInt();
		
		System.out.print("Ingese tarifa por hora.....: ");
		float tarifa = sc.nextFloat();
		
		float sueldo = horas * tarifa;
		float bono = (float) 5/100 * sueldo;
		float total = sueldo + bono;
		float dolares = (float) (total / 3.24);
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Sueldo...............: " + df.format(sueldo));
		System.out.println("Bono.................: " + df.format(bono));
		System.out.println("Total................: " + df.format(total));
		System.out.println("Total en dólares.....: " + df.format(dolares));

	}

}