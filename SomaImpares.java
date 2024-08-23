import java.util.Scanner;
public class SomaImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaTotal = 0;
        for (int i = 1; i <= 500; i++) {
            if ((i % 2 == 1) && (i % 7 == 0)) {
                somaTotal = somaTotal + i;
            }
        }
        System.out.println(somaTotal);
        scanner.close();
    }
}
