package br.din.uem.pokemon;

import java.io.IOException;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

public class Batalha {

    static Pokemon Pokemon = new Pokemon();

    public void inicializarJogadores() throws IOException {
        Scanner input = new Scanner(System.in);
        int opcao;
        boolean inicializa = true;

        inicializa:
        while (inicializa) {
            System.out.println("***** BEM VINDO AO POKEMON GAME *****");
            System.out.println("Ecolha o modo de jogo:");
            System.out.println("[1] Humano vs Humano.");
            System.out.println("[2] Humano vs Máquina.");
            System.out.println("[3] Máquina vs Máquina.");
            System.out.print("Opção:");
            opcao = input.nextInt();

            if (opcao < 1 || opcao > 3) {
                System.out.println("Opção inválida!");
                System.out.println("Digite um valor entre 1 e 3.");
                continue inicializa;
            }

            switch (opcao) {
                case 1:

                    inicializa = false;
                    carregarTabelas1();
                    carregarTabelas2();
                    System.out.println("-------------------------------------------------------------- TIMES FORMADOS COM SUCESSO --------------------------------------------------------------");
                    Humano.escolherComando(1);
                    Humano.escolherComando(2);
                    break;

                case 2:
                    System.out.println("Opção não implementada.");
                    continue inicializa;

                case 3:
                    System.out.println("Opção não implementada.");
                    continue inicializa;

            }
        }
    }

    static Pokemon[] jogador1 = new Pokemon[6];

    public static void carregarTabelas1() {
        Scanner input = new Scanner(System.in);
        Especie especieEscolhida;
        Ataque ataques1[] = new Ataque[4];
        int k;

        System.out.println("\n"); //Pular 1 linha.
        System.out.println("Jogador 1, sua vez! Escolha seus Pokemóns...");
        for (int i = 0; i < 6; i++) {
            Especie.todosPokemons();
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

    static Pokemon[] jogador2 = new Pokemon[6];

    public static void carregarTabelas2() {
        Scanner input = new Scanner(System.in);
        Especie especieEscolhida;
        Ataque ataques2[] = new Ataque[4];
        int k;

        System.out.println("\n"); //Pular 1 linha.
        System.out.println("Jogador 2, sua vez! Escolha seus Pokemóns...");
        for (int i = 0; i < 6; i++) {
            Especie.todosPokemons();
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

    public static Pokemon[] getJogador1() {
        return jogador1;
    }

    public static void setJogador1(Pokemon[] jogador1) {
        Batalha.jogador1 = jogador1;
    }

    public static Pokemon[] getJogador2() {
        return jogador2;
    }

    public static void setJogador2(Pokemon[] jogador2) {
        Batalha.jogador2 = jogador2;
    }

    public static void trocaPokemon(Pokemon jogador[]) { //Método para trocar o Pokemon
        int i;
        Pokemon auxtroca[] = new Pokemon[1];
        auxtroca[0] = jogador[0];
        for (i = 0; i < 5; i++) {
            jogador[i] = jogador[i + 1];
        }
        jogador[5] = auxtroca[0];

    }
}

/* public void executarTurno(){
        //desenvolver
    } */
