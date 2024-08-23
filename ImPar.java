import java.util.Scanner;
public class ImPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Digite um número: ");
            double numero = scanner.nextDouble();
            if (numero % 2 == 0) {
                System.out.println("O número é Par.");
            }
            else {
                System.out.println("O número é Ímpar.");
            }
        } catch(Exception e) {
            System.out.println("Você digitou valores inválidos, execute novamente.");
        } finally {
            scanner.close();
        }
    }
}
