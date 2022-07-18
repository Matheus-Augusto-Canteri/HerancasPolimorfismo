package bytebankHerdado.src.br.com.bytebank.banco.Modelo;

// Editor de vídeo é um funcionario, editor de vídeo herda da classe funcionario
public class EditorVideo extends Funcionario {

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do EDITOR DE VÍDEO");
        return 150;
    }

}
