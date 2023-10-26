package com.mycompany.newrpg;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alanb
 */
public class Titan extends personagem implements StatusFighter{
    private int OrcTitan;
    protected double poderTitan;

    public Titan(int OrcTitan, double poderTitan, int vida, int danoF, String nome, int resistenciaF,
            int resistenciaM, int danoM, int raca, String descricao, String magia, int vitoria, int derrota) {
        super(vida, danoF, nome, resistenciaF, resistenciaM, danoM, raca, descricao, magia, vitoria, derrota);
        this.OrcTitan = OrcTitan;
        this.poderTitan = poderTitan;
    }

    public void StatusBaseFighter(){

        super.setDescricao("ORC -FIGHTER- TITAN\n\n"
                + "Treinados na arte da sagrada\n"
                + "Possuem grande força fisica corpo-a-corpo\n"
                + "vantagens = locais com pouco espaço\n"
                + "desvantagens = ficar longe do inimigo\n");
        super.setMagia("Não possui magia\n"
                + "Sua habilidade especial é a arte da espada unica.");

    }
    public int OrcTitan(){
        super.setRaca(3);

        super.setDanoF(getDanoF() + 30);
        super.setDanoM(getDanoM() +1);
        super.setResistenciaF(getResistenciaF() + 30);
        super.setResistenciaM(getResistenciaM() + 10);
        super.setVida(getVida() + 300);
        super.setRaca(3);
        super.setNome(getNome());

        return OrcTitan = 5;
    }
    public double getPoderTitan() {
        return poderTitan;
    }

    public void setPoderTitan(double poderTitan) {
        this.poderTitan = poderTitan;
    }

    @Override
    public int getDanoF() {
        return danoF;
    }
    public int getVitoria() {
        return vitoria;
    }

    public int getDerrota() {
        return derrota;
    }
    @Override
    public void setDanoF(int danoF) {
        this.danoF = danoF;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
