import java.util.Scanner;
public class DoisString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Digite um valor: ");
        String str1 = scanner.next();
        System.out.println("Digite outro valor: ");
        String str2 = scanner.next();
        if (str1.equals(str2)) {
            System.out.println("As palavras são iguais");
        }
        else {
            System.out.println("As palavras são diferentes");
        }
        } catch(Exception e) {
            System.out.println("Você digitou valores inválidos, execute novamente.");
        } finally {
            scanner.close();
        }
    }
}
