package br.din.uem.pokemon;


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
        
        Pokemon.todosPokemons ();
        System.out.println("\n"); //Pular 1 linha.
        System.out.println("Jogador 1, sua vez! Escolha seus Pokemóns...");
        for (int i = 0; i < 6; i++) {
            System.out.print("Escolha seu " + (i + 1) + "º Pokemon:");
            int escolha = input.nextInt();
            jogador1[i] = Pokemon.escolhaPokemon(escolha - 1);
            System.out.println("Pokemon escolhido: " + jogador1[i].especie);
        }
    }

public static void carregarTabelas2() {
        Scanner input = new Scanner(System.in);
        Pokemon[] jogador2 = new Pokemon[6];

        Pokemon.todosPokemons ();
        System.out.println("\n"); //Pular 1 linha.
        System.out.println("Jogador 2, sua vez! Escolha seus Pokemóns...");
        for (int i = 0; i < 6; i++) {
            System.out.print("Escolha seu " + (i + 1) + "º Pokemon:");
            int escolha = input.nextInt();
            jogador2[i] = Pokemon.escolhaPokemon(escolha - 1);
            System.out.println("Pokemon escolhido: " + jogador2[i].especie);
        }
    }
}
