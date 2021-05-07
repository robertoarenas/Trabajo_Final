package com.senati.eti.Cajero;
import java.util.Scanner;
public class Cajero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String contraseña="", rpta="Si";
		int saldo_inicial = 20000;
		int deposito, retiro;
		int intentos = 0, continuar =0, i=0, tran=0,ntran=0;
		boolean salir = false;
		int saldo_actual, clave, opcion=0;
		int ope [] = new int[5];
		
		
		while (rpta.equals("Si")) {
		
			System.out.println("------------------");
			System.out.println("BIENVENIDO CLIENTE");
			System.out.println("------------------");
		
			System.out.print("\nDigite su número de tarjeta: ");
			clave = sc.nextInt();
			if (clave==12345) {
				System.out.println("Usuario: Roberto");
			System.out.print("Digite su contraseña: ");
			contraseña = sc.next();
			intentos++;
			}
			else {
				System.out.println("Usuario no registrado");
			}
			if(clave==12345 && contraseña.equals("holamundo")) {
					while(!salir) {
						System.out.println("");
						System.out.println("---------------------------------");
						System.out.println("BIENVENIDO A SU CAJERO AUTOMATICO");
						System.out.println("---------------------------------");
						System.out.println("");
						System.out.println("Digite una opción");
						System.out.println("");
						System.out.println("1.- Depositar ");
						System.out.println("2.- Retirar");
						System.out.println("3.- Consultar Saldo");
						System.out.println("4.- Transferencias");
						System.out.println("5.- Cambiar Clave");
						System.out.println("6.- Salir");
						System.out.println("");
						System.out.print("Digite una opcion: ");
						opcion = sc.nextInt();
						
						switch(opcion){
						case 1:
							System.out.println("");
							System.out.print("Digite la cantidad que desee depositar: ");
							deposito= sc.nextInt();
							saldo_actual = saldo_inicial + deposito;
							System.out.println("Su saldo actual es: " + saldo_actual);
							System.out.println("Depositaste: " + deposito);
							saldo_inicial = saldo_actual;
							break;
						case 2:
							System.out.println("");
							System.out.print("Digite la cantidad que desea retirar: ");
							retiro = sc.nextInt();
							if (retiro>=1000) {
								System.out.println("Intente con un monto menor");
								System.out.print("Digite la cantidad que desea retirar: ");
								retiro = sc.nextInt();
								saldo_actual = saldo_inicial - retiro;
								saldo_inicial = saldo_actual;
								System.out.println("Retiraste: " + retiro);
							}
							else if (retiro > saldo_inicial) {
								System.out.println("Saldo insuficiente");
								
							}else {
								saldo_actual = saldo_inicial - retiro;
								saldo_inicial = saldo_actual;
								System.out.println("Retiraste: " + retiro);
								System.out.print("Su saldo actual es: " + saldo_inicial);
								
							}
							
							System.out.println("");
							break;
						case 3:
							System.out.println("");
							System.out.println("Su saldo actual es: " + saldo_inicial);
							System.out.println("");
							break;
							
						case 4:
							ope[i]=opcion;
			                System.out.print("Ingrese el valor que desea transferir: ");
			                    tran = sc.nextInt();
			                    if (tran <= saldo_inicial ){
			                        saldo_actual = saldo_inicial - tran;
			                        System.out.print("Digite el numero de cuenta al que desea transferir: ");
			                        ntran = sc.nextInt();
			                        System.out.println("Ud realizo una transaccion al numero de cuenta:  "+ntran+" por valor de "+tran);
			                        System.out.println("Su nuevo saldo es de "+saldo_actual);
			                 } else{
			                        System.out.println("Ud No tiene fondos suficientes para realizar esta transferencia , su saldo es de "+saldo_inicial);
			                    }
			                    break;
						case 5:	 
		                    System.out.print("Ingrese su nueva clave: ");
		                    clave = sc.nextInt();
		                    System.out.println("Su nueva clave es "+clave);
		                    break;
		                    
						case 6:
							salir = true;
							continuar = 1;
							System.out.println("");
							System.out.println("Gracias por venir a este cajero");
							break;
							
						default:
							System.out.println("");
							System.out.println("Opcion no disponible");
							System.out.println("");
						}
						

					}
					if(opcion != 6) {
						sc.nextLine();
						System.out.println("-------------------------------------");
						System.out.print("¿Desea realizar otra Operación? <S/N>: ");
						System.out.println("\n-------------------------------------");
						rpta=sc.nextLine();
					}else
						break;
				}
				
			if(intentos ==1) {
				System.out.println("");
				System.out.println("Usted tiene 2 intentos más");
			}
			if(intentos ==2) {
				System.out.println("");
				System.out.println("Usted tiene 1 intento más");
			}
			if(intentos == 3) {
				System.out.println("");
				System.out.println("Usted a intentado 3 veces, verifique su contraseña");
				break;
			}
			
		}	
		


	}

}