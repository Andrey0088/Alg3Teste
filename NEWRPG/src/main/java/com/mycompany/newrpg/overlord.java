/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newrpg;

/**
 *
 * @author alanb
 */
public class overlord extends personagem implements StatusMago{
    private int ORCoverlord;
    protected double poderOver;

    public overlord(int ORCoverlord, double poderOver, int vida, int danoF, String nome, int resistenciaF, 
            int resistenciaM, int danoM, int raca, String descricao, String magia,int vitoria, int derrota) {
        super(vida, danoF, nome, resistenciaF, resistenciaM, danoM, raca, descricao, magia, vitoria, derrota);
        this.ORCoverlord = ORCoverlord;
        this.poderOver = poderOver;
          
    }

    
    @Override
          public void StatusBaseMago(){
                super.setDescricao(    "ORC-MAGO-OVERLORD\n\n"
                        + "Overlord possuem alta resistencia(Fisica e magica)\n" +
                                       "pouco dano, porem dura muito em batalha\n" +
                                       "vantagens: campo aberto e batalhas longas\n");

                // criar o nivel de poderOver

                super.setMagia("Suga sangue dos inimigos\n "
                        + "Steal Essence transfere a vida do inimigo pra voce\n"
                        + "Perfeito para batalhas longas.\n");
        }

    public int ORCoverlord() {
                super.setRaca(3);
                super.setDescricao(    "Overlord possuem alta resistencia(Fisica e magica)\n" +
                                       "pouco dano, porem dura muito em batalha\n" +
                                       "vantagens: campo aberto e batalhas longas\n");

                // criar o nivel de poderOver

                super.magia = (" Suga sangue dos inimigos\n "
                        + "Steal Essence transfere a vida do inimigo pra voce\n"
                        + "Perfeito para batalhas longas.\n");
                        

               super.setDanoF(getDanoF()+25);
               super.setDanoM(getDanoM()+35);
               super.setResistenciaF(getResistenciaF()+25);
               super.setResistenciaM(getResistenciaM()+35);
               super.setNome(getNome());
               super.setVida(getVida()+350);

               return ORCoverlord = 3;  
    }



    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getpoderOver() {
        return poderOver;
    }

    public void setpoderOver(double poderOver) {
        this.poderOver = poderOver;
    }
    public int getVitoria() {
        return vitoria;
    }

    public int getDerrota() {
        return derrota;
    }
    @Override
    public int getDanoM() {
        return danoM;
    }

    @Override
    public void setDanoM(int danoM) {
        this.danoM = danoM;
    }
    
    
        
    
 
}
