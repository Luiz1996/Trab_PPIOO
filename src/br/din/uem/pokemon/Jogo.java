package br.din.uem.pokemon;

import br.din.uem.construtores.Leitor;
import java.io.IOException;
import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) throws IOException {
        
        Leitor.getLinhasArquivo();
        Batalha batalha = new Batalha();
        batalha.inicializarJogadores();
    }

    public static void limparTela() {
        System.out.println("\n");
    }
}
