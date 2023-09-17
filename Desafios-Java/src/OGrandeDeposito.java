import java.text.DecimalFormat;
import java.util.Scanner;

public class OGrandeDeposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        double valor = scanner.nextDouble();

        if (valor > 0) {
            // TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide
            // Exemplos).
            System.out.println("Deposito realizado com sucesso! Saldo atual: R$ " + df.format(valor));
        } else if (valor != 0) {
            // TODO: Imprimir a mensagem de valor inválido.
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        } else {
            // TODO: Imprimir a mensagem de encerrar o programa.
            System.out.println("Encerrando o programa...");
        }
    }
}