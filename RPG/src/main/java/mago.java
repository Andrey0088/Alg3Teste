
public abstract class  mago extends personagem implements interface_status_mago {
    
    protected double magia1;
    protected int magia2;
    protected int magia3;
    protected String descricaoM;
    protected double orc;

    public mago(double magia1, int magia2, int magia3, String descricaoM, double poder, int vida, int danoF, String nome, int resistenciaF, int resistenciaM, int danoM, int raca, int sexo) {
        super(vida, danoF, nome, resistenciaF, resistenciaM, danoM, raca, sexo);
        this.magia1 = magia1;
        this.magia2 = magia2;
        this.magia3 = magia3;
        this.descricaoM = descricaoM;
        this.orc = orc;
    }

   
    
    public void status_mago(){}
 
    public void ORCoverlord( ){
        
    }
    public void sorcere(){
        
    }
    
    
}
