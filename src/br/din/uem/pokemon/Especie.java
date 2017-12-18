package br.din.uem.pokemon;

public class Especie {
    
    private String nome, type1, type2;
    double baseHp;
    double baseAtk;
    double baseDef;
    double baseSpe;
    double baseSpd;
    private double atributoCalculado;
    int id;
    int level;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getBaseHp() {
        return baseHp;
    }

    public void setBaseHp(double baseHp) {
        this.baseHp = baseHp;
    }

    public double getBaseAtk() {
        return baseAtk;
    }

    public void setBaseAtk(double baseAtk) {
        this.baseAtk = baseAtk;
    }

    public double getBaseDef() {
        return baseDef;
    }

    public void setBaseDef(double baseDef) {
        this.baseDef = baseDef;
    }

    public double getBaseSpe() {
        return baseSpe;
    }

    public void setBaseSpe(double baseSpe) {
        this.baseSpe = baseSpe;
    }

    public double getBaseSpd() {
        return baseSpd;
    }

    public void setBaseSpd(double baseSpd) {
        this.baseSpd = baseSpd;
    }

    public double getAtributoCalculado() {
        return atributoCalculado;
    }

    public void setAtributoCalculado(double atributoCalculado) {
        this.atributoCalculado = atributoCalculado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Especie(int id, String especie, String tipo1, String tipo2, double HP, double ATK, double DEF, double SPE, double SPD, int level) {
        this.id = id;
        this.nome = especie;
        this.type1 = tipo1;
        this.type2 = tipo2;
        this.baseHp = HP;
        this.baseAtk = ATK;
        this.baseDef = DEF;
        this.baseSpe = SPE;
        this.baseSpd = SPD;
        this.level = level;
        
    }
    
    static Especie [] todosPokemons = new Especie[12];

    public static void todosPokemons() {

        todosPokemons[0] = new Especie (1, "Bulbasaur", "Grass", "Poison", 45, 49, 49, 65, 45, 1);
        todosPokemons[1] = new Especie (2, "Ivysaur", "Grass", "Poison", 60, 62, 63, 80, 60, 1);
        todosPokemons[2] = new Especie (3, "Venusaur","Grass", "Poison", 80, 82, 83, 100, 80, 1);
        todosPokemons[3] = new Especie (4, "Charmander", "Fire", "", 39, 52, 43, 60, 65, 1);
        todosPokemons[4] = new Especie (5, "Charmeleon", "Fire", "", 58, 64, 58, 80,80, 1);
        todosPokemons[5] = new Especie (6, "Charizard", "Fire", "Flying", 78, 84, 78, 109, 100, 1);
        todosPokemons[6] = new Especie (7, "Squirtle", "Water", "", 44, 48, 65, 50, 53, 1);
        todosPokemons[7] = new Especie (8, "Wartortle","Water", "", 59, 63, 80, 65, 58, 1);
        todosPokemons[8] = new Especie (9, "Blastoise","Water", "", 79, 83, 100, 85, 78, 1);
        todosPokemons[9] = new Especie (10, "Caterpie", "Bug", "", 45, 30, 35, 20, 45, 1);
        todosPokemons[10] = new Especie (11, "Metapod", "Bug", "", 50, 20, 55, 25,30, 1);
        todosPokemons[11] = new Especie (12, "Pikachu", "Eletric", "", 35, 55, 30, 50, 90, 1);
        System.out.print("Pokemons disponíveis para escolha. \n");

        for (int i = 0; i < todosPokemons.length; i++) {
            System.out.println(todosPokemons[i].id + " - " + todosPokemons[i].nome);
        }
    }

    public static Especie escolhaPokemon(int i) {
        return todosPokemons[i];
    }
    
    
    public double calcularAtributo(){
        //desenvolver
        
        return atributoCalculado;
    }
}
