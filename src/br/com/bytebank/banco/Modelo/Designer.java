package bytebankHerdado.src.br.com.bytebank.banco.Modelo;

// Designer é um funcionario, Designer herda da classe funcionario
public class Designer extends Funcionario {

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do DESIGNER");
        return 200;
    }

}
