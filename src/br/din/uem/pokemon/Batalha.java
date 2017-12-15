package br.din.uem.pokemon;

import static br.din.uem.pokemon.Jogo.limparTela;
import br.din.uem.fronteira.Inicio;
import java.io.IOException;
import java.util.Scanner;

public class Batalha {

    
   Pokemon Pokemon = new Pokemon();

    
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
            opcao = input.nextInt();
            limparTela();
            if (opcao < 1 || opcao > 3) {
                System.out.println("Opção inválida!");
                System.out.println("Digite um valor entre 1 e 3.");
                continue inicializa;
            }

            switch (opcao) {
                case 1:
                    inicializa = false;
                    Jogo.limparTela();
                    System.out.println("Jogador (1), sua vez! Vamos lá? Aperta qualquer tecla \n");
                    input.nextInt();
                    Humano.carregarTabelas();
                    System.out.println("Jogador (2), sua vez! Vamos lá? Aperta qualquer tecla \n");
                    input.nextInt();
                    Humano.carregarTabelas();                     //será realizado 2x porque são duas pessoas.
                    break;

                case 2:
                    System.out.println("Humano vs Máquina");
                    break;

                case 3:
                    System.out.println("Máquina vs Máquina");
                    break;
            }
        }
    }
}

/* public void executarTurno(){
        //desenvolver
    } */
