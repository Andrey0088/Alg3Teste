/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author alanb
 */
public class NEWRPG {
    
        public static void imprimirPersonagem(MAGO person){
        boolean impreme = true;
            while (impreme){
            
                JOptionPane.showMessageDialog(null,"Status Mago" + person.getMagia() + person.getDescricao());
                // fazer em array
            }
            
            
    }
  

    public static void main(String[] args) {
        
               
        Path diretorio = Paths.get("C:/Users/alanb/OneDrive/Área de Trabalho/arquivos_java_alg3");
        Files.isDirectory(diretorio);//retorna true.
        ArrayList<MAGO> listaPersonagem = new ArrayList<>();
        int vida=0;
        int danoF=0;
        String nome="";
        int resistenciaF=0;
        int resistenciaM=0;
        int danoM=0;
        int raca=0;
        int sexo=0;
        String  descricao ="";
        String magia = "";
        double poder =0.0;
        int HUMANOsorcere = 0;
        
        
        // mensagens de inicio do jogo
        // descrição das raças
    
        
        //  int overlord, int sorcere, int spelholler, double poder,int vida, int danoF, String nome, 
         //   int resistenciaF, int resistenciaM, int danoM, int raca, String descricao, String magia
         //personagem magos = new mago(overlord, sorcere, spelholler, poder,
         //  vida, danoF, nome, resistenciaF, resistenciaM, danoM, raca, descricao, magia );
        boolean opcao= true;
        while (opcao){
            MAGO person = new sorcere(HUMANOsorcere,poder, vida, danoF, nome, resistenciaF, resistenciaM, danoM, raca, descricao, magia);
           

            int menu = Integer.parseInt(JOptionPane.showInputDialog(
                    "BEM-VINDO AO RPG\n"
                    +"1 - Cadastro"
                    +"2 - Ver descrição dos personagens em geral"
                    +"3 - Ver descrição dos seus personagens"
                    + "0- Para encerrar o programa"));
            switch (menu){
                case 1 -> {
                    nome = JOptionPane.showInputDialog("Nome do personagem");
                    int classe = Integer.parseInt (JOptionPane.showInputDialog("Qual a classe que deseja escolher?"
                            + "1 - mago"
                            + "2 - fighter"));
                    if (classe == 1){
                            raca = Integer.parseInt (JOptionPane.showInputDialog("Qual a raça de mago deseja escolher?"
                            + "1 - humano"
                            + "2 - Dark Elfo"
                            + "3 - Orc"));
                        if (raca == 1 || raca == 2 || raca == 3){
                            boolean certeza = true;
                            while (certeza){
                                int duvida = Integer.parseInt(JOptionPane.showInputDialog(null,"Voce tem certeza da raça que deseja?"
                                    + "1 - SIM"
                                    + "2 - NAO, QUERO ESCOLHER OUTRA RAÇA"));
                                if (duvida == 1){
                                certeza = false;
                                }else{
                                    raca = Integer.parseInt (JOptionPane.showInputDialog("Qual a raça que deseja escolher?"
                                    + "1 - Orc"
                                    + "2 - Dark Elfo"
                                    + "3 - Humano"));
                                    }
                            }
                            if (raca == 1){ // adiciona  a raça espe na lista
                                ((sorcere) person).HUMANOsorcere();// castin
                            
                            }else if (raca == 2){
                                
                            }else if (raca == 3){
                                
                            }
                            
                        listaPersonagem.add(person);// adiciona no personagem a raça e o nome;// LEMBRETE COLOCAR O SEXO NAS SUBCLASSE.
                        
                        
                        }
                        
                    }

                }
                case 2->{
                    imprimirPersonagem(person);
                    
                }
                    
               
            }
        }
        
        //(sorcere) person).HUMANOsorcere()
        
    }
    

}






