package Aula02;

import java.util.Scanner;

public class atv03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um número de 1 a 7: ");
		int dia = entrada.nextInt(); 
		
		if (dia == 1) {
            System.out.print("Domingo");
            
		} else if (dia == 2) {
			System.out.print("Segunda-feira");
			
		} else if (dia == 3) {
			System.out.print("Terça-feira");
			
		} else if (dia == 4) {
			System.out.print("Quarta-feira");
			
		} else if (dia == 5) {
			System.out.print("Quinta-feira");
			
		} else if (dia == 6) {
			System.out.print("Sexta-feira");
			
			
		} else if (dia == 7) {
			System.out.print("Sabádo");
			
		} else {
			System.out.print("Valor Inválido");
			
		entrada.close();
			
		}
		
		
	}

}
