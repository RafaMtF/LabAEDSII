import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equals("FIM")) {
            if (isPalindromo(input)) {
                System.out.println("SIM");
            } else {
                System.out.println("NAO");
            }
            input = sc.nextLine();
        }
    }

    public static boolean isPalindromo(String input) {
        if (input.length() <= 1) {
            return true;
        } else if (input.charAt(0) != input.charAt(input.length() - 1)) {
            return false;
        } else {
            return isPalindromo(input.substring(1, input.length() - 1));
        }
    }
}