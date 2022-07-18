package bytebankHerdado.src.br.com.bytebank.banco.Teste;

import bytebankHerdado.src.br.com.bytebank.banco.Modelo.Administrador;
import bytebankHerdado.src.br.com.bytebank.banco.Modelo.Cliente;
import bytebankHerdado.src.br.com.bytebank.banco.Modelo.Gerente;
import bytebankHerdado.src.br.com.bytebank.banco.Modelo.SistemaInterno;

public class TesteSistema {

    public static void main(String[] args) {
        Gerente g = new Gerente();
         g.setSenha(2222);

        Administrador adm = new Administrador();
         adm.setSenha(3333);

         Cliente cliente = new Cliente();
         cliente.setSenha(2222);

        SistemaInterno si = new SistemaInterno();
         si.autentica(g);
         si.autentica(adm);
         si.autentica(cliente);
    }

}
