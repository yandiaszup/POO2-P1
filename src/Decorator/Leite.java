package Decorator;

public class Leite extends AdicionalDecorator {

    Bebida bebida;

    public Leite(Bebida bebida){
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Leite";
    }

    @Override
    public float calcularPreco() {
        return (float) (bebida.calcularPreco() + 2.00);
    }
}
