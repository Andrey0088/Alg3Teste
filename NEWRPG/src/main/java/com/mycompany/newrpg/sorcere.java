package com.mycompany.newrpg;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alanb
 */
public class sorcere extends MAGO implements StatusMago{
    private int HUMANOsorcere;
    protected double poder;
    public sorcere(int HUMANOsorcere, double poder, int vida, int danoF, String nome, int resistenciaF, int resistenciaM, int danoM, int raca, String descricao, String magia) {
        super(vida, danoF, nome, resistenciaF, resistenciaM, danoM, raca, descricao, magia);
        this.HUMANOsorcere = HUMANOsorcere;
        this.poder = poder;
        this.StatusBaseMago();
    }
     
    
        public void StatusBaseMago(){
            
         super.descricao = "Mago\n"
                + "O mago é uma classe das raças e cada raça possui um tipo espeficifico com atributos e status diferente, porem\n"
                + "todos tem a mesma base, mas a busca por poder torna cada um unico.\n"
                + "o sexo nao define nada, logo as raças nao possui macho ou femea, possui apenas guerreiros e magos.\n"
                + "Status bases da classe mago:\n";
        super.setDanoF(20);
        this.setDanoM(50);
        super.setResistenciaF(15);
        super.setResistenciaM(35) ;
        super.setVida(300);
        this.poder = 20;
        
        
        }
        
        
        public int HUMANOsorcere(){
        super.setRaca(1);
        super.setDescricao ( "SORCERE - MAGO DO FOGO"
                + "\né muito perplexo, sendo conhecedor do poder dos elementais, \n"
                + "\ne usando magias extremas com eles. Ele auxilia seus aliados colocando em chamas seus\n"
                + "\ninimigos de uma longa distância usando Prominence. Inimigos do Sorceress são colocados \n"
                + "\npara dormir com Sleeping Cloud. (* Ótimo veneno. Seu dano principal é baseado no fogo. Seu dano \n"
                + "\né bom e sua velocidade de locomoção é ruim. *)\n"
                + "\nPor ser mago possui baixa resistencia fisica, mas em locais adequados pode se sobressair sobre seus\n"
                + "\noponentes\n"
                    );
        
        super.setMagia (" Prominence\n"
                + "Baseado em fogo possui poder 40\n"
                + "Prominence é uma bola de fogo que ao se desperida se torna\n "
                + "mortal foi se afinal ao longo do caminho causando muito dano ao inimigo\n");
       // criar o nivel de poder
       
       super.setDanoF(getDanoF()+20);
       super.setDanoM(getDanoM()+40);
       super.setResistenciaF(getResistenciaF()+15);
       super.setResistenciaM(getResistenciaM()+25);
       super.setNome(getNome());
       super.setVida(getVida()+150);
       this.poder = getDanoM() * getResistenciaM();

       return HUMANOsorcere = 1;
  
    }

    @Override
    public int getDanoM() {
        return danoM;
    }

    @Override
    public void setDanoM(int danoM) {
        this.danoM = danoM;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }
       
    
    
}
