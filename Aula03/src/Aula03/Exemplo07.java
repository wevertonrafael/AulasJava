package Aula03;

public class Exemplo07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma3=0, soma5=0, somatotal1=0; 
		for (int x = 1; x<=20;x++) {
			soma3+=x%3==0?x:0;
			soma5+=x%5==0?x:0;
			
			somatotal1=soma3+soma5;
			System.out.println(soma3+" "+ soma5 + " "+ somatotal1);
		}
		
		
		

	}

}
