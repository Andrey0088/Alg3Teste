/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newrpg;

/**
 *
 * @author alanb
 */
public class overlord extends MAGO implements StatusMago{
    private int overlord;
    protected double poder;

    public overlord(int overlord, double poder, int vida, int danoF, String nome, int resistenciaF, int resistenciaM, int danoM, int raca, String descricao, String magia) {
        super(vida, danoF, nome, resistenciaF, resistenciaM, danoM, raca, descricao, magia);
        this.overlord = overlord;
        this.poder = poder;
          
    }

    
    @Override
        public void StatusBaseMago(){
            
            super.descricao = "Mago\n"
                + "O mago é uma classe das raças e cada raça possui um tipo espeficifico, com atributos e status diferente, porem\n"
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

    public int getOverlord() {
                       super.setRaca(3);
                super.setDescricao(    "É literalmente a classe para combate PvP. "
                        + "O Dominator além de possuir buffs massivos insanos para seus companheiros "
                        + "de clã ele pode enfraquecer os membros do clã inimigo limitando seu CP ou diminuindo "
                        + "o efeito da cura de suas vidas. A inclusão de Dominators num clã pode garantir a vitória "
                        + "da guerra com toda certeza.  Mas apesar de ser um trunfo no PvP em massa, contra monstros o "
                        + "Dominator pode precisar de assistência para progredir de níveis. Além disso, essa classe de "
                        + "orc possui curses(venenos)(efeito em area) tirando defesa e  ataques de seus inimigos, sendo "
                        + "muito forte em PvP's 1x1 pois possuir muita resistencia.");

                // criar o nivel de poder

                super.magia = " Steal Essence "
                        + "Baseado em vampirismo magico"
                        + "Suga o HP do inimigo convertando para si proprio"
                        + "";

               super.setDanoF(getDanoF()+25);
               super.setDanoM(getDanoM()+35);
               super.setResistenciaF(getResistenciaF()+25);
               super.setResistenciaM(getResistenciaM()+35);
               super.setNome(getNome());
               super.setVida(getVida()+250);
               this.poder = getDanoM() * getResistenciaM();

               return overlord = 3;  
    }

    public void setOverlord(int overlord) {
        this.overlord = overlord;
    }
        
    
 
}
