import java.util.Scanner;
public class ImpostoPago {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite o faturamento da sua empresa: ");
            double f = scanner.nextDouble();
            System.out.println("Digite a quantidade de imposto: ");
            double qI = scanner.nextDouble();
            double iP = (f/qI) * 100;
            System.out.println("O valor do imposto pago foi de R$" + iP);
        } catch (Exception e) {
            System.out.println("Você digitou valores inválidos, execute novamente.");
        } finally {
            scanner.close();
        }
    }
}
