package br.uem.din.pokemon;

public class Pokemon {

    String nome;

    private int level, modifierAccuracy, modifierEvasion, modifierAtk, modifierDef, modifierSpe, modifierSpd, num;
    private double hpAtual, hpMax, atk, def, spe, spd, atributoValor;
    private boolean confusion, flinch;

    public Pokemon(String nome, int level, int num) {
        this.nome = nome;
        this.level = level;
        this.num = num;
    }

    public Pokemon() {

    }

    public double valorAtributo() {

        return atributoValor;
    }

    Pokemon[] todosPokemons = new Pokemon[12];

    public void todosPokemons() {

        todosPokemons[0] = new Pokemon("Bulbasaur", 10, 1);
        todosPokemons[1] = new Pokemon("Ivysaur", 30, 2);
        todosPokemons[2] = new Pokemon("Venusaur", 8, 3);
        todosPokemons[3] = new Pokemon("Charmander", 6, 4);
        todosPokemons[4] = new Pokemon("Charmeleon", 8, 5);
        todosPokemons[5] = new Pokemon("Charizard", 40, 6);
        todosPokemons[6] = new Pokemon("Squirtle", 20, 7);
        todosPokemons[7] = new Pokemon("Wartortle", 8, 8);
        todosPokemons[8] = new Pokemon("Blastoise", 8, 9);
        todosPokemons[9] = new Pokemon("Caterpie", 6, 10);
        todosPokemons[10] = new Pokemon("Metapod", 8, 11);
        todosPokemons[11] = new Pokemon("Pikachu", 10, 12);
        System.out.println("Pokemons disponíveis para escolha: ");

        for (int i = 0; i < todosPokemons.length; i++) {
            System.out.println(todosPokemons[i].num + " - Pokemon: " + todosPokemons[i].nome + " | Level: " + todosPokemons[i].level);
        }
    }

    public Pokemon escolhaPokemon(int i) {
        return todosPokemons[i];
    }
}
