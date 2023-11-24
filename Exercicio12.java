package fundamentos;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		System.out.println("Digite a primeira nota");
		float nota1 = entrada.nextInt();
		System.out.println("Digite a primeira nota");
		float nota2 = entrada.nextInt();
				
		float calc = (nota1 + nota2) /2;
		System.out.println("A média do Aluno(a) é de: "+ calc);

		
	}

}
