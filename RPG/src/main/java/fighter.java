
public abstract class fighter extends personagem implements interface_status_fighter{

    protected int poder1;
    protected int poder2;
    protected int poder3;
    protected String descricaoF;

    public fighter(int poder1, int poder2, int poder3, String descricaoF, int vida, int danoF, String nome, int resistenciaF, int resistenciaM, int danoM, int raca, int sexo) {
        super(vida, danoF, nome, resistenciaF, resistenciaM, danoM, raca, sexo);
        this.poder1 = poder1;
        this.poder2 = poder2;
        this.poder3 = poder3;
        this.descricaoF = descricaoF;
    }
    
 
    
        
    public void status_fighter(){}
     

    
    public void lutador(){
        poder1 = 100;
        
    }
    
    
    
}
