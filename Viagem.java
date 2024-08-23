import java.util.Scanner;
public class Viagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Digite a distância do caminho em Km: ");
            double Km = scanner.nextDouble();
            System.out.println("Digite tempo, em horas, para percorrer o caminho: ");
            double H = scanner.nextDouble();
            double vM = Km/H;
            System.out.println("A velocidade média foi " + vM + "km/h");
        } catch(Exception exception) {
            System.out.println("Você digitou valores inválidos. Por favor, execute novamente.");
        } finally {
            scanner.close();
        }
    }
}
