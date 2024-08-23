import	java.util.Scanner;
public class ConversorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            String numero = "123.45";
            System.out.println(numero);
            double numeroDecimal = Double.parseDouble(numero);
            int numeroInteiro = (int) numeroDecimal;
            System.out.println("Numero da string arrumado para inteiro -> " + numeroInteiro);
        } catch(Exception e) {
            System.out.println("Você digitou valores inválidos, execute novamente.");
        } finally {
            scanner.close();
        }
    }
}
