package br.din.uem.pokemon;

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
            
            if (opcao < 1 || opcao > 3) {
                System.out.println("Opção inválida!");
                System.out.println("Digite um valor entre 1 e 3.");
                continue inicializa;
            }

            switch (opcao) {
                case 1:
                    
                    inicializa = false;
                    Humano.carregarTabelas1();
                    Humano.carregarTabelas2();
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
}

/* public void executarTurno(){
        //desenvolver
    } */
