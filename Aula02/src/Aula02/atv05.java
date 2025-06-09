package Aula02;

import java.util.Scanner;

public class atv05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite F ou M: ");
		
		char letra = entrada.next().charAt(0);
		
		if (letra == 'F') {
		System.out.print("Feminino: ");
		
		} else if (letra == 'M') {
			System.out.print("Masculino");
		} else {
			System.out.print("Inválido: ");
		}
		

}
}