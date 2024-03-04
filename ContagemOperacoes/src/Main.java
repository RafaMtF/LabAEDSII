public class Main {
    public static void main(String[] args) {
        for (int i = 500; i <= 5000; i += 500){
            Bx2(i);
            Ax3(i);
        }
    }

    private static void Ax3(int n) {
        long inicio = System.nanoTime();
        int cont = 0;
        int b = 1;
        for (int i = n + 1; i > 0; i /= 2) {
            b *= 3;
            cont++;
        }
        long fim = System.nanoTime();
        long tempo = fim - inicio;
        System.out.printf("Ex. 2:\nOperações: %d\nTempo: %d\n\n", cont, tempo);
    }

    public static void Bx2(int n) {
        long inicio = System.nanoTime();
        int cont = 0;
        int b = 1;
        for (int i = 0; i <= n; i++) {
            b *= 3;
            cont++;
        }
        long fim = System.nanoTime();
        long tempo = fim - inicio;
        System.out.printf("Ex. 1:\nOperações: %d\nTempo: %d\n\n", cont, tempo);
    }
}
