import java.util.Scanner;
public class ImpostoRenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Digite o valor do seu salário: ");
            double salario = scanner.nextDouble();
            if (salario < 1903.99) {
                System.out.println("Isento de IR");
            } else {
                if (salario < 2826.66) {
                    salario = salario * 0.075;
                    System.out.println("Deverá pagar R$" + String.format("%.2f", salario) + " de imposto");
                } else {
                    if (salario < 3751.06) {
                        salario = salario * 0.15;
                        System.out.println("Deverá pagar R$" + String.format("%.2f", salario) + " de imposto");
                    } else {
                        if (salario < 4664.68) {
                            salario = salario * 0.225;
                            System.out.println("Deverá pagar R$" + String.format("%.2f", salario) + " de imposto");
                        } else {
                            if (salario >= 4664.68) {
                                salario = salario * 0.275;
                                System.out.println("Deverá pagar R$" + String.format("%.2f", salario) + " de imposto");
                            }
                        }
                    } 
                }
            }
        } catch (Exception e) {
            System.out.println("Você digitou valores inválidos, execute novamente.");;
        } finally {
            scanner.close();
        }
    }
}
