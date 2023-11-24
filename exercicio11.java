package fundamentos;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		System.out.println("Digite um  numero de 1 a 7:");
		int numero = entrada.nextInt();
		
		if (numero==1){
			System.out.println("DOMINGO");
			
		} else if (numero==2) {
			System.out.println("SEGUNDA");
			
		} else if (numero==3) {
			System.out.println("TERÇA");
			
		} else if (numero==4) {
			System.out.println("QUARTA");
			
		} else if (numero==5) {
			System.out.println("QUINTA");
			
		} else if (numero==6) {
			System.out.println("SEXTA");
			
		} else if (numero==7) {
			System.out.println("SÁBADO");
			
		}else {
				System.out.println("Numero invalido, digite um numero entre 1 é 7");
			}
    
	}

}