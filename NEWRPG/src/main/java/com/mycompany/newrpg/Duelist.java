package com.mycompany.newrpg;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alanb
 */
public class Duelist extends personagem implements StatusFighter{
    private int ElfoDueslit;
    protected double poderDuelist;

    public Duelist(int ElfoDueslit, double poderDuelist, int vida, int danoF, String nome,
            int resistenciaF, int resistenciaM, int danoM, int raca, String descricao, String magia, int vitoria, int derrota) {
        super(vida, danoF, nome, resistenciaF, resistenciaM, danoM, raca, descricao, magia, vitoria, derrota);
        this.ElfoDueslit = ElfoDueslit;
        this.poderDuelist = poderDuelist;
    }

    /**
     *
     */
    @Override
     public void StatusBaseFighter(){

       super.setDescricao(  "DARK ELFO - FIGHTER - DUELIST\n\nTreinados na arte do Tagsun A Arte da Dupla espada\\n\n" +
                            "tecnicamente um personagem mediano que causa muita dor de cabeça\\n\n" +
                            "vantagens: curta distância, corpo-a-corpo\n" +
                            "desvantagens: Longa distância");
       super.setMagia(  "NAO POSSUI MAGIA\n" +
                        "Eles tem a habilidade tagsun\n" +
                        "pela força fisica impulsionam o vento desestabilizando os inimigos\n");
    }
     public int ElfoDueslit(){

       super.setRaca(5);
       
       super.setDanoF(getDanoF()+33);
       super.setDanoM(getDanoM()+3);
       super.setResistenciaF(getResistenciaF()+13);
       super.setResistenciaM(getResistenciaM()+7);
       super.setNome(getNome());
       super.setVida(getVida()+250);
       
       return ElfoDueslit = 5;
         
     }
   
    public double getPoderDuelist() {
        return poderDuelist;
    }

    public void setPoderDuelist(double poderDuelist) {
        this.poderDuelist = poderDuelist;
    }
    
    @Override
    public int getDanoF() {
        return danoF;
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

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
     
     
}
