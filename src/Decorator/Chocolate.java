package Decorator;

public class Chocolate extends AdicionalDecorator {
    Bebida bebida;

    public Chocolate(Bebida bebida){
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Chocolate";
    }

    @Override
    public float calcularPreco() {
        return (float) (3.00 + bebida.calcularPreco());
    }
}
