package bytebankHerdado.src.br.com.bytebank.banco.Modelo;

public class AutenticacaoUtil implements Autenticavel{
    
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;

    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }


}
