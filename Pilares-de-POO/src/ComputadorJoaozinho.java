import apps.FacebookMessenger;
import apps.Msn;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorJoaozinho {
    public static void main(String[] args){
        ServicoMensagemInstantanea smi = null;

        /*
        não se sabe qual o app
        mas qualquer um deverá atender aos requisitos de enviar e receber mensagem
         */
        String appEscolhido="tlg";

        if(appEscolhido.equals("msn"))
        smi = new Msn();
        else if(appEscolhido.equals("fbm"))
        smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
        smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
