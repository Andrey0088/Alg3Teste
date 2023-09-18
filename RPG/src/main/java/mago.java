
public abstract class  mago extends personagem implements interface_status_mago {
    
    protected int magia1;
    protected int magia2;
    protected int magia3;
    protected String descricaoM;
    private double poder;

    public mago(int magia1, int magia2, int magia3, String descricaoM, double poder, int vida, int danoF, String nome, int resistenciaF, int resistenciaM, int danoM, int raca, int sexo) {
        super(vida, danoF, nome, resistenciaF, resistenciaM, danoM, raca, sexo);
        this.magia1 = magia1;
        this.magia2 = magia2;
        this.magia3 = magia3;
        this.descricaoM = descricaoM;
        this.poder = poder;
    }

   
    
    public void status_mago(){}
 
    public void overlord(int poder, int magia){
        
    }
    public void sorcere(int poder_sorce, int magia){
        
    }
}
