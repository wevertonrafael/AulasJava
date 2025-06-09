package Aula02;

import java.util.Scanner;

public class atv06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contador = 0; 
		
		System.out.print("Telefonou para a vítima?:  ");
		String resposta1 = entrada.next();
		if(resposta1.equalsIgnoreCase("SIM")) {
			contador++;
		}
		
		System.out.print("Esteve no local do crime?: ");
		String resposta2 = entrada.next();
		if (resposta2.equalsIgnoreCase("SIM")) {
			contador++;
		}
		
		System.out.print("Mora perto da vítima?: ");
		String resposta3 = entrada.next();
		if (resposta3.equalsIgnoreCase("SIM")) {
			contador++;
		}
		
		System.out.print("Devia para a vítima?: ");
		String resposta4 = entrada.next(); 
		if (resposta4.equalsIgnoreCase("SIM")) {
			contador++;
		}
		
		System.out.print("Já trabalhou com a vítima?: ");
		String resposta5 = entrada.next(); 
		if (resposta5.equalsIgnoreCase("SIM")) {
			contador++;
			
		}
		System.out.println(contador);
		if (contador==2) {
		System.out.print("Suspeito"); 
			
		}else if  (contador==3||contador==4) {
		System.out.print("Cúmplice"); 
			
		}else if  (contador==5) {
		System.out.print("Assasino");
		
		} else {
			System.out.println("Inocente");
		}
		
		
		
		
		
		

	}

}
