package com.senati.eti.Guía3;

import java.util.Scanner;

public class Caso9 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nombre="",rpta="S",estado="",nmyp="",nmnp="";
		int nota1=0,nota2=0,nota3=0,nal=0,nc=0,ns=0;
		float na=0,promedio=0,pa=0,menorp=100,mayorp=0;
		while (rpta.equals("S") || rpta.equals("s")) {
			nal++;
			System.out.println("----------------");
			System.out.println("REGISTRO "+nal+": ");
			System.out.println("----------------");
			
			System.out.print("Nombre...........:");
			nombre=sc.nextLine();
			System.out.print("Nota 1...........:");
			nota1=sc.nextInt();
			System.out.print("Nota 2...........:");
			nota2=sc.nextInt();
			System.out.print("Nota 3...........:");
			nota3=sc.nextInt();
			System.out.print("Asistencia [1-12]:");
			na=sc.nextFloat();
			
			promedio=nota1*0.2f+nota2*0.3f+nota3*0.5f;
			pa=na/12*100;
			
			if (promedio>=13 && pa>=70) {
				estado="Obtiene certificado";
			    nc++;
			}
			else {
				estado="Sin certificado";
				ns++;
			}
			
			if(promedio > mayorp) {
				mayorp=promedio;
				nmyp=nombre;
			}
			if(promedio < menorp) {
				menorp=promedio;
				nmnp=nombre;
			}
 
			  
			System.out.println("----------------");
			System.out.println("---Resultados---");
			System.out.println("----------------");
			System.out.println("Promedio.......: "+promedio);
			System.out.println("Asistencia.....: "+pa+"%");
			System.out.println("Estado.........:"+estado);
			
			sc.nextLine();
			
			System.out.println("----------------");
			System.out.print("¿Registrar otro? <S/N>: ");
			rpta=sc.nextLine();
		}
		System.out.println("-------------------");
		System.out.println("---R E S U M E N---");
		System.out.println("-------------------");
		System.out.println("Número de alumnos...................:"+nal);
		System.out.println("Mayor promedio......................:"+mayorp+" pertenece a: "+nmyp);
		System.out.println("Menor promedio......................:"+menorp+" pertenece a: "+nmnp );
		System.out.println("Número de alumnos certificados......:"+nc);
		System.out.println("Número de alumnos sin certificado...:"+ns);
	
		
		

	}

}
