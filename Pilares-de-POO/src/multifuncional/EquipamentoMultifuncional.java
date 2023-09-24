package multifuncional;

import copiadora.Copiadora;
import digitalizadora.Digitalizadora;
import impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    public void copiar(){
        System.out.println("COPIANDO VIA EQUIPAMENTO EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void digitalizar(){
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void imprimir(){
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO EQUIPAMENTO MULTIFUNCIONAL");
    }
}
