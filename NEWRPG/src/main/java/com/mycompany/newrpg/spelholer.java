/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newrpg;

/**
 *
 * @author alanb
 */
public class spelholer extends MAGO implements StatusMago {
    private int ElfoSpelholer;
    protected double poder;

    public spelholer(int ElfoSpelholer, double poder, int vida, int danoF, String nome, int resistenciaF, int resistenciaM, int danoM, int raca, String descricao, String magia) {
        super(vida, danoF, nome, resistenciaF, resistenciaM, danoM, raca, descricao, magia);
        this.ElfoSpelholer = ElfoSpelholer;
        this.poder = poder;
        this.StatusBaseMago();
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
        public int ElfoSpelholer(){
         super.setRaca(2);
         super.setDescricao("Spellhowler (SH) são feiticeiros ofensivos (nukers)"
                 + " dos Elfos Negros. Eles usam vestes e podem usar qualquer arma,"
                 + " mesmo que geralmente prefiram aqueles com alto M.Atk. Elfos negros foram muito gananciosos e entraram numa guerra com os elfos brancos"
                 + "Por isso se descolaram para a floresta negra, e se aperfeiçoaram na arte da magia negra."
                 + "Por ser mago possui baixa resistencia fisica, porem em local adequado se torna muito forte."
                 + "O Spellhowler usa o mais alto grau de magia elemental. Uma mistura de Feiticeiro e Necromante,"
                 + " ele lança magia tomando emprestado o poder do vento. O Spellhowler causa fortes danos com a Tempestade,"
                 + " que cria um tornado ao redor de seu alvo, ou ele pode usar o Furacão para disparar lâminas de vento à distância.");
        super.setMagia("Cria um turbilhão de destruição. HURRICANE(FURACÃO)"
                + "Alto poder magico, porem demora muito para ser lançado.");
       super.setDanoF(getDanoF()+19);
       super.setDanoM(getDanoM()+45);
       super.setResistenciaF(getResistenciaF()+13);
       super.setResistenciaM(getResistenciaM()+20);
       super.setNome(getNome());
       super.setVida(getVida()+190);
       this.poder = getDanoM() * getResistenciaM();
       
        return ElfoSpelholer = 2;
        

    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
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

    @Override
    public void setDanoM(int danoM) {
        this.danoM = danoM;
    }
        
        
    
}
