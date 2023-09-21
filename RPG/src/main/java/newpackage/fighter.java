
public abstract class fighter extends personagem implements interface_status_fighter{

    

   public fighter( int vida, int danoF, String nome, int resistenciaF, int resistenciaM, int danoM, int raca, int sexo, String descricao, String magia) {
        super(vida, danoF, nome, resistenciaF, resistenciaM, danoM, raca, sexo, 
                descricao,  magia);
      
    }
    
 
    public void status_fighter(){
        super.descricao = "fighter -  O fighter é uma classe das raças e cada raça possui um tipo específico com atributos e status diferentes.";
        this.danoF = 40;
        this.danoM = 22;
        this.resistenciaF = 30;
        this.resistenciaM = 17;
        this.vida = 4000;
    }
    
    public void orc( ){
        
        
    }
    
}
