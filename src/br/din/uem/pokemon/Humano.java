package br.din.uem.pokemon;

import static br.din.uem.pokemon.Batalha.jogador1;
import static br.din.uem.pokemon.Batalha.jogador2;
import static br.din.uem.pokemon.Pokemon.escolhaPokemon;
import java.util.Scanner;

public class Humano {

    static Pokemon vetor[];

    public static void escolherComando(int jogador) {
        Scanner input = new Scanner(System.in);
       
        boolean escolha = true;
        int opcao;
        while (escolha) {
            System.out.println("O que deseja fazer?:" + "Jogador nº" + jogador);
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
                    if (jogador == 1) {
                        vetor = Batalha.getJogador1();
                        Batalha.trocaPokemon(vetor);
                        Batalha.setJogador1(vetor);
                        System.out.println("Seu novo arranjo de Pokemon: \n");
                        for (int i = 0; i < 6; i++) {
                            System.out.println(jogador1[i].especie.getNome());
                        }
                        escolherComando(2);
                    } else if (jogador == 2) {
                        vetor = Batalha.getJogador2();
                        Batalha.trocaPokemon(vetor);
                        Batalha.setJogador2(vetor);
                        System.out.println("Seu novo arranjo de Pokemon: \n");
                        for (int i = 0; i < 6; i++) {
                            System.out.println(jogador2[i].especie.getNome());
                        }
                        escolherComando(1);
                    }
                    break;

                case 2:
                    System.out.println("Escolha qual ataque usar de (1) a (4): ");
                    System.out.println("Seus ataques:  ");
                    if (jogador == 1) {
                        System.out.println("1 - " + jogador1[0].getAtaque1().nome);
                        System.out.println("2 - " + jogador1[0].getAtaque2().nome);
                        System.out.println("3 - " + jogador1[0].getAtaque3().nome);
                        System.out.println("4 - " + jogador1[0].getAtaque4().nome);
                        System.out.println(" ");
                        int op = input.nextInt();
                        Ataque.ataqueDesejado(jogador1, op - 1);
                        escolherComando(2);
                    } else if (jogador == 2) {
                        System.out.println("1 - " + jogador2[0].getAtaque1().nome);
                        System.out.println("2 - " + jogador2[0].getAtaque2().nome);
                        System.out.println("3 - " + jogador2[0].getAtaque3().nome);
                        System.out.println("4 - " + jogador2[0].getAtaque4().nome);
                        System.out.println(" ");
                        int op = input.nextInt();
                        Ataque.ataqueDesejado(jogador2, op - 1);
                        escolherComando(1);
                    }
                    break;

            }
        }
    }
}
