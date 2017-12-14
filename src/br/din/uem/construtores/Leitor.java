
package br.din.uem.construtores;

import br.din.uem.pokemon.Golpe;
import br.din.uem.pokemon.Jogador;
import br.din.uem.pokemon.JogadorHumano;
import br.din.uem.pokemon.JogadorIA;
import br.din.uem.pokemon.Pokemon;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Leitor {

    private static List<String[]> arquivoPokemon = new ArrayList<>();
    private static List<String[]> arquivoGolpe = new ArrayList<>();
    
    public static void main(String[] args){

        try {
          FileReader arq = new FileReader("C:\\TabelaDeEspecies.txt");
          BufferedReader lerArq = new BufferedReader(arq);
          lerArq.readLine();
          while(lerArq.ready() == true){
              String[] atributos = lerArq.readLine().split("\t");            
              arquivoPokemon.add(atributos);
          }

        }catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
              e.getMessage());
        }
        
        try {
          FileReader arq2 = new FileReader("C:\\TabelaDeAtaques.txt");
          BufferedReader lerArq2 = new BufferedReader(arq2);
          lerArq2.readLine();
          while(lerArq2.ready() == true){
              String[] atributosGolpe = lerArq2.readLine().split("\t");            
              arquivoGolpe.add(atributosGolpe);
          }
        }catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
              e.getMessage());
        }
        
        inicializar_jogo();
    }
    

    private static void inicializar_jogo() {
    
        Scanner scan = new Scanner(System.in);
        Jogador[] jogadores = new Jogador[2]; 
        
        for (int i = 0; i < 1; i++) {
            
            int tipoJogador = scan.nextInt();
            int numeroPokemons = scan.nextInt();
            
                List<Pokemon> pokemons = new ArrayList<>();
            
            for (int j = 0; j < numeroPokemons; j++) {
                String[] atributos = arquivoPokemon.get(scan.nextInt()-1); //pegui o id e busquei no arquivo
                int nivel = scan.nextInt();
                List<Golpe> golpes = new ArrayList<>();
                int nrGolpe1 = scan.nextInt();
                if (nrGolpe1>0) {
                String[] atributosGolpe1 = arquivoGolpe.get(nrGolpe1-1); //pegui o id e busquei no arquivo
                Golpe g1 = new Golpe(atributosGolpe1[0], atributosGolpe1[1]); // conpletar com todos
                golpes.add(g1);
                }
                int nrGolpe2 = scan.nextInt();
                if (nrGolpe2>0) {
                String[] atributosGolpe2 = arquivoGolpe.get(nrGolpe2-1); //pegui o id e busquei no arquivo
                Golpe g2 = new Golpe(atributosGolpe2[0], atributosGolpe2[1]); // conpletar com todos
                golpes.add(g2);
                }
                int nrGolpe3 = scan.nextInt();
                if (nrGolpe3>0) {
                String[] atributosGolpe3 = arquivoGolpe.get(nrGolpe3-1); //pegui o id e busquei no arquivo
                Golpe g3 = new Golpe(atributosGolpe3[0], atributosGolpe3[1]); // conpletar com todos
                golpes.add(g3);
                }
                int nrGolpe4 = scan.nextInt();
                if (nrGolpe4>0) {
                String[] atributosGolpe4 = arquivoGolpe.get(nrGolpe4-1); //pegui o id e busquei no arquivo
                Golpe g4 = new Golpe(atributosGolpe4[0], atributosGolpe4[1]); // conpletar com todos
                golpes.add(g4);
                }
                             
                Pokemon pokemon = new Pokemon(atributos[0],atributos[1] , atributos[2], atributos[3], atributos[4],
                        atributos[5], atributos[6], atributos[7], atributos[8], nivel, golpes);
                pokemons.add(pokemon);
            }
            
            if(tipoJogador == 0){
                jogadores[i] = new JogadorIA(pokemons);
            }else{
                jogadores[i] = new JogadorHumano(pokemons);
            }
            
            
        }
        
    }
    

    public void lerArquivoParaMapa() {
        try {
            Scanner scan = new Scanner(new FileReader("tabelas.xlsx"));
            scan.nextLine();//para pular a linha do cabecalho
            while (scan.hasNext() || scan.hasNextDouble()) {
                int id = scan.nextInt();
                String especie = scan.next();
                String type1 = scan.next();
                String type2 = scan.next();
                int baseHP = scan.nextInt();
                int baseATK = scan.nextInt();
                int baseDEF = scan.nextInt();
                int baseSPE = scan.nextInt();
                int baseSPD = scan.nextInt();
                Pokemon P = new Pokemon();
                P.setId(id);
                P.setEspecie(especie);
                P.setType1(type1);
                P.setType2(type2);
                P.setBaseHP(baseHP);
                P.setBaseATK(baseATK);
                P.setBaseDEF(baseDEF);
                P.setBaseSPE(baseSPE);
                P.setBaseSPD(baseSPD);
                mapa.put(id, P);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Leitor.class.getName()).log(Level.SEVERE,
                    null, ex);
            System.out.println("Arquivo invalido");
        }
    }

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
