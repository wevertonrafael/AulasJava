package Aula02;

import java.util.Scanner;

public class Atv01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o primeiro número: ");
		int num1 =  entrada.nextInt();
		
		System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        int num3 = entrada.nextInt();
		
        int maior; 
        
        if (num1 > num2 && num1 > num3) {
            maior = num1;
        } else if (num2 > num1 && num2 > num3) {
            maior = num2;
        } else {
            maior = num3;
        }

       
        System.out.println("O maior número é: " + maior);

        entrada.close();

        
        
	}

}
