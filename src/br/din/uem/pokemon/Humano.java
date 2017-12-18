package br.din.uem.pokemon;

import static br.din.uem.pokemon.Pokemon.escolhaPokemon;
import java.util.Scanner;

public class Humano {

    public static void escolherComando() {
        Scanner input = new Scanner(System.in);
        int opcao;
        boolean escolha = true;

        while (escolha) {
            System.out.println("O que deseja fazer?:");
            System.out.println("[1] Trocar Pokemon");
            System.out.println("[2] Atacar");
            opcao = input.nextInt();
            if (opcao < 1 || opcao > 2) {
                System.out.println("Opção inválida!");
                System.out.println("Digite um valor entre 1 e 2!");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Ops!!1");
                    break;

                case 2:
                    System.out.println("Ops!!1");
                    break;

            }
        }
    }

    private static Pokemon Pokemon = new Pokemon();

    public static void carregarTabelas1() {
        Scanner input = new Scanner(System.in);
        Pokemon[] jogador1 = new Pokemon[6];
        Especie especieEscolhida;
        Ataque ataques1[] = new Ataque[4];
        int k;

        Especie.todosPokemons();
        System.out.println("\n"); //Pular 1 linha.
        System.out.println("Jogador 1, sua vez! Escolha seus Pokemóns...");
        for (int i = 0; i < 6; i++) {
            System.out.print("Escolha seu " + (i + 1) + "º Pokemon:");
            int escolha = input.nextInt();
            especieEscolhida = Especie.escolhaPokemon(escolha - 1);
            Ataque.todosAtaques();
            for (k = 0; k < 4; k++) {
                System.out.print("Escolha seu " + (k + 1) + "º Ataque:");
                int escolhaatk = input.nextInt();
                ataques1[k] = Ataque.escolhaAtaque(escolhaatk - 1);
            }
            jogador1[i] = Pokemon.escolhaPokemon(especieEscolhida, ataques1[0], ataques1[1], ataques1[2], ataques1[3]);
            //System.out.println("Pokemon escolhido: " + jogador1[i].especie);
        }
    }

    public static void carregarTabelas2() {
        Scanner input = new Scanner(System.in);
        Pokemon[] jogador2 = new Pokemon[6];
        Especie especieEscolhida;
        Ataque ataques2[] = new Ataque[4];
        int k;

        Especie.todosPokemons();
        System.out.println("\n"); //Pular 1 linha.
        System.out.println("Jogador 1, sua vez! Escolha seus Pokemóns...");
        for (int i = 0; i < 6; i++) {
            System.out.print("Escolha seu " + (i + 1) + "º Pokemon:");
            int escolha = input.nextInt();
            especieEscolhida = Especie.escolhaPokemon(escolha - 1);
            Ataque.todosAtaques();
            for (k = 0; k < 4; k++) {
                System.out.print("Escolha seu " + (k + 1) + "º Ataque:");
                int escolhaatk = input.nextInt();
                ataques2[k] = Ataque.escolhaAtaque(escolhaatk - 1);
            }
            jogador2[i] = Pokemon.escolhaPokemon(especieEscolhida, ataques2[0], ataques2[1], ataques2[2], ataques2[3]);
            //System.out.println("Pokemon escolhido: " + jogador1[i].especie);
        }
    }
}