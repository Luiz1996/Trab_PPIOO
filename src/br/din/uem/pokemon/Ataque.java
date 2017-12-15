package br.din.uem.pokemon;

public class Ataque {
    
    private String nome, tipo, classe;
    private double ppMax, ppAtual, accuracy, critico, dano;
    private int id, power;
    private boolean acerto;
    
    public Ataque (int id, String nome, String tipo, int PP, int power, int accuracy, String Classe){
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.ppMax = PP;
        this.power = power;
        this.accuracy = accuracy;
        this.classe = classe;
    }
    
    Ataque[] todosAtaques = new Ataque[4];

    public void todosPokemons() {

        todosAtaques[0] = new Ataque(1, "Leech Life", "Bug", 15, 20, 100, "hp");
        todosAtaques[1] = new Ataque(2, "Pin Missile", "Bug", 20, 14, 85, "multihit");
        todosAtaques[2] = new Ataque(3, "String Shot","Bug", 40, 0, 95, "modifier");
        todosAtaques[3] = new Ataque (4, "Twineedle", "Bug", 20, 23, 100, "multihit");
        
        System.out.println("Ataques disponíveis para escolha. \n");

        for (int i = 0; i < todosAtaques.length; i++) {
            System.out.println(todosAtaques[i].id + " - " + todosAtaques[i].nome);
        }
    }

    public Ataque escolhaAtaque(int i) {
        return todosAtaques[i];
    }
    
    public void efeito(){
        //desenvolver
    }
    
    public double calculoCritico(){
        //desenvolver
        return critico;
    }
    
    public boolean calculoAcerto(){
        //esenvolver
       return acerto;
    }
    
    public double calculoDano(){
        //desenvolver
        return dano;
    }
}
