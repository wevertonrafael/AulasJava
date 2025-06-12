package Aula03;

import java.util.Scanner;

public class Atv01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in); 
		System.out.print("Quantos alunos tem na sala:? ");
		int quantidadesAlunos = entrada.nextInt();
				
		int contador = 0;
		double somaNotas = 0; 
		
		while (contador < quantidadesAlunos) {
            System.out.print("Digite a nota do aluno " + (contador + 1) + ": ");
            double nota = entrada.nextDouble();
            somaNotas += nota;
            contador++;
            
        }
		
		double media = somaNotas / quantidadesAlunos;

        System.out.println("A média da turma é: " + media);

        entrada.close();

	}

}
