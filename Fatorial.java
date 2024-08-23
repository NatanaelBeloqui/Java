import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        System.out.println("O fatorial desse número é: ");
        int fatorial = 1;
        for (int i = numero; i > 0; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            }
            fatorial = fatorial * i;
        }
        System.out.print(" = " + fatorial);
        scanner.close();
    }
}
