package br.uem.din.pokemon;

import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {
        Batalha batalha = new Batalha();
        batalha.inicializarJogadores();
        batalha.carregarTabelas();
    }

    public static void limparTela() {
        System.out.println("\n");
    }
}
