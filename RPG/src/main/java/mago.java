
public abstract class  mago extends personagem implements interface_status_mago {
    // CRIAR 3 MAGIAS ESPECIAL(PROTETED)    
   protected int overlord;
   protected int sorcere;
   protected int spelholler;
    public mago( int overlord, int sorcere, int spelholler,int vida, int danoF, String nome, int resistenciaF, int resistenciaM, int danoM, int raca, int sexo, String descricao, String magia) {
        super(vida, danoF, nome, resistenciaF, resistenciaM, danoM, raca, sexo, 
                descricao,  magia);
        this.overlord = overlord;
        this.sorcere = sorcere;
        this.spelholler = spelholler;
    }

   
    
    public void status_mago(){
        super.descricao = "Mago -  O mago é uma classe das raças e cada raça possui um tipo espeficifico com atributos e status diferente";
        this.danoF = 20;
        this.danoM = 50;
        this.resistenciaF = 15;
        this.resistenciaM = 35;
        this.vida = 3000;
    }


    
    
    public void sorcere(){
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
       // habilidade especial(magia)
       this.sorcere = 1;
  
    }
    
    
    
    public void spelholler(){
         super.setRaca(2);
         super.setDescricao("Spellhowler (SH) são feiticeiros ofensivos (nukers)"
                 + " dos Elfos Negros. Eles usam vestes e podem usar qualquer arma,"
                 + " mesmo que geralmente prefiram aqueles com alto M.Atk. Elfos negros foram muito gananciosos e entraram numa guerra com os elfos brancos"
                 + "Por isso se descolaram para a floresta negra, e se aperfeiçoaram na arte da magia negra."
                 + "Por ser mago possui baixa resistencia fisica, porem em local adequado se torna muito forte."
                 + "O Spellhowler usa o mais alto grau de magia elemental. Uma mistura de Feiticeiro e Necromante,"
                 + " ele lança magia tomando emprestado o poder do vento. O Spellhowler causa fortes danos com a Tempestade,"
                 + " que cria um tornado ao redor de seu alvo, ou ele pode usar o Furacão para disparar lâminas de vento à distância.");
               // habilidade especial(magia)
        super.setMagia("Cria um turbilhão de destruição. HURRICANE(FURACÃO)"
                + "Alto poder magico, porem demora muito para ser lançado.");
        this.spelholler = 2;

    }
    
        public void overlord( ){
        super.setRaca(3);
        super.setDescricao(    "É literalmente a classe para combate PvP. "
                + "O Dominator além de possuir buffs massivos insanos para seus companheiros "
                + "de clã ele pode enfraquecer os membros do clã inimigo limitando seu CP ou diminuindo "
                + "o efeito da cura de suas vidas. A inclusão de Dominators num clã pode garantir a vitória "
                + "da guerra com toda certeza.  Mas apesar de ser um trunfo no PvP em massa, contra monstros o "
                + "Dominator pode precisar de assistência para progredir de níveis. Além disso, essa classe de "
                + "orc possui curses(venenos)(efeito em area) tirando defesa e  ataques de seus inimigos, sendo "
                + "muito forte em PvP's 1x1 pois possuir muita resistencia."
);
        super.magia = " Steal Essence "
                + "Baseado em vampirismo magico"
                + "Suga o HP do inimigo convertando para si proprio"
                + "";
        this.overlord = 3;
    }
    
}
