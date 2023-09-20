
public class personagem {
    public int vida; // vida e cp
    public int danoF; // dano fisico e chance de critico
    public String nome; //nome do personagem
    public int resistenciaF; // resistencia a fisica
    public int resistenciaM; // resistencia a magias
    public int danoM; // dano magico
    public int raca; // raça do personagem
    public int sexo; // sexo escolhido pelo jogador.

    public personagem(int vida, int danoF, String nome, int resistenciaF, int resistenciaM, int danoM, int raca, int sexo) {
        this.vida = vida;
        this.danoF = danoF;
        this.nome = nome;
        this.resistenciaF = resistenciaF;
        this.resistenciaM = resistenciaM;
        this.danoM = danoM;
        this.raca = raca;
        this.sexo = sexo;
    }
    

   
    public void racas(String TipoRaca){
        
        
    }

    public int getDanoM() {
        return danoM;
    }

    public void setDanoM(int danoM) {
        this.danoM = danoM;
    }





   

  
    
    
    
}
