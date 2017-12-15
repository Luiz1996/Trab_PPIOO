package br.din.uem.pokemon;

import java.io.IOException;
import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) throws IOException {
        Batalha batalha = new Batalha();
        batalha.inicializarJogadores();
    }

    public static void limparTela() {
        System.out.println("\n");
    }
}
