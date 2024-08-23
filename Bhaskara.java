import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Digite o valor do coeficiente \"a\": ");
            double a = scanner.nextDouble();
            System.out.println("Digite o coeficiente \"b\": ");
            double b = scanner.nextDouble();
            System.out.println("Digite o coeficiente \"c\": ");
            double c = scanner.nextDouble();
            double delta = Math.pow(b,2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("O delta é negativo. Portanto, não há raízes.");
            }
            else{
                double raiz = Math.sqrt(delta);
                double x1 = ((-b) + raiz) / (2 * a);
                double x2 = ((-b) - raiz) / (2 * a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        } catch (Exception e) {
            System.out.println("Você digitou algo errado. Execute novamente.");
        } finally {
            scanner.close();
        }
    }
}
