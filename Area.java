import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do comprimento: ");
        double comprimento = scanner.nextDouble();
        System.out.println("Digite o valor da largura: ");
        double largura = scanner.nextDouble();

        double area = comprimento * largura;
        System.out.println("A área é: " + area);
        scanner.close();
    }
}