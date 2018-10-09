package Observer;

public class EstacaoMeteorologica {
    public static void main(String[] args) {
            DadosDoTempo dadosDoTempo = new DadosDoTempo();
            TelaCondicoesAtuais telaCondicoesAtuais =
                    new TelaCondicoesAtuais(dadosDoTempo);
            dadosDoTempo.setMedicoes(30,65,30.4f);
        }
    }
