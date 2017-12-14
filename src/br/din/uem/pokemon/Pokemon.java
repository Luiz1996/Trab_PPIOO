package br.din.uem.pokemon;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    
    private int nivel;
    private double hpAtual;
    private double hpMax; 
    private double atk;
    private double def;
    private double spe;
    private double spd;
    private int modifierAccuracy;
    private int modifierEvasion;
    private int modifierAtk;
    private int modifierDef;
    private int modifierSpe;
    private int modifierSpd;
    private boolean confusion;
    private boolean flinch;

    private int id;
    private String especie;
    private String type1;
    private String type2;
    private int baseHP;
    private int baseATK;
    private int baseDEF;
    private int baseSPE;
    private int baseSPD;
    private List<Golpe> golpes = new ArrayList<>();

    public Pokemon(String id, String especie, String type1, String type2, String baseHP, String baseATK, String baseDEF, String baseSPE, String baseSPD, int nivel, List<Golpe> golpes ) {
        this.id = Integer.parseInt(id);
        this.baseHP = Integer.parseInt(baseHP);
        this.baseATK = Integer.parseInt(baseATK);
        this.baseDEF = Integer.parseInt(baseDEF);
        this.baseSPE = Integer.parseInt(baseSPE);
        this.baseSPD = Integer.parseInt(baseSPD);
        this.especie = especie;
        this.type1 = type1;
        this.type2 = type2;
        this.golpes = golpes;
        this.nivel = nivel;
        
        
    }

    public Pokemon() {
    }
    

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getHpAtual() {
        return hpAtual;
    }

    public void setHpAtual(double hpAtual) {
        this.hpAtual = hpAtual;
    }

    public double getHpMax() {
        return hpMax;
    }

    public void setHpMax(double hpMax) {
        this.hpMax = hpMax;
    }

    public double getAtk() {
        return atk;
    }

    public void setAtk(double atk) {
        this.atk = atk;
    }

    public double getDef() {
        return def;
    }

    public void setDef(double def) {
        this.def = def;
    }

    public double getSpe() {
        return spe;
    }

    public void setSpe(double spe) {
        this.spe = spe;
    }

    public double getSpd() {
        return spd;
    }

    public void setSpd(double spd) {
        this.spd = spd;
    }

    public int getModifierAccuracy() {
        return modifierAccuracy;
    }

    public void setModifierAccuracy(int modifierAccuracy) {
        this.modifierAccuracy = modifierAccuracy;
    }

    public int getModifierEvasion() {
        return modifierEvasion;
    }

    public void setModifierEvasion(int modifierEvasion) {
        this.modifierEvasion = modifierEvasion;
    }

    public int getModifierAtk() {
        return modifierAtk;
    }

    public void setModifierAtk(int modifierAtk) {
        this.modifierAtk = modifierAtk;
    }

    public int getModifierDef() {
        return modifierDef;
    }

    public void setModifierDef(int modifierDef) {
        this.modifierDef = modifierDef;
    }

    public int getModifierSpe() {
        return modifierSpe;
    }

    public void setModifierSpe(int modifierSpe) {
        this.modifierSpe = modifierSpe;
    }

    public int getModifierSpd() {
        return modifierSpd;
    }

    public void setModifierSpd(int modifierSpd) {
        this.modifierSpd = modifierSpd;
    }

    public boolean isConfusion() {
        return confusion;
    }

    public void setConfusion(boolean confusion) {
        this.confusion = confusion;
    }

    public boolean isFlinch() {
        return flinch;
    }

    public void setFlinch(boolean flinch) {
        this.flinch = flinch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public int getBaseHP() {
        return baseHP;
    }

    public void setBaseHP(int baseHP) {
        this.baseHP = baseHP;
    }

    public int getBaseATK() {
        return baseATK;
    }

    public void setBaseATK(int baseATK) {
        this.baseATK = baseATK;
    }

    public int getBaseDEF() {
        return baseDEF;
    }

    public void setBaseDEF(int baseDEF) {
        this.baseDEF = baseDEF;
    }

    public int getBaseSPE() {
        return baseSPE;
    }

    public void setBaseSPE(int baseSPE) {
        this.baseSPE = baseSPE;
    }

    public int getBaseSPD() {
        return baseSPD;
    }

    public void setBaseSPD(int baseSPD) {
        this.baseSPD = baseSPD;
    }

    public List<Golpe> getGolpes() {
        return golpes;
    }

    public void setGolpes(List<Golpe> golpes) {
        this.golpes = golpes;
    }

}
