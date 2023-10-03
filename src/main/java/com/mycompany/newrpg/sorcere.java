package com.mycompany.newrpg;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alanb
 */
public class sorcere extends personagem implements StatusMago{
    protected int HUMANOsorcere;
    private double poderSorce;
    public sorcere(int HUMANOsorcere, double poderSorce, int vida, int danoF, String nome,
            int resistenciaF, int resistenciaM, int danoM, int raca, String descricao, String magia, int vitoria, int derrota) {
        super(vida, danoF, nome, resistenciaF, resistenciaM, danoM, raca, descricao, magia, vitoria, derrota);
        this.HUMANOsorcere = HUMANOsorcere;
        this.poderSorce = poderSorce;
        
    }

    
    @Override
          public void StatusBaseMago(){
            
        super.setDescricao ( "HUMANO - MAGO - SORCERE\n\n"
                + "Sorcere's dominam o poder do fogo\n" +
                            "O possui alto dano, pouca resistencia e alta velocidade de ataque\n" +
"vantagens: local aberto\n" +
"desvantagens: locais fechados\n");
        
        super.setMagia (" Prominence\n"
                + "Baseado em fogo possui dano ardente\n"
                + "Prominence é uma bola de fogo que ao se desperida se torna\n "
                + "mortal foi se afinal ao longo do caminho causando muito dano ao inimigo\n");
        }



  
        public int HUMANOsorcere(){
        super.setRaca(1);

       // criar o nivel de poderSorce
       
       super.setDanoF(getDanoF()+20);
       super.setDanoM(getDanoM()+40);
       super.setResistenciaF(getResistenciaF()+15);
       super.setResistenciaM(getResistenciaM()+25);
       super.setNome(getNome());
       super.setVida(getVida()+150);
       
       
       
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
    public int getVitoria() {
        return vitoria;
    }

    @Override
    public int getDerrota() {
        return derrota;
    }
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPoderSorce() {
        return poderSorce;
    }

    public void setPoderSorce(double poderSorce) {
        this.poderSorce =  poderSorce;
    }

 
       
    
    
}
