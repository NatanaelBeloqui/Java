import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
    public static void main(String[] args) {
        // Caminho do arquivo que você deseja ler
        String caminhoArquivo = "caminho/do/arquivo.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
