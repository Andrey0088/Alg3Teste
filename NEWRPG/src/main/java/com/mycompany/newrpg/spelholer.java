/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newrpg;

/**
 *
 * @author alanb
 */
public class spelholer extends personagem implements StatusMago {
    private int ElfoSpelholer;
    protected double poderSpel;

    public spelholer(int ElfoSpelholer, double poderSpel, int vida, int danoF, String nome, int resistenciaF,
            int resistenciaM, int danoM, int raca, String descricao, String magia, int vitoria, int derrota) {
        super(vida, danoF, nome, resistenciaF, resistenciaM, danoM, raca, descricao, magia, vitoria, derrota);
        this.ElfoSpelholer = ElfoSpelholer;
        this.poderSpel = poderSpel;
        
    }
    
    @Override
          public void StatusBaseMago(){
            
         super.setDescricao("DARK ELFO - MAGO -SPELHOLER\n\n"
                 + "Dominam o vento\n" +
                            "possuiem alto dano e media resistencia\n" +
                            "vantagens: local aberto e lutas rapidas\n" +
                            "desvantagens: locais fechados\n");
        super.setMagia("Hurrice - Bola de vento\n"
                      +"Alto dano no inimigo\n"
                      + "desestabiliza\n");
        }
         
        public int ElfoSpelholer(){
         super.setRaca(2);

       super.setDanoF(getDanoF()+19);
       super.setDanoM(getDanoM()+45);
       super.setResistenciaF(getResistenciaF()+13);
       super.setResistenciaM(getResistenciaM()+20);
       super.setNome(getNome());
       super.setVida(getVida()+190);
       
        return ElfoSpelholer = 2;
        

    }

    public double getpoderSpel() {
        return poderSpel;
    }

    public void setpoderSpel(double poderSpel) {
        this.poderSpel = poderSpel;
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
    public int getDanoM() {
        return danoM;
    }
    public int getVitoria() {
        return vitoria;
    }

    public int getDerrota() {
        return derrota;
    }
    @Override
    public void setDanoM(int danoM) {
        this.danoM = danoM;
    }
        
        
    
}
