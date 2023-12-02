package atvSomaMultiplos;

public class atvSomaMultiplos {
    public static void main(String[] args) {
        int somaMultiplos3 = 0;
        int somaMultiplos5 = 0;
    	int limite = 20;
        int somaTotal = 0;

        for (int i = 1; i <= limite; i++) {
            if (i % 3 == 0) {
                somaMultiplos3 += i;
            }
            if (i % 5 == 0) {
                somaMultiplos5 += i;
            }
        }

        somaTotal = somaMultiplos3 + somaMultiplos5;

        System.out.println("A soma dos multiplos de 3: " + somaMultiplos3);
        System.out.println("ASoma dos multiplos de 5: " + somaMultiplos5);
        System.out.println("O total das somas é: " + somaTotal);
    }
}