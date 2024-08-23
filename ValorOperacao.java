import java.util.Scanner;
public class ValorOperacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Digite outro valor: ");
        double valor2 = scanner.nextDouble();
        System.out.println("\n[1] Soma");
        System.out.println("[2] Subtração");
        System.out.println("[3] Multiplicação");
        System.out.println("[4] Divisão");
        System.out.print("\nEscolha uma das operações conforme o id: ");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1: {
                double soma = valor1 + valor2;
                System.out.println("A soma de " + valor1 + " + " + valor2 + " é " + soma);
                break;
            }
            case 2: {
                double subtracao = valor1 - valor2;
                System.out.println("A subtração de " + valor1 + " - " + valor2 + " é " + subtracao);
                break;
            }
            case 3: {
                double multiplicacao = valor1 * valor2;
                System.out.println("A multiplicação de " + valor1 + " * " + valor2 + " é " + multiplicacao);
                break;
            }
            case 4: {
                // Verificar se valor2 não é zero para evitar divisão por zero
                if (valor2 != 0) {
                    double divisao = valor1 / valor2;
                    System.out.println("A divisão de " + valor1 + " / " + valor2 + " é " + divisao);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            }
            default: {
                System.out.println("Número inválido. Digite um número entre 1 e 4.");
                break;
            }
        }
        scanner.close();
    }
}
