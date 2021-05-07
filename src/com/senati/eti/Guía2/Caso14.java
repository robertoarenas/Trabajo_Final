package com.senati.eti.Guía2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Alumno: ");
		String alumno = sc.nextLine();
		System.out.print("Carrera [DS-RC-DG]: ");
		String carrera = sc.nextLine();
		System.out.print("Turno [M-T-N]: ");
		String turno = sc.nextLine();
		
		String t = "";
		int monto = 0;
		float dscto = 0;
		
		switch(carrera) {
		case "DS":
			monto = 1500;
			break;
		case "RC":
			monto = 1400;
			break;
		case "DG":
			monto = 1300;
			break;
		}
		switch(turno){
		case "M":
			dscto = monto * 0.1f;
			t = "Mañana";
			break;
		case "T":
			dscto = monto * 0.2f;
			t = "Tarde";
			break;
		case "N":
			dscto = monto * 0.15f;
			t = "Noche";
			break;
		}
			
			
		System.out.println("\nResultados");
		System.out.println("Monto: "+monto);
		System.out.println("Turno: "+t);
		System.out.println("Descuento: "+dscto);
		System.out.println("Total a pagar: "+df.format((monto-dscto)/3.33f) + "U$");
	}

}