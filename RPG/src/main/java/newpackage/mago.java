
public abstract class  mago extends personagem implements interface_status_mago {
    // CRIAR 3 MAGIAS ESPECIAL(PROTETED)    
   

    public mago( int vida, int danoF, String nome, int resistenciaF, int resistenciaM, int danoM, int raca, int sexo, String descricao, String magia) {
        super(vida, danoF, nome, resistenciaF, resistenciaM, danoM, raca, sexo, 
                descricao,  magia);
      
    }

   
    
    public void status_mago(){
        super.descricao = "Mago -  O mago é uma classe das raças e cada raça possui um tipo espeficifico com atributos e status diferente";
        this.danoF = 20;
        this.danoM = 50;
        this.resistenciaF = 15;
        this.resistenciaM = 35;
        this.vida = 3000;
    }

    public void overlord( ){
        super.setRaca(1);

        
        super.setDescricao(    "É literalmente a classe para combate PvP. "
                + "O Dominator além de possuir buffs massivos insanos para seus companheiros "
                + "de clã ele pode enfraquecer os membros do clã inimigo limitando seu CP ou diminuindo "
                + "o efeito da cura de suas vidas. A inclusão de Dominators num clã pode garantir a vitória "
                + "da guerra com toda certeza.  Mas apesar de ser um trunfo no PvP em massa, contra monstros o "
                + "Dominator pode precisar de assistência para progredir de níveis. Além disso, essa classe de "
                + "orc possui curses(venenos)(efeito em area) tirando defesa e  ataques de seus inimigos, sendo "
                + "muito forte em PvP's 1x1 pois possuir muita resistencia"
);
        super.magia = " Steal Essence "
                + "Baseado em vampirismo magico"
                + "Suga o HP do inimigo convertando para si proprio"
                + "";
        // habilidade especial(magia)

        //  PARA BATALHAS COMPARA MAGIAS
        
    }
    
    
    public void sorcere(){
        super.setRaca(2);
        super.setDescricao ( "O Sorcerer é muito perplexo, sendo conhecedor do poder dos elementais, "
                + "e usando magias extremas com eles. Ele auxilia seus aliados colocando em chamas seus"
                + " inimigos de uma longa distância usando Prominence. Inimigos do Sorceress são colocados "
                + "para dormir com Sleeping Cloud. (* Ótimo veneno. Seu dano principal é baseado no fogo. Seu dano "
                + "é bom e sua velocidade de locomoção é ruim. *)");
        super.setMagia (" Prominence"
                + "Baseado em fogo possui poder 40"
                + "Prominence é uma bola de fogo que ao se desperida se torna "
                + "mortal foi se afinal ao longo do caminho causando muito dano ao inimigo");
       // habilidade especial(magia)
       
       
        
        
        
    }
    
    public void spelholler(){
         super.setRaca(1);

               // habilidade especial(magia)

    }
    
    
    
}
