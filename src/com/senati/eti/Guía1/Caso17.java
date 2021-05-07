package com.senati.eti.Gu�a1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso17 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		
		System.out.print("N�mero de aprobados.....: ");
		float na=sc.nextFloat();
		System.out.print("N�mero de desaprobados..: ");
		float nd=sc.nextFloat();
		System.out.print("N�mero de retirados.....: ");
		float nr=sc.nextFloat();
		
		float total=na+nd+nr;
		
		float p_na=na/total*100;
		float p_nd=nd/total*100;
		float p_nr=nr/total*100;
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Aprobados......: " + df.format(p_na)+"%");
		System.out.println("Desaprobados...: " + df.format(p_nd)+"%");
		System.out.println("Retirados......: " + df.format(p_nr)+"%");
		

	}

}
