import java.text.ParseException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = sc.nextInt();

		try {
			//chamando o método contendo a lógica de contagem
			for (parametroUm < parametroDois){
			System.out.println(parametroUm);
			System.out.println(parametroDois);
		}

		}catch (ParametrosInvsalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção

		int contagem = parametroDois - parametroUm;
		// realizar o for para imprimir os números com base na variável contagem
	}
}