package br.din.uem.pokemon;

import static br.din.uem.pokemon.Jogo.limparTela;
import java.util.Scanner;

public class Humano {
    
    public static void escolherComando(){
        Scanner input = new Scanner(System.in);
        int opcao;
        boolean escolha = true;
        
        while (escolha) {
            System.out.println("O que deseja fazer?:");
            System.out.println("[1] Trocar Pokemon");
            System.out.println("[2] Atacar");
            opcao = input.nextInt();
            limparTela();
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
        Pokemon[] meusPokemons = new Pokemon[6];
        
        Pokemon.todosPokemons ();
        System.out.println("Escolha seus Pokemons para batalha:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Escolha seu " + (i + 1) + "º Pokemon:");
            int escolha = input.nextInt();
            meusPokemons[i] = Pokemon.escolhaPokemon(escolha - 1);
            System.out.println("Pokemon escolhido: " + meusPokemons[i].especie);
        }
    }

public static void carregarTabelas2() {
        Scanner input = new Scanner(System.in);
        Pokemon[] meusPokemons = new Pokemon[6];
        
        Pokemon.todosPokemons ();
        System.out.println("Escolha seus Pokemons para batalha:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Escolha seu " + (i + 1) + "º Pokemon:");
            int escolha = input.nextInt();
            meusPokemons[i] = Pokemon.escolhaPokemon(escolha - 1);
            System.out.println("Pokemon escolhido: " + meusPokemons[i].especie);
        }
    }
}
