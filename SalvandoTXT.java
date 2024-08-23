import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class SalvandoTXT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        try {
            FileWriter writer = new FileWriter("tabuada.txt");
            
            for (int i = 0; i <= 10; i++) {
                double result = i * numero;
                String linha = numero + " x " + i + " = " + result;
                System.out.println(linha);
                //Salva a linha no arquivo
                writer.write(linha + "\n");
            }

            writer.close();
            System.out.println("Tabuada salva com sucesso no arquivo tabuada.txt");

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao tentar salvar o arquivo.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
