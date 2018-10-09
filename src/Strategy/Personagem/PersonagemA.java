package Strategy.Personagem;

import Strategy.Ataque.Ataque1;

public class PersonagemA extends Personagem {
    public PersonagemA(){
        setAtaque(new Ataque1());
    }
}
