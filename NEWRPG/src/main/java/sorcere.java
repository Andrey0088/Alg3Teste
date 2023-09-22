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
    }
     
    
        public void StatusBaseMago(){
            
         super.descricao = "Mago -  O mago é uma classe das raças e cada raça possui um tipo espeficifico com atributos e status diferente, porem"
                + "todos tem a mesma base, mas a busca por poder torna cada um unico."
                + "o sexo nao define nada, logo as raças nao possui macho ou femea, possui apenas guerreiros e magos."
                + "Status bases da classe mago: ";
        super.setDanoF(20);
        super.setDanoM(50);
        super.setResistenciaF(15);
        super.setResistenciaM(35) ;
        super.setVida(300);
        this.poder = 20;
        
        
        }
        
        
        public int HUMANOsorcere(){
        super.setRaca(1);
        super.setDescricao ( "O Sorcerer é muito perplexo, sendo conhecedor do poder dos elementais, "
                + "e usando magias extremas com eles. Ele auxilia seus aliados colocando em chamas seus"
                + " inimigos de uma longa distância usando Prominence. Inimigos do Sorceress são colocados "
                + "para dormir com Sleeping Cloud. (* Ótimo veneno. Seu dano principal é baseado no fogo. Seu dano "
                + "é bom e sua velocidade de locomoção é ruim. *)"
                + "Por ser mago possui baixa resistencia fisica, mas em locais adequados pode se sobressair sobre seus "
                + "oponentes");
        super.setMagia (" Prominence"
                + "Baseado em fogo possui poder 40"
                + "Prominence é uma bola de fogo que ao se desperida se torna "
                + "mortal foi se afinal ao longo do caminho causando muito dano ao inimigo");
       // criar o nivel de poder
       
       super.setDanoF(getDanoF()+20);
       super.setDanoM(getDanoM()+40);
       super.setResistenciaF(getResistenciaF()+15);
       super.setResistenciaM(getResistenciaM()+25);
       super.getNome();
       super.setVida(getVida()+150);
       this.poder = getDanoM() * getResistenciaM();
       
       
       
       return HUMANOsorcere = 1;
  
    }
       
    
    
}
