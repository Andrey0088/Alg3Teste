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
    public static int escolherRacaClasseDescricao() {
        String[] opcoes = {"HUMANO (fighter) - SAGITTARIUs", "HUMANO(mago) - SORCERE", "ORC(Fighter) - TITAN", "ORC(Mago) - OVERLORD", "DARK ELFO(Fighter) - DUELISTA", "DARK ELFO(Mago) - SPELHOOLER"};

        return JOptionPane.showOptionDialog(null, "Escolha uma raça e classe:", "Escolha de Raça e Classe",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
 

}

    public static void ExplicaRaca(){
        int escolhaRacaClasse = escolherRacaClasseDescricao();
        switch (escolhaRacaClasse) {
            case 0 -> {
                // Exibir descrição para HUMANO (fighter) - SAGITTARIUs
                JOptionPane.showMessageDialog(null,  
                "HUMANO (fighter) - SAGITTARIUs\n\n"
                + "São arqueiros chamados de SAGITTARIUs\n"
                + "rapida velocidade e dependem da distancia.\n\n");
                // adicionar lore dos personagens

            }
            case 1 -> {
                // Exibir descrição para HUMANO(mago) - SORCERE
                JOptionPane.showMessageDialog(null, "HUMANO(mago) - SORCERE\n\n"
                + "Magos humanos sao dominadores de fogo, conhecidos como Sorcere's\n"
                + "Possuiem baixa resistencia fisica\n\n");
            }
            case 2 -> {
                // Exibir descrição para ORC(Fighter) - TITAN
                 JOptionPane.showMessageDialog(null,
                "ORC(Fighter) - TITAN \n\n"
                + "ORCs são treinados desde pequeno na arte da luta\n"
                + "E a classe mais forte fisicamente dos Orc's é o Titan(Voce nao quer lutar corpo-a-corpo com esse cara)\n\n");
            }
            case 3 -> {
                // Exibir descrição para ORC(Mago) - OVERLORD
                  JOptionPane.showMessageDialog(null, "ORC(Mago) - OVERLORD\n\n"
                + "Orc's se aperfeiçuaram na arte de roubar força vital(vida) e sao chamados de OVERLORD's\n"
                + "São macumbeiros, entao envenena seus inimigos em area\n"
                + "possui muita resistencia fisica e magica, mas são lentos\n\n");
            }
            case 4 -> {
                // Exibir descrição para DARK ELFO(Fighter) - DUELISTA
                JOptionPane.showMessageDialog(null,
                "DARK ELFO(Fighter) - DUELISTA\n\n"
                + "Os elfos negros lutadores sao rapidos chamados de DUELIST's dominadores de duas espadas\n"
                + "Usam o estilo corpo-a-corpo\n"
                + "Possui pouco dano, mas eles sao experientes em dar ataques mortais no seus inimigos.\n\n");
            }
            case 5 -> {
                // Exibir descrição para DARK ELFO(Mago) - SPELHOOLER
                JOptionPane.showMessageDialog(null, "DARK ELFO(Mago) - SPELHOOLER\n\n"
                + "Elfos negros que dominam a magia negra são chamados de SPELHOLLER\n"
                + "Eles sao os magos que dominaram o vento graças ao conhecimento da deusa da floresta negra Merlin");
            }
            default -> {
                // Caso o usuário tenha fechado a janela ou escolhido algo inválido
                JOptionPane.showMessageDialog(null,"Opcao invalida");
                }
        }
       
    }

    
       public static void statusDasClasses(MAGO perso){
        ((sorcere) perso).StatusBaseMago();
            JOptionPane.showMessageDialog(null, "STATUS BASE DA CLASSE - MAGO\n\n"
                    + "Descrição: \n"+perso.descricao+"\n\n "
                    + "Vida: \n" +perso.vida+"\n"
                    + "Dano Fisico: \n"+perso.danoF+"\n"
                    + "Dano Magico: \n"+perso.danoM+"\n"
                    + "Resistencia Fisica: \n"+perso.resistenciaF+"\n"
                    + "Resistencia Magica: \n"+perso.resistenciaM+"\n"
                    + "Poder geral(base): \n"+((sorcere)perso).getPoder());
           
       }


     public static void explicaoDoJogo (){
         JOptionPane.showMessageDialog(null, "OLÁ CAMPEÃO\n"
                            + "\nRPG é um jogo de mundo aberto onde você batalha para conquistar itens e drops\n"
                            + "mas calma, aqui voce apenas irá escolher seu personagem e batalhar\n"
                            + "O jogo funciona da seguinte forma");
                    JOptionPane.showMessageDialog(null, " Voce ira escolher com qual classe deseja jogar\n"
                            + "é bem simples e intuitivo.");
                    JOptionPane.showMessageDialog(null, "CLASSES :\n"
                            + "MAGO: Ataques magicos de longa distancia e possui venenos para diminuir o dano do inimigo\n"
                            + "dependentes de mana e distancia para conseguir ter vantagens sobre o inimigo\n"
                            + "A escolha do mago é perfeita para quem gosta de pensar em quais skills deseja usar no inimigo\n\n"
                            + "FIGHTER: Ataques de corpo a corpo, apenas o arqueiro depende da distancia\n"
                            + "Perfeito para quem gosta de movimentar o personagem na luta\n"
                            + "Contra magos podem se encontrarem em desvantagens dependendo da distancia(exceto o arqueiro)\n"
                            + "Ou seja, escolha bem suas lutas.\n\n"
                            );
                    JOptionPane.showMessageDialog(null, "RAÇAS\n\n"
                            + "Dentro do nosso mundo existem 3 raças com suas classes predefinidas anteriormente\n\n"
                            + "TODAS ESSAS 3 RAÇAS POSSUI AS DUAS CLASSES - MAGO E FIGHTER\n\n"
                            + "HUMANO's\n\n"
                            + "ORC's\n\n"
                            + "DARK's ELFO's");
                    
         
     }
     
     public static void CadastraPersonagem(MAGO person){
        ArrayList<MAGO> listaPersonagem = new ArrayList<>();
 
        
                    String nome = JOptionPane.showInputDialog("Nome do personagem\n");
                    
                    int classe = Integer.parseInt (JOptionPane.showInputDialog("""
                                                                               Qual a classe que deseja escolher?
                                                                               1 - mago
                                                                               2 - fighter"""));
                    if (classe == 1){
                            int raca = Integer.parseInt (JOptionPane.showInputDialog("Qual a raça de mago deseja escolher?\n"
                            + "1 - humano\n"
                            + "2 - Dark Elfo\n"
                            + "3 - Orc"));  
                       
                            if (raca == 1){ // adiciona  a raça espe na lista
                                ((sorcere) person).HUMANOsorcere(); // isso acessa os metodos especificos das classes filhas. serve para imprimir tambem.
                                ((sorcere)person).setNome(nome);
                                
                                listaPersonagem.add(person);// adiciona no personagem a raça e o nome;// LEMBRETE COLOCAR O SEXO NAS SUBCLASSE.
                        
                            }
       
                    }
            
         
     }
////////////////////////////////////////////////////////////////////////////////
                            // metodos especificios acima//
     ///////////////////////////////////////////////////////////////////////////
                           // main do programa abaixo//
     //////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
               
        ArrayList<MAGO> listaPersonagem = new ArrayList<>();
        
        
        
        
    
        
        boolean opcao= true;
        while (opcao){
            /// instanciei as classes de mago com valores genericos para serem alterados na propria classe filha
            // gerando um polimorfismo(mandando os valores alterados para a classe mae )
            MAGO personElfo = new spelholer(0,0.0,0,0,"",0,0,0,0,"","");
            MAGO personHUMANO = new sorcere(0,0.0,0,0,"",0,0,0,0,"","");
            MAGO personOrc = new overlord(0,0.0,0,0,"",0,0,0,0,"","");
            
            
            // precisa criar o dos fighter. tempo estimado 2h.
            
            // configurando os status base dos magos
            ((sorcere) personHUMANO).StatusBaseMago();
            ((spelholer)personElfo).StatusBaseMago();
            ((overlord)personOrc).StatusBaseMago();

            int menu = Integer.parseInt(JOptionPane.showInputDialog(
                    "BEM-VINDO AO RPG\n"
                    +"1 - COMO FUNCIONA O RPG\n" // explicar melhor o jogo
                    +"2 - VER LORE DOS PERSONAGENS\n"
                    +"3 - JOGAR - CADASTRAR PERSONAGEM\n"
                    +"4 - imprimir seus personagens\n"
                    +"5 - ver status de batalha\n"
                    +"0 - Para encerrar o programa\n"));
            switch (menu){
                case 1 ->{
                          //criei funçoes statics para facilitar a visualização do codigo
                          
                          explicaoDoJogo(); // melhorar a explicacao
                          statusDasClasses(personHUMANO);
                          
                          // adicionar o status das outras classes
                          // é mais viavel criar uma função para cada person?( de cada classe(raça))? analisar
                }
                case 2 ->{
                         //analisar para verificar se esta tudo ok.
                         ExplicaRaca(); // explicar as raças nada mais é doq falar da lore deles,(historia)
                }
                case 3 -> {
                    // criar cadastramento individual?// talvez seja a melhor opcao
                    CadastraPersonagem(personHUMANO);
                    break;
                }
                case 4 ->{
                    // parece perfeito
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






