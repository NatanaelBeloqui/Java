import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Digite a largura: ");
            double largura = scanner.nextDouble();
            System.out.println("Digite o comprimento: ");
            double comprimento = scanner.nextDouble();
            System.out.println("Digite a profundiadade: ");
            double profundiadade = scanner.nextDouble();

            double volume = largura * comprimento * profundiadade;
            System.out.println("O volume é " + volume);
        } catch(Exception e) {
            System.out.println("Você digitou valores inválidos, execute novamente");
        } finally {
            scanner.close();
        }
    }
}