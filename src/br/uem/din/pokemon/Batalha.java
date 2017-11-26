
package br.uem.din.pokemon;

import static br.uem.din.pokemon.Jogo.limparTela;
import java.util.Scanner;

public class Batalha {
    Pokemon Pokemon = new Pokemon();
    
    Pokemon[] meuPokemon = new Pokemon [6];
    int controle[] = new int [6];
    
    
       
    public void carregarTabelas(){
       Scanner input = new Scanner(System.in);
        System.out.println("Escolha seus Pokemons:");
        for (int i = 0; i < 6; i++){
            System.out.print("Escolha seu " + (i+1) + "º Pokemon:" );
            int escolha = input.nextInt();        
            meuPokemon[i] = Pokemon.escolhaPokemon(escolha-1);
            System.out.println("Pokemon escolhido: " + meuPokemon[i].nome);
            controle[i] = escolha; //Para controlar se o Pokemon já foi escolhido
        }
    }

    
    public void inicializarJogadores(){
        Scanner input = new Scanner(System.in);
        int opcao;
        boolean inicializa = true;
        
        inicializa:
        while (inicializa){
            System.out.println("***** BEM VINDO AO POKEMON GAME *****");
            System.out.println("Ecolha o modo de jogo:");
            System.out.println("[1] Humano vs Humano.");
            System.out.println("[2] Humano vs Máquina.");
            opcao = input.nextInt();
            limparTela();
            if(opcao < 1 || opcao > 2){
                System.out.println("OPCAO INVALIDA!!!");
                continue inicializa;
            }
        
            switch (opcao){
                case 1: 
                    inicializa = false;
                    Pokemon.mostraPokemons();
                    
                    //

                    break;

                case 2:
                    System.out.println("Olá!");


                    break;
            }
        } 
    }
}
    
   /* public void executarTurno(){
        //desenvolver
    } */
    
