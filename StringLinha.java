import java.util.Scanner;
public class StringLinha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine();
//O método .length() em Java é usado para obter o comprimento de uma String, ou seja, ele retorna o número de caracteres que a String contém.
        for (int i = 0; i < texto.length(); i++) {
//O método charAt(int index) em Java é usado para acessar o caractere em uma posição específica dentro de uma String.
            System.out.println(texto.charAt(i));
        }
        scanner.close();
    }
}
