import java.util.Scanner;

public class Aprovado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();
            System.out.println("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();
            System.out.println("Digite a terceira nota: ");
            double nota3 = scanner.nextDouble();

            double media = (nota1+nota2+nota3)/3;
            if (media >= 7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        } catch (Exception e) {
            System.out.println("Você digitou valores inválidos. Execute programas novamente");
        } finally {
            scanner.close();
        }
    }
}
