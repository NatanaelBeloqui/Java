import java.util.Scanner;

public class MaiorDobro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
        System.out.println("Esse programa é para verificar se o valor 1 é maior que o dobro do valor 2");
        System.out.println("Digite um valor: ");
        double valor1 = scanner.nextDouble();
        System.out.println("Digite outro valor: ");
        double valor2 = scanner.nextDouble();

        valor2 = valor2 * 2;

        if (valor1 > valor2) {
            System.out.println("O valor 1 é maior que o dobro do valor 2.");
        }
        else
            System.out.println("O valor 1 não é maior que o dobro do valor 2.");
        } catch(Exception exception) {
            System.out.println("Você digitou valores inválidos, execute novamente.");
        } finally {
            scanner.close();
        }
    }
}
