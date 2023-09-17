import java.util.Scanner;

public class contaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // TO DO:

        // conhecer e importar a classe scanner

        // exibir as mensagens para o nosso usuario

        // obter pela classe scanner os valore digitados no terminal

        // exibir a mensagem conta criada
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("***Crie sua conta conosco***");
        System.out.println();

        System.out.println("DIgite o Número da Conta");
        numero = sc.nextInt();

        System.out.println("DIgite o Número da Agência");
        agencia = sc.next();

        System.out.println("DIgite o seu Nome");
        nomeCliente = sc.next();
        sc.nextLine();

        System.out.println("DIgite o Saldo atual");
        saldo = sc.nextDouble();

        System.out.println();
        System.out.println("Óla, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é "
                + agencia + " conta " + numero + " e seu saldo, de " + saldo + " já está disponivel para saque.");
        sc.close();
    }
}
