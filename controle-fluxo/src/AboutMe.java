import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite o sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite a idade");
            int idade = scanner.nextInt();

            System.out.println("Digite a altura");
            float altura = scanner.nextFloat();

            System.out.println("Ola me chamo " + nome.toUpperCase() + " " + sobrenome);
            System.out.println("tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura);
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println(
                    "Os campos idade e altura precisam ser numéricos, use .(ponto) ao invés de virgula para descrever a altura");
        }
    }
}