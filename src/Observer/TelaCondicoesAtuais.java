package Observer;

public class TelaCondicoesAtuais implements  Observer, ExibirElemento {

    private  float temperatura;

    private float umidade;

    private Subject dadosDoTempo;

    public TelaCondicoesAtuais(Subject dadosDoTempo){
        this.dadosDoTempo = dadosDoTempo;
        this.dadosDoTempo.registraObservador(this);
    }

    public void atualizar(float temperatura, float umidade, float pressao){
        this.temperatura = temperatura;
        this.umidade = umidade;
        exibir();
    }

    public void exibir(){

        System.out.println("\n=========== TELA CONDIÇOES ATUAIS ===============");
        System.out.println("Condições atuais: " + temperatura + "ºC e " + umidade
                + "% de umidade");

    }
}
