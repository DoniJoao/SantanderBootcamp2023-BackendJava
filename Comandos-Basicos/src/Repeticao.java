public class Repetição {
    
    public static void main(String[] args){
        int numero = 5;
        boolean variavel = true;

        //x repetição
        numero = numero +1;

        System.out.println(numero ++);

        System.out.println(numero);

        System.out.println(++ numero);

        System.out.println(-- numero);

        System.out.println(!variavel);

        int a, b;
        a = 5;
        b = 6;

        a++;

        String resultado = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 == numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual numero Dois ?" + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é igual numero Dois ?" + simNao);
        
        String nomeUm = "joão";
        String nomeDois = new String ("joão");

        System.out.println(nomeUm.equals(nomeDois));

        boolean condicao1=true;

        boolean condicao2=false;

        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira");
        }
        if(condicao1 && ( 7 > 4)){
            System.out.println("as duas condições são verdadeiras");
        }
            System.out.println("fim");
    }
}
