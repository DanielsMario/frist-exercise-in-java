package fundamentos;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		System.out.println("Digite o Sexo do individuo: ");
		char Sexo = entrada.nextLine() .charAt(0);
		
		if (Sexo == 'H'){
		System.out.println("É HOMEM.");
		} if (Sexo =='M') {
		System.out.println("É MULHER.");
		}
		else
			System.out.println("Letra invalida, Digite M ou F0");
	}

}
