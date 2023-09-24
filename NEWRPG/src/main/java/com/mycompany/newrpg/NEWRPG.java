package com.mycompany.newrpg;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 *
 * @author alanb
 */
public class NEWRPG {
    


public static void imprimirPersonagem(ArrayList<MAGO> listaPersonagem) {
    String[] opcoes = new String[listaPersonagem.size()];
    
    for (int i = 0; i < listaPersonagem.size(); i++) {
        opcoes[i] = listaPersonagem.get(i).getNome();
    }

    int escolha = JOptionPane.showOptionDialog(null, "Escolha um personagem:", "Lista de Personagens", 
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

    if (escolha != JOptionPane.CLOSED_OPTION) {
        MAGO mago = listaPersonagem.get(escolha);

        JOptionPane.showMessageDialog(null,
                "NOME DO CHAMPIAON:\n" + mago.getNome() +
                        "\nDESCRIÇÕES DA CLASSE\n" +
                        "MAGIA: \n" + mago.getMagia() +
                        "\nDESCRIÇÃO: \n" + mago.getDescricao());

        int verStatus = JOptionPane.showConfirmDialog(null, "Ver status do personagem?", "Ver Status", JOptionPane.YES_NO_OPTION);

        if (verStatus == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,
                    "NOME DO CHAMPIAON:\n" + mago.getNome() +
                            "\nPODER DE LUTA: \n" + ((sorcere) mago).getPoder() +
                            "\nDANO MAGICO: \n" + mago.getDanoM() +
                            "\nDANO FISICO: \n" + mago.getDanoF() +
                            "\nRESISTENCIA FISICA: \n" + mago.getResistenciaF() +
                            "\nRESISTENCIA MAGICA: \n" + mago.getResistenciaM() +
                            "\nVIDA DO PERSONAGEM: \n" + mago.getVida());
        }
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
            ((sorcere) person).StatusBaseMago(); // ocnfigurando os status base dos magos


            int menu = Integer.parseInt(JOptionPane.showInputDialog(
                    "BEM-VINDO AO RPG\n"
                    +"1 - COMO FUNCIONA O RPG\n"
                   + "2 - JOGAR - CADASTRAR PERSONAGEM"
                    +"3 - Ver descrição dos seus personagens\n"
                    +"4 - batalhar\n"
                    +"5 - ver status de batalha\n"
                    +"0- Para encerrar o programa\n"));
            switch (menu){
                case 1 ->{
                    JOptionPane.showMessageDialog(null, "                OLÁ CAMPEÃO"
                            + "\nRPG é um jogo de mundo aberto onde você batalha para conquistar itens e drops\n"
                            + "mas calma, aqui voce apenas irá escolher seu personagem e batalhar\n"
                            + "O jogo funciona da seguinte forma");
                    JOptionPane.showMessageDialog(null, "Voce ira escolher com qual classe deseja jogar\n"
                            + "é bem simples e intuitivo.");
                    JOptionPane.showMessageDialog(null, "               CLASSES :\n"
                            + "MAGO: Ataques magicos de longa distancia e possui venenos para diminuir o dano do inimigo\n"
                            + "dependentes de mana e distancia para conseguir ter vantagens sobre o inimigo\n"
                            + "A escolha do mago é perfeita para quem gosta de pensar em quais skills deseja usar no inimigo\n\n"
                            + "FIGHTER: Ataques de corpo a corpo, apenas o arqueiro depende da distancia\n"
                            + "Perfeito para quem gosta de movimentar o personagem na luta\n"
                            + "Contra magos podem se encontrarem em desvantagens dependendo da distancia(exceto o arqueiro)\n"
                            + "Ou seja, escolha bem suas lutas.\n\n"
                            );
                    JOptionPane.showMessageDialog(null, "              RAÇAS\n"
                            + "Dentro do nosso mundo existem 3 raças com suas classes predefinidas anteriormente\n\n");
                    
                    JOptionPane.showMessageDialog(null,"HUMANO (fighter)\n\n"
                            + "São arqueiros chamados de SAGITTARIUs"
                            + "rapida velocidade e dependem da distancia." // adicionar lore dos personagens
                            + "HUMANO(mago)\n\n"
                            + "Magos humanos sao dominadores de fogo, conhecidos como Sorcere's\n\n"
                            
                            + "ORC(Fighter)\n\n"
                            + "ORCs são treinados desde pequeno na arte da luta\n"
                            + "E a classe mais forte fisicamente dos Orc's é o Titan(Voce nao quer lutar corpo-a-corpo com esse cara)\n\n"
                            
                            + "ORC(Mago)\n\n"
                            + "Orc's se aperfeiçuaram na arte de roubar força vital(vida) e sao chamados de OVERLORD's\n"
                            + "São macumbeiros, entao envenena seus inimigos em area"
                            
                            + "DARK ELFO(Fighter)\n\n"
                            + "Os elfos negros lutadores sao rapidos chamados de DUELIST's dominadores de duas espadas\n"
                            + "Usam o estilo corpo-a-corpo\n"
                            + "Possui pouco dano, mas eles sao experientes em dar ataques mortais no seus inimigos\n\n"
                            
                            + "DARK ELFO(Mago) -> \n\n"
                            + "Elfos negros dominam a magia negra são chamados de SPELHOLLER\n"
                            + "Eles sao os magos negros que dominaram o vento");
                            
                }
                case 2 -> {
                    nome = JOptionPane.showInputDialog("Nome do personagem\n");
                    person.setNome(nome);
                    int classe = Integer.parseInt (JOptionPane.showInputDialog("""
                                                                               Qual a classe que deseja escolher?
                                                                               1 - mago
                                                                               2 - fighter"""));
                    if (classe == 1){
                            raca = Integer.parseInt (JOptionPane.showInputDialog("Qual a raça de mago deseja escolher?\n"
                            + "1 - humano\n"
                            + "2 - Dark Elfo\n"
                            + "3 - Orc"));
                       
                            if (raca == 1){ // adiciona  a raça espe na lista
                                ((sorcere) person).HUMANOsorcere();// castin
                                
                                
                                listaPersonagem.add(person);// adiciona no personagem a raça e o nome;// LEMBRETE COLOCAR O SEXO NAS SUBCLASSE.
                        
                            }
                                
                           
                        
                    }
                    break;
                }
                case 3->{
                    imprimirPersonagem(listaPersonagem);
                    break;
                }
                case 0->{
                   opcao = false; // Definindo opcao como false para sair do loop
                    break;
                }
                    
               default -> {
                       JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.", "AVISO",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        
        
    }
    

}






