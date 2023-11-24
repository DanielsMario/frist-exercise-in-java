package fundamentos;
import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	System.out.println("Digite um número: ");
	double resp = entrada.nextDouble();
	
	if (resp==0) {
		System.out.println("O Numero é neutro.");
	}
	else if (resp<0) {
		System.out.println("Numero Negativo!");
	}

	
	else {
		System.out.println("Numero Positivo.");
	}

	}

}
