package br.din.uem.pokemon;

import java.util.ArrayList;
import java.util.List;

public abstract class Jogador {
    
    private List<Pokemon> pokemons = new ArrayList<>();
    
    public abstract void escolherComando();
    
    public void trocarPokemon(){
        //desenvolver
    }
    
    public void usarAtaque(){
        //desenvolver
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
    
    //fazer construtor com lista pokemons
}
