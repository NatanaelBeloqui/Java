import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":" + "\n");
            for (int j=0; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i*j + "");
            }
        System.out.println("\n");
        }
        scanner.close();
    }
}