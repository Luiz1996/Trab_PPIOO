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

    public Pokemon(int id, String especie, String tipo1, String tipo2, int HP, int ATK, int DEF, int SPE, int SPD) {
        this.id = id;
        this.especie = especie;
        this.type1 = tipo1;
        this.type2 = tipo2;
        this.baseHP = HP;
        this.baseATK = ATK;
        this.baseDEF = DEF;
        this.baseSPE = SPE;
        this.baseSPD = SPD;
        
    }

    public Pokemon() {

    }

    public double valorAtributo() {

        return atributoValor;
    }

    Pokemon[] todosPokemons = new Pokemon[12];

    public void todosPokemons() {

        todosPokemons[0] = new Pokemon(1, "Bulbasaur", "Grass", "Poison", 45, 49, 49, 65, 45);
        todosPokemons[1] = new Pokemon(2, "Ivysaur", "Grass", "Poison", 60, 62, 63, 80, 60);
        todosPokemons[2] = new Pokemon(3, "Venusaur","Grass", "Poison", 80, 82, 83, 100, 80);
        todosPokemons[3] = new Pokemon(4, "Charmander", "Fire", "", 39, 52, 43, 60, 65);
        todosPokemons[4] = new Pokemon(5, "Charmeleon", "Fire", "", 58, 64, 58, 80,80);
        todosPokemons[5] = new Pokemon(6, "Charizard", "Fire", "Flying", 78, 84, 78, 109, 100);
        todosPokemons[6] = new Pokemon(7, "Squirtle", "Water", "", 44, 48, 65, 50, 53);
        todosPokemons[7] = new Pokemon(8, "Wartortle","Water", "", 59, 63, 80, 65, 58);
        todosPokemons[8] = new Pokemon(9, "Blastoise","Water", "", 79, 83, 100, 85, 78);
        todosPokemons[9] = new Pokemon(10, "Caterpie", "Bug", "", 45, 30, 35, 20, 45);
        todosPokemons[10] = new Pokemon(11, "Metapod", "Bug", "", 50, 20, 55, 25,30);
        todosPokemons[11] = new Pokemon(12, "Pikachu", "Eletric", "", 35, 55, 30, 50, 90);
        System.out.print("Pokemons disponíveis para escolha. \n");

        for (int i = 0; i < todosPokemons.length; i++) {
            System.out.println(todosPokemons[i].id + " - " + todosPokemons[i].especie);
        }
    }

    public Pokemon escolhaPokemon(int i) {
        return todosPokemons[i];
    }
}
