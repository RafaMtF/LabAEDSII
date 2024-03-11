import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equals("FIM")) {
            System.out.println(trocaLetras(input));
            input = sc.nextLine();
        }
    }

    public static String trocaLetras(String input) {
        Random random = new Random(4);
        char oldChar = (char) (random.nextInt(26) + 'a');
        char newChar = (char) (random.nextInt(26) + 'a');
        String newInput = input.replace(oldChar, newChar);
        if (newInput.indexOf(oldChar) != -1) {
            return trocaLetras(newInput);
        } else {
            return newInput;
        }
    }
}