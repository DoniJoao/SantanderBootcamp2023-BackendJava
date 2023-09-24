package apps;
public class Msn extends ServicoMensagemInstantanea {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo msn");
    }
    public void receberMensagem(){
        System.out.println("Recebendo Mensagem pelo msn");
    }
}