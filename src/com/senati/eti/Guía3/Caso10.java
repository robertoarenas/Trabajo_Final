package com.senati.eti.Guía3;

import java.util.Scanner;

public class Caso10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String empleado="",rpta="S",nsnmayor="",nsnmenor="",nmt="";
		float ht=0,th=0,mt=0,sb=0,bono=0,dscto=0,sn=0,snmenor=10000,alcanzado=0,snmayor=0,mnt=0;
		int re=0,e=0;
		while (rpta.equals("S") || rpta.equals("s")) {
			re++;
			System.out.println("***********************************");
			System.out.println("Registo de empleados ("+re+"): ");
			System.out.println("***********************************");
			
			System.out.print("Empelado.............: ");
			empleado = sc.nextLine();
			System.out.print("Horas trabajados.....: ");
			ht = sc.nextFloat();
			System.out.print("Tarifa por hora......: ");
			th = sc.nextFloat();
			System.out.print("Minutos de tardanza..: ");
			mt = sc.nextFloat();
			
			sb=ht*th;
			//Calcular el bono
			if (ht <= 50)
				bono = 0;
			else if(ht > 50 && ht <= 60)
				bono = sb * 0.02f;
			else if(ht > 60 && ht <= 70)
				bono= sb * 0.08f;
			else if(ht > 70 && ht <= 80)
				bono= sb * 0.13f;
			else if(ht > 80)
				bono= sb * 0.15f;
			
			//Calcular el descuento
			if (mt <= 15)
				dscto = 0;
			else if(mt > 15 && mt <= 30)
				dscto= (sb * 0.003f) * mt;
			else if(mt > 30)
				dscto= (sb * 0.005f) * mt;
			
			sn=(sb+bono)-dscto;
				
			alcanzado = ht/80 * 100;
			//Calcular el sueldo neto mayor y menor y a quien pertenece
			if(sn > snmayor) {
				snmayor=sn;
				nsnmayor=empleado;
			}
			if(sn < snmenor) {
				snmenor=sn;
				nsnmenor=empleado;
			}
			//Calcular el empleado con más minutos de tardanza
			if (mt>mnt)	{
				mnt=mt;
			    nmt=empleado;
			}
			 //Calcular empleados con más del 90% de la meta
			if (alcanzado>90) {
				 e++; 
			}
				
			  
			System.out.println("****************");
			System.out.println("   Resultados   ");
			System.out.println("****************");
			System.out.println("Sueldo bruto.....: "+sb);
			System.out.println("Bonificación.....: "+bono);
			System.out.println("Descuento........: "+dscto);
			System.out.println("Sueldo neto......: "+sn);
			System.out.println("% Alcanzado......: "+alcanzado+"%");
			
			sc.nextLine();
			
			System.out.println("****************");
			System.out.print("¿Registrar otro? <S/N>: ");
			rpta=sc.nextLine();
		}
		System.out.println("-------------------");
		System.out.println("---R E S U M E N---");
		System.out.println("-------------------");
		System.out.println("Número de empleados..................................: "+re);
		System.out.println("Sueldo neto mayor....................................: "+snmayor+" pertenece a: "+nsnmayor);
		System.out.println("Sueldo neto menor....................................: "+snmenor+" pertenece a: "+nsnmenor);
		System.out.println("Empleado con la mayor cantidad de minutos de tardanza: "+nmt+" ("+mnt+" min.)");
		System.out.println("Cantidad de empleados con más del 90% de la meta.....: "+e);
	
		
		

	}

}