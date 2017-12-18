package br.din.uem.pokemon;

public class Pokemon {

   
    private int level;
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
    //private Status statusPrimario;
    Especie especie;
    private Ataque ataque1;
    private Ataque ataque2;
    private Ataque ataque3;
    private Ataque ataque4;
    private String nome;
    private double atributoValor;
    private double baseHp, baseAtk, baseDef, baseSpe, baseSpd;
 
    // Dados secundários
    int id;
    double baseHP;
    int baseATK;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Ataque getAtaque1() {
        return ataque1;
    }

    public void setAtaque1(Ataque ataque1) {
        this.ataque1 = ataque1;
    }

    public Ataque getAtaque2() {
        return ataque2;
    }

    public void setAtaque2(Ataque ataque2) {
        this.ataque2 = ataque2;
    }

    public Ataque getAtaque3() {
        return ataque3;
    }

    public void setAtaque3(Ataque ataque3) {
        this.ataque3 = ataque3;
    }

    public Ataque getAtaque4() {
        return ataque4;
    }

    public void setAtaque4(Ataque ataque4) {
        this.ataque4 = ataque4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseHP() {
        return baseHP;
    }

    public void setBaseHP(double baseHP) {
        this.baseHP = baseHP;
    }

    public int getBaseATK() {
        return baseATK;
    }

    public void setBaseATK(int baseATK) {
        this.baseATK = baseATK;
    }
    

    public Pokemon() {

    }
    
    
    
    public Pokemon(Especie especie, Ataque ataque1, Ataque ataque2, Ataque ataque3, Ataque ataque4) {
        /* this.hpAtual = especie.calcularAtributoHpAtual(level);
        this.hpMax = especie.calcularAtributoHpAtual(level);
        this.atk = especie.calcularAtributoAtk(level);
        this.def = especie.calcularAtributoDef(level);
        this.spe = especie.calcularAtributoSpe(level);
        this.spd = especie.calcularAtributoSpd(level); */
        this.modifierAccuracy = 0;
        this.modifierEvasion = 0;
        this.modifierAtk = 0;
        this.modifierDef = 0;
        this.modifierSpe = 0;
        this.modifierSpd = 0;
        this.confusion = false;
        this.flinch = false;
        //this.statusPrimario = Status.valueOf("OK");
        this.especie = especie;
        this.ataque1 = ataque1;
        this.ataque2 = ataque2;
        this.ataque3 = ataque3;
        this.ataque4 = ataque4;
    }

    public static Pokemon escolhaPokemon(Especie especie, Ataque ataque1, Ataque ataque2, Ataque ataque3, Ataque ataque4) {
        Pokemon pokemon = new Pokemon (especie, ataque1, ataque2, ataque3, ataque4);
        return pokemon;
    }
    
    public double valorAtributo() {

        return atributoValor;
    }
}
