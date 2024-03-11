import java.util.Scanner;

public class CiframentoDeCesar {
    private static final int SHIFT_AMOUNT = 3;

    public static String cifrar(String mensagem) {
        return cifrarRecursivo(mensagem, 0, new StringBuilder());
    }

    private static String cifrarRecursivo(String mensagem, int index, StringBuilder cifrada) {
        if (index == mensagem.length()) {
            return cifrada.toString();
        }

        char atual = mensagem.charAt(index);

        if (Character.isUpperCase(atual)) {
            char cifrado = (char) (((atual - 'A' + SHIFT_AMOUNT) % 26) + 'A');
            cifrada.append(cifrado);
        } else if (Character.isLowerCase(atual)) {
            char cifrado = (char) (((atual - 'a' + SHIFT_AMOUNT) % 26) + 'a');
            cifrada.append(cifrado);
        } else if (atual == ' ') {
            cifrada.append('#');
        } else {
            cifrada.append(atual);
        }

        return cifrarRecursivo(mensagem, index + 1, cifrada);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String mensagem = scanner.nextLine();

            while (!mensagem.equals("FIM")) {
                String mensagemCifrada = cifrar(mensagem);
                System.out.println(mensagemCifrada);
                mensagem = scanner.nextLine();
            }
        }
    }
}