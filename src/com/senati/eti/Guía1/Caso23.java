package com.senati.eti.Guía1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese nombre del producto: ");
		String nombre = sc.nextLine();
		System.out.print("Cantidad a llevar..........: ");
		int cantidad = sc.nextInt();
		System.out.print("Precio del producto........: ");
		float precio = sc.nextFloat();
		
		float importe = precio * cantidad;
		float IGV = importe * 0.18f;
		float dscto = importe * 0.03f;
		float total = importe + IGV + dscto;
		
		System.out.println("\nResultados: ");
		System.out.println("Producto    : " + nombre.toUpperCase());
		System.out.println("Pago        : " + df.format(importe));
		System.out.println("IGV         : " + df.format(IGV));
		System.out.println("Descuento   : " + dscto);
		System.out.println("Total       : " + df.format(total));

	}

}