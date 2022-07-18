package bytebankHerdado.src.br.com.bytebank.banco.Modelo;

//Contrato autenticável
//Quem assina o contrato precisa implementar
//Metodo setSenha
//Metodo autentica
//Implements

public abstract interface Autenticavel {

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);

}
