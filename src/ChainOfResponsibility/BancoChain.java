package ChainOfResponsibility;

public abstract class BancoChain {
    protected  BancoChain next;
    protected IDBancos identificadorDoBanco;

    public BancoChain(IDBancos id){
        next = null;
        identificadorDoBanco = id;
    }

    public void setNext(BancoChain forma){
        if(next == null){
            next = forma;
        } else {
            next.setNext(forma);
        }
    }
}
