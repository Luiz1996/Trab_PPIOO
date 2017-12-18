package br.din.uem.pokemon;

import static br.din.uem.pokemon.Pokemon.escolhaPokemon;
import java.util.Scanner;

public class Humano {
    
    static Pokemon vetor[];
    

    public static void escolherComando(int jogador) {
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
                    if (jogador == 1){
                       vetor = Batalha.getJogador1();
                       Batalha.trocaPokemon(vetor);
                       jogador = 2;
                       Batalha.setJogador1(vetor);
                    } else if (jogador == 2) {
                       vetor = Batalha.getJogador2();
                       Batalha.trocaPokemon(vetor);
                       jogador = 1;
                       Batalha.setJogador2(vetor);
                    }
                    break;

                case 2:
                    System.out.println("Ops!!1");
                    break;

            }
        }
    }
}