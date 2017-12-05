/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.din.uem.fronteira;

import br.din.uem.construtores.Controlador;
import br.din.uem.pokemon.Pokemon;
import java.util.Scanner;

/**
 *
 * @author TransDesk
 */
public class Inicio {

    Controlador controlador = new Controlador();
    private int opcao;
    Scanner scan = new Scanner(System.in);

    public void menu() {
        System.out.println("0. Sair");
        System.out.println("1. Buscar Pokemon na lista por nome");
        System.out.print("Escolha a opcao:");
        opcao = scan.nextInt();
    }

    public void inicializar() {
        do {
            menu();
            controlador.recuperarDados();
            Pokemon P;
            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome do Pokemon ");
                    String nome = scan.next();
                    P = controlador.buscarPokemonNome(nome);
                    if (P != null) {
                        System.out.println("Resultado da busca:");
                        System.out.println(P.toString());
                    } else {
                        System.out.println("Funcionario nao encontrado ");
                    }
                    break;
                case 2:
                    System.out.println("Informe o id do Pokemon");
                    int id = scan.nextInt();
                    P = controlador.buscarPokemonMapa(id);
                    if (P != null) {
                        System.out.println("Resultado da busca:");
                        System.out.println(P.toString());
                    } else {
                        System.out.println("Pokemon nao encontrado   ");
                    }
                    break;
            }
        } while (opcao != 0);
    }
}
