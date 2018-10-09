package ChainOfResponsibility;

public class BancoD extends BancoChain {

    public BancoD() {
        super(IDBancos.bancoC);
    }

    @Override
    protected void efetuaPagamento() {
        System.out.println("Pagamento efetuado no banco D");
    }
}
