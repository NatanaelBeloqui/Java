import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua altura em m: ");
        double altura = scanner.nextDouble();
        System.out.println("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();
        double imc = peso / Math.pow(altura, 2);
        System.out.printf("Seu IMC é: %.2f", imc);
        System.out.println("\n");
        if (imc < 18.6) {
            System.out.println("Abaixo do Peso");
        } else {
            if (imc < 25) {
                System.out.println("Peso Ideal");
            } else {
                if (imc < 30) {
                    System.out.println("Levemente acima do peso");
                } else {
                    if (imc < 35) {
                        System.out.println("Obesidade Grau I");
                    } else {
                        if (imc < 40) {
                            System.out.println("Obesidade grau II");
                        } else {
                            System.out.println("Obedidade Grau III (mórbida)");
                        }
                    }
                }
            }
        }
        scanner.close();
    }
}
