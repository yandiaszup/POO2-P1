package Strategy.Personagem;

import Strategy.Ataque.Ataque1;

public class PersonagemB extends Personagem {
    public PersonagemB(){
        setAtaque(new Ataque1());
    }
}
