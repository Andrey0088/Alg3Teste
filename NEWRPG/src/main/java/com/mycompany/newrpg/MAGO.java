package com.mycompany.newrpg;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alanb
 */
public class MAGO {
    public int vida; // vida e cp
    public int danoF; // dano fisico e chance de critico
    public String nome; //nome do personagem
    public int resistenciaF; // resistencia a fisica
    public int resistenciaM; // resistencia a magias
    public int danoM; // dano magico
    public int raca; // raça do personagem
    public String descricao;
    public String magia;

    public MAGO(int vida, int danoF, String nome, int resistenciaF, int resistenciaM, int danoM, int raca, String descricao, String magia) {
        this.vida = vida;
        this.danoF = danoF;
        this.nome = nome;
        this.resistenciaF = resistenciaF;
        this.resistenciaM = resistenciaM;
        this.danoM = danoM;
        this.raca = raca;
        this.descricao = descricao;
        this.magia = magia;
    }
    
   
    
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDanoF() {
        return danoF;
    }

    public void setDanoF(int danoF) {
        this.danoF = danoF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getResistenciaF() {
        return resistenciaF;
    }

    public void setResistenciaF(int resistenciaF) {
        this.resistenciaF = resistenciaF;
    }

    public int getResistenciaM() {
        return resistenciaM;
    }

    public void setResistenciaM(int resistenciaM) {
        this.resistenciaM = resistenciaM;
    }

    public int getDanoM() {
        return danoM;
    }

    public void setDanoM(int danoM) {
        this.danoM = danoM;
    }

    public int getRaca() {
        return raca;
    }

    public void setRaca(int raca) {
        this.raca = raca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }
    
}
