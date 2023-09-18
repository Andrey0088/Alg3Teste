/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alanb
 */
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;
import java.nio.file.*;

public class RPGon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path diretorio = Paths.get("C:/Users/alanb/OneDrive/Área de Trabalho/arquivos_java_alg3");
        Files.isDirectory(diretorio);//retorna true.
        ArrayList<personagem> listaPersonagem = new ArrayList<>();
        int vida=0;
        int danoF=0;
        String nome="";
        int resistenciaF=0;
        int resistenciaM=0;
        int danoM=0;
        int raca=0;
        int sexo=0;
        
        // mensagens de inicio do jogo
        // descrição das raças
    
        
        
        boolean opcao= true;
        while (opcao){
            personagem person = new personagem(vida, danoF, nome, resistenciaF, resistenciaM, danoM, raca, sexo);
            int menu = Integer.parseInt(JOptionPane.showInputDialog(
                    "BEM-VINDO AO RPG\n"
                    +"Cadastro"
                    +"Ver descrição dos personagens"
                    +""
                    +""
                    + "5- Para encerrar o programa"));
            switch (menu){
                case 1 -> {
                    nome = JOptionPane.showInputDialog("Nome do personagem");
                    sexo = Integer.parseInt(JOptionPane.showInputDialog("Qual o sexo do personagem? \n"
                            + "1 - Feminino"
                            + "2 - Masculino"
                            + "3 - Outros"));
                    raca = Integer.parseInt (JOptionPane.showInputDialog("Qual a raça que deseja escolher?"
                            + "1 - Orc"
                            + "2 - Dark Elfo"
                            + "3 - Humano"));
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
                        listaPersonagem.add(person);// adiciona no personagem a raça e o nome;// LEMBRETE COLOCAR O SEXO NAS SUBCLASSE.
                        
                        
                    }
                }
               
            }
        }
        
        
    }
    
}
