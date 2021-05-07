package com.senati.eti.Guía2;

import java.util.Scanner;

public class Caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese Cliente: ");
		String cliente = sc.nextLine();
		System.out.print("Ingrese producto [TB,LT,MN,IM]: ");
		String producto = sc.nextLine();
		System.out.print("Ingrese cantidad: ");
		int cantidad = sc.nextInt();
		sc.nextLine();
		System.out.print("Forma de pago[C1-C2]: ");
		String formapago = sc.nextLine();
		
		int precio = 0;
		float dyi = 0;
		float dyi1 = 0;
		String dyi2 = "";
		
		switch (producto) {
		case "TB":
			precio = 350;
			producto = "Tablet";
			break;
		case "LT":
			precio = 2300;
			producto = "Laptop";
			break;
		case "MN":
			precio = 850;
			producto = "Monitor";
			break;
		case "IM":
			precio = 680;
			producto = "Impresora";
			break;
		}
		float importe = precio * cantidad;
		
		switch(formapago) {
		case "C1":
			dyi = importe * 0.05f;
			dyi1 = importe - dyi;
			dyi2 = "Descuento ";
			formapago = "Contado";
			break;
		case "C2":
			dyi = importe * 0.12f;
			dyi1 = importe + dyi;
			dyi2 = "Incremento";
			formapago = "Creditó";
		}
		
		
		System.out.println("\nCliente     : "+cliente.toUpperCase());
		System.out.println("Producto     : "+producto);
		System.out.println("Precio       : "+precio);
		System.out.println("Cantidad     : "+cantidad);
		System.out.println("Importe      : "+importe);
		System.out.println("Forma de pago: " + formapago);
		System.out.println(dyi2 + "   : " + dyi);
		System.out.println("Total a pagar: "+dyi1);

	}

}