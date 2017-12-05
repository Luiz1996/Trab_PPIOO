package br.din.uem.pokemon;

public class Pokemon {

    String nome;

    private int level, modifierAccuracy, modifierEvasion, modifierAtk, modifierDef, modifierSpe, modifierSpd, num;
    private double hpAtual, hpMax, atk, def, spe, spd, atributoValor;
    private boolean confusion, flinch;

    // Dados secundários
    int id;
    int baseHP;
    int baseATK;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    int baseDEF;
    int baseSPE;
    int baseSPD;
    String especie;
    String type1;
    String type2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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

    public double getAtributoValor() {
        return atributoValor;
    }

    public void setAtributoValor(double atributoValor) {
        this.atributoValor = atributoValor;
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
    
    

    public Pokemon[] getTodosPokemons() {
        return todosPokemons;
    }

    public void setTodosPokemons(Pokemon[] todosPokemons) {
        this.todosPokemons = todosPokemons;
    }

    public Pokemon(String nome, int level, int num) {
        this.nome = nome;
        this.level = level;
        this.num = num;
    }

    public Pokemon() {

    }

    public double valorAtributo() {

        return atributoValor;
    }

    Pokemon[] todosPokemons = new Pokemon[12];

    public void todosPokemons() {

        todosPokemons[0] = new Pokemon("Bulbasaur", 10, 1);
        todosPokemons[1] = new Pokemon("Ivysaur", 30, 2);
        todosPokemons[2] = new Pokemon("Venusaur", 8, 3);
        todosPokemons[3] = new Pokemon("Charmander", 6, 4);
        todosPokemons[4] = new Pokemon("Charmeleon", 8, 5);
        todosPokemons[5] = new Pokemon("Charizard", 40, 6);
        todosPokemons[6] = new Pokemon("Squirtle", 20, 7);
        todosPokemons[7] = new Pokemon("Wartortle", 8, 8);
        todosPokemons[8] = new Pokemon("Blastoise", 8, 9);
        todosPokemons[9] = new Pokemon("Caterpie", 6, 10);
        todosPokemons[10] = new Pokemon("Metapod", 8, 11);
        todosPokemons[11] = new Pokemon("Pikachu", 10, 12);
        System.out.println("Pokemons disponíveis para escolha: ");

        for (int i = 0; i < todosPokemons.length; i++) {
            System.out.println(todosPokemons[i].num + " - Pokemon: " + todosPokemons[i].nome + " | Level: " + todosPokemons[i].level);
        }
    }

    public Pokemon escolhaPokemon(int i) {
        return todosPokemons[i];
    }
}
