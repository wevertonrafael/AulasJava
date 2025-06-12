package Aula03;

import java.util.Scanner;

public class Exemplo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner entrada = new Scanner(System.in);
		        
		  System.out.print("Quantos alunos tem na sala? ");
		  int quantidadeAlunos = entrada.nextInt();
		        
		  double somaNotas = 0;

		  for (int i = 1; i <= quantidadeAlunos; i++) {
		  System.out.print("Digite a nota do aluno " + i + ": ");
		  double nota = entrada.nextDouble();
		  somaNotas += nota;
		        }

		  double media = somaNotas / quantidadeAlunos;
		  System.out.println("A média da turma é: " + media);

		  entrada.close();
		     
		    }
		

   

	}



	


