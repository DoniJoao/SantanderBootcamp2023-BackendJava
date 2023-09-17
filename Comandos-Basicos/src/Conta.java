public class Conta {

    double saldo = 10.0;

    public void sacar(double valor) {
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo() {
        System.out.println(saldo);
    }
}
