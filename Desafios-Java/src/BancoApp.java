import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
   
        double valorInicial = scanner.nextDouble();
        
     
        double taxaJuros = scanner.nextDouble() * 1.0;
        
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;
        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
            valorFinal = valorInicial * Math.pow(1 + taxaJuros, periodo);

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
}