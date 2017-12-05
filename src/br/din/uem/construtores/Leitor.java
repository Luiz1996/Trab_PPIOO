/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.din.uem.construtores;

import br.din.uem.pokemon.Pokemon;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * private int level, modifierAccuracy, modifierEvasion, modifierAtk,
 * modifierDef, modifierSpe, modifierSpd, num; private double hpAtual, hpMax,
 * atk, def, spe, spd, atributoValor; private boolean confusion, flinch;
 *
 * @author TransDesk
 */
public class Leitor {

    private List<Pokemon> pokemons = new ArrayList<>();
    private Map<Integer, Pokemon> mapa = new HashMap<>();

    public void lerArquivoParaLista() {
        try {
            Scanner scan = new Scanner(new FileReader("tabelas.xlsx"));
            System.out.println("Arquivo lido com sucesso!");
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
                pokemons.add(P);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Leitor.class.getName()).log(Level.SEVERE,
                    null, ex);
            System.out.println("Arquivo invalido");
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
