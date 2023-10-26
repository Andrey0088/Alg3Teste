package com.mycompany.newrpg;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alanb
 */
public class sargittarius extends personagem implements StatusFighter{
    private int HumanoSargittarius;
    protected double poderSargittarius;

    public sargittarius(int HumanoSargittarius, double poderSargittarius, int vida,
            int danoF, String nome, int resistenciaF, int resistenciaM, int danoM, int raca, String descricao, String magia, int vitoria, int derrota) {
        super(vida, danoF, nome, resistenciaF, resistenciaM, danoM, raca, descricao, magia, vitoria,derrota);
        this.HumanoSargittarius = HumanoSargittarius;
        this.poderSargittarius = poderSargittarius;
    }

    public int HumanoSargittarius(){
       super.setRaca(4);
       
       super.setDanoF(getDanoF()+36);
       super.setDanoM(getDanoM()+4);
       super.setResistenciaF(getResistenciaF()+10);
       super.setResistenciaM(getResistenciaM()+10);
       super.setNome(getNome());
       super.setVida(getVida()+150);
       this.poderSargittarius = getDanoF() * getResistenciaM();
       return HumanoSargittarius = 4;
       
    }
        @Override
     public String toString() {
        return super.toString() +
           "Humano - Sargittarius N: " + getNome() + "\n" +
           "Poder - Sargittarius: " + poderSargittarius;
    }
    @Override
     public void nivel(){
        JOptionPane.showMessageDialog(null, "Nivel: 77");
    } 
    
    @Override
    public void StatusBaseFighter(){
       super.setDescricao(      "HUMANO- FIGHTER- SARGITTARIUS\n\nÉ o tipo mais basico de guerreiro\n" +
                                "Utilizando arco e flecha.\n" +
                                "vantagens: longa distância e velocidade\n" +
                                "desvantagens: ambientes fechados\n");
       
       super.setMagia(  "NAO POSSUI MAGIA\n" +
                        "A habilidade é o arco Angelical\n" +
                        "que aumenta seu poder fisico.");
    }
  
    public double getPoderSargittarius() {
        return poderSargittarius;
    }

    public void setPoderSargittarius(double poderSargittarius) {
        this.poderSargittarius = poderSargittarius;
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
    public int getVitoria() {
        return vitoria;
    }

    @Override
    public int getDerrota() {
        return derrota;
    }

    
    
}
