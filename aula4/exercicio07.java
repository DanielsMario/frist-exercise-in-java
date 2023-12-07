package aula4;

public class exercicio07 {
    public static void main(String[] args) {
        String[] arrayPalavras = {"a", "vida", "é", "bela"};
        String textoFormatado = formatarTexto(arrayPalavras);
        System.out.println(textoFormatado);
    }
    private static String formatarTexto(String[] palavras) {
        StringBuilder textoFormatado = new StringBuilder();

        for (String palavra : palavras) {
            if (!palavra.isEmpty()) {
                palavra = palavra.substring(0, 1).toUpperCase() + palavra.substring(1).toLowerCase();
                textoFormatado.append(palavra).append(" ");
            }
        }
        if (textoFormatado.length() > 0) {
            textoFormatado.setLength(textoFormatado.length() - 1);
        }

        return textoFormatado.toString();
    }
}
