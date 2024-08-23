import java.util.Scanner;

public class Mes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite um número de 1 a 12: ");
            int numero = scanner.nextInt();
            String[] meses = new String[12];
            meses[0] = "Janeiro";
            meses[1] = "Fevereiro";
            meses[2] = "Março";
            meses[3] = "Abril";
            meses[4] = "Maio";
            meses[5] = "Junho";
            meses[6] = "Julho";
            meses[7] = "Agosto";
            meses[8] = "Setembro";
            meses[9] = "Outubro";
            meses[10] = "Novembro";
            meses[11] = "Dezembro";
            
            if ((numero >= 1) && (numero <= 12) ) {
                System.out.println("O mês correspondente a esse número é: " + meses[numero-1]);
            } else {
                System.out.println("Esse número não representa um mês ");
            }
        } catch (Exception e) {
            System.out.println("Você digitou valores inválidos, execute novamente.");
        } finally {
            scanner.close();
        }
    }
}
