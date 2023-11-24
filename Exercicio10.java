package fundamentos;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner (System.in);
		System.out.println("Digite um numero:");
		float resp1 = entrada.nextFloat();
		
		System.out.println("Digite um numero:");
		float resp2 = entrada.nextFloat();
		
		System.out.println("Digite um numero:");
		float resp3 = entrada.nextFloat();
		
		
		        float menor = resp1;

		        if (resp2 < menor) {
		            menor = resp2;
		        }

		        if (resp3 < menor) {
		            menor = resp3;
		        }

		        float maior = resp1;

		        if (resp2 > maior) {
		            maior = resp2;
		        }

		        if (resp3 > maior) {
		            maior = resp3;
		        }

		        System.out.println("O menor número é: " + menor);
		        System.out.println("O maior número é: " + maior);

		        entrada.close();
	}
}