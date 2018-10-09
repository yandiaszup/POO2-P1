package Strategy.Personagem;

import Strategy.Ataque.Ataque;

public abstract class Personagem {
    private Ataque a;

    public void setAtaque(Ataque a){
        this.a = a;
    }

    public void atacar(){
        a.atacar();
    }
}
