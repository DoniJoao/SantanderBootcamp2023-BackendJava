public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try{
        String cepFormatado = formatarCep("23765064");
        System.out.println(cepFormatado);
    }catch (CepInvalidoException e) {
        System.out.println("o cep não responde as regras de negocio");
    }

    static String formataString (String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        return "12.345-067";
        }
    }
}