package Decorator;

public class CafeTradicional extends Bebida {
    public CafeTradicional(){
        descricao = "Cafe Tradicional";
    }


    @Override
    public float calcularPreco() {
        return (float) 2.00;
    }
}
