package Aula02;

import java.util.Scanner;

public class atv04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		float num1 = entrada.nextFloat(); 
		
		System.out.print("Digite a segunda nota: ");
		float num2 = entrada.nextFloat(); 
		
		float media = (num1 + num2) /2; 
		
		System.out.print("A média do aluno é: " + media);
		
		entrada.close();

	}

}
