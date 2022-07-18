package bytebankHerdado.src.br.com.bytebank.banco.Teste;

import bytebankHerdado.src.br.com.bytebank.banco.Modelo.Autenticavel;
import bytebankHerdado.src.br.com.bytebank.banco.Modelo.Cliente;
import bytebankHerdado.src.br.com.bytebank.banco.Modelo.Gerente;

public class TesteFuncionario {

    public static void main(String[] args) {

        Autenticavel cliente = new Cliente();

        Gerente Nico = new Gerente();
        Nico.setNome("Nico Steppat");
        Nico.setCpf("223355656-9");
        Nico.setSalario(2600.00);

        System.out.println(Nico.getNome());
        System.out.println(Nico.getBonificacao());
    }

}