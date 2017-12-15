/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.din.uem.construtores;

import br.din.uem.pokemon.Pokemon;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Leitor {

    private static Pokemon[] todosPokemons = new Pokemon[12];
    private static List<String[]> arquivoGolpe = new ArrayList<>();

    public void lerArq() throws FileNotFoundException, IOException {

        String linha[] = null;
        int a;

        FileReader reader;
        reader = new FileReader("tabelas.txt");
        BufferedReader leitor = new BufferedReader(reader);
        leitor.readLine();

        a = 0;
        linha[a] = leitor.readLine();
        while (linha[a] != null) {
            //System.out.println(linha[a]);
            linha[a] = leitor.readLine();
            a = a + 1;
        }

        leitor.close();
        /* Tinha esquecido dessa linha */

    }
    ArrayList<String> linhas;

    public ArrayList<String> getLinhasArquivo(File file) throws FileNotFoundException, IOException {

        try (BufferedReader leitor = new BufferedReader(new FileReader("tabelas.txt"))) {
            linhas = new ArrayList<>();
            String linha = "";

            while ((linha = leitor.readLine()) != null) {
                if (linha.length() > 0) {
                    linhas.add(linha);
                    //System.out.println(linha);
                    
                    String Pokemons  []= linha.split("\t");
                    System.out.println(Pokemons);
                    
                    
                }
            }
        }
        return linhas;
    }

    
}
    /*

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void exibirPokemonsLista() {
        System.out.println("Pokemons:");
        for (Pokemon P : pokemons) {
            System.out.println(P.toString());
        }
    }

    public Map<Integer, Pokemon> getMapa() {
        return mapa;
    }

    public void exibirPokemonsMapa() {
        System.out.println("Pokemons do mapa:");
        for (int i = 1; i <= mapa.size(); i++) {
            System.out.println(i + " - " + mapa.get(i));
        }
    }
}
     */
