package Decorator;

public class StarBuzz {
    public static void main(String[] args){
        Bebida bebida = new CafeTradicional();
        bebida = new Chocolate(bebida);
        bebida = new Leite(bebida);

        System.out.println("Bebida: " + bebida.getDescricao());
        System.out.println("Preco: " + bebida.calcularPreco());
    }
}
