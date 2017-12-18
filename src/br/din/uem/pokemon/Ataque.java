package br.din.uem.pokemon;

import static br.din.uem.pokemon.Especie.escolhaPokemon;
import java.util.Random;

public class Ataque {

    String nome;

    private String tipo, classe;
    private double ppMax, ppAtual, accuracy, critico, dano;
    private int id, power;
    private boolean acerto;

    public Ataque(int id, String nome, String tipo, int PP, int power, int accuracy, String Classe) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.ppMax = PP;
        this.power = power;
        this.accuracy = accuracy;
        this.classe = classe;
    }

    static Ataque[] todosAtaques = new Ataque[4];

    public static void todosAtaques() {

        todosAtaques[0] = new Ataque(1, "Leech Life", "Bug", 15, 20, 100, "hp");
        todosAtaques[1] = new Ataque(2, "Pin Missile", "Bug", 20, 14, 85, "multihit");
        todosAtaques[2] = new Ataque(3, "String Shot", "Bug", 40, 0, 95, "modifier");
        todosAtaques[3] = new Ataque(4, "Twineedle", "Bug", 20, 23, 100, "multihit");

        System.out.println("Ataques disponíveis para escolha. \n");

        for (int i = 0; i < todosAtaques.length; i++) {
            System.out.println(todosAtaques[i].id + " - " + todosAtaques[i].nome);
        }
    }

    public static float multiplicadorDeDano() {
        float dano = 0;
        float[][] multiDano = new float[15][15];
        Random gerador = new Random();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                multiDano[i][j] = gerador.nextFloat() + 1;
                System.out.println("Valor: " + multiDano[i][j]);
            }
        }
        return dano;
    }

    public static Ataque escolhaAtaque(int i) {
        return todosAtaques[i];
    }

    public void efeito() {
        //desenvolver
    }

    public double calculoCritico(int id) {
        return Especie.escolhaPokemon(id - 1).baseSpd / 512;
    }

    public boolean calculoAcerto() {
        //esenvolver
        return acerto;
    }

    public double calculoDano(int id) {
        double dano = 0;
        dano = ((Especie.escolhaPokemon(id - 1).baseAtk*Especie.escolhaPokemon(id - 1).level)/(Especie.escolhaPokemon(id - 1).baseDef/50) + 2);
        return dano;
    }

    public int calculoLevel(int id) {
        return Especie.escolhaPokemon(id - 1).level * 5;
    }

    public static Ataque ataqueDesejado(Pokemon[] pokemon, int num) {
        Ataque atk = null;
        switch (num) {
            case 1:
                atk = pokemon[0].getAtaque1();
            case 2:
                atk =  pokemon[0].getAtaque2();
            case 3:
                atk = pokemon[0].getAtaque3();
            case 4:
                atk = pokemon[0].getAtaque4();
        }
        return atk;
    }
    
    public double consequenciaAtk (Pokemon[] pokemon, Pokemon [] pokemon2){
        double temp;
        pokemon2[0].setBaseHP(pokemon2[0].getBaseHP() - calculoDano(pokemon[0].getId()));
        temp = pokemon2[0].getBaseHP();
        return temp;
    }
}

