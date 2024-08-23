import java.util.Scanner;
public class NotasAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = 0;
        double somaNota = 0;
        double cont = 0;
        do {
            System.out.println("Digite a nota: ");
            nota = scanner.nextDouble();
            if ((nota >= 0) && (nota <= 10)) {
                somaNota = somaNota + nota;
                cont = cont + 1;
            } else {
                System.out.println("Você ditou uma nota inválida.");
            }
        } while ((nota >= 0) && (nota <=10));
        System.out.println("A média das notas é " + somaNota/cont);
        scanner.close();
    }
}
