package com.mycompany.newrpg;




import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author alanb
 */
public class NEWRPG {
    


public static void imprimirPersonagem(ArrayList<personagem> listaPersonagem) {
    boolean continua = true;
    while(continua){
        
    
    String[] opcoes = new String[listaPersonagem.size()];
    
    for (int i = 0; i < listaPersonagem.size(); i++) {
        opcoes[i] = listaPersonagem.get(i).getNome();
    }
        

    int escolha = JOptionPane.showOptionDialog(null, "Escolha um personagem:", "Lista de Personagens", 
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

    if (escolha != JOptionPane.CLOSED_OPTION) {
        personagem personagemAtual = listaPersonagem.get(escolha);

        JOptionPane.showMessageDialog(null,
                "NOME DO PERSONAGEM:\n" + personagemAtual.getNome() +
                        "\nDESCRIÇÕES DA CLASSE\n"
                                + "Dano Magico: " + personagemAtual.getDanoM()+"\n"
                                        + "Resistencia Fisica: "+ personagemAtual.getResistenciaF()+"\n"
                                                + "Resistencia Magica: "+ personagemAtual.getResistenciaM()+"\n"
                                                        + "Vida: " + personagemAtual.getVida()+"\n"
                                                                + "Numero vitoria: " + personagemAtual.getVitoria()+"\n"
                                                                        + "Numero de derrotas: "+personagemAtual.getDerrota());
        if(personagemAtual instanceof sorcere){
            JOptionPane.showMessageDialog(null, "Poder Sorcere: "+((sorcere)personagemAtual).getPoderSorce()+"\n");
            
        }else if (personagemAtual instanceof spelholer){
               JOptionPane.showMessageDialog(null, "Poder spelholer: "+((spelholer)personagemAtual).getpoderSpel());

        }else if (personagemAtual instanceof overlord){
               JOptionPane.showMessageDialog(null, "Poder overlord: "+((overlord)personagemAtual).getpoderOver());
            
        }else if (personagemAtual instanceof sargittarius){
               JOptionPane.showMessageDialog(null, "Poder sargittarius: "+((sargittarius)personagemAtual).getPoderSargittarius());

        }else if (personagemAtual instanceof Titan){
               JOptionPane.showMessageDialog(null, "Poder Titan: "+((Titan)personagemAtual).getPoderTitan());
            
        }else if (personagemAtual instanceof Duelist){
               JOptionPane.showMessageDialog(null, "Poder Duelist: "+((Duelist)personagemAtual).getPoderDuelist());
           
        }
        int continuar = JOptionPane.showConfirmDialog(null, "Deseja continua "
                + "visualizando os personagens?", "CONTINUAR", JOptionPane.YES_NO_OPTION);
        if (continuar != JOptionPane.YES_NO_OPTION){
            continua = false;
        }
    }else{
        continua = false;
    
    }
}
}





    // essa funçao dependa da de cima // TALVEZ NAO PRECISE MAIS
    //// OK
    public static void ExplicaRaca(){


        boolean continua = true;
        while (continua){
            
            String[] opcoes = {"HUMANO (fighter)-SAGITTARIUs",
                "HUMANO(mago)-SORCERE", 
                "ORC(Fighter)-TITAN",
                "ORC(Mago)-OVERLORD",
                "DARK ELFO(Fighter)-DUELISTA",
                "DARK ELFO(Mago)-SPELHOOLER", "SAIR"};

        String menu = (String) JOptionPane.showInputDialog(null,
            "Escolha um item", "Opção",
            JOptionPane.INFORMATION_MESSAGE, null,
            opcoes, opcoes[0]);
        
            if(menu != null){
                if(menu =="HUMANO (fighter)-SAGITTARIUs"){
                // Exibir descrição para HUMANO (fighter) - SAGITTARIUs
                JOptionPane.showMessageDialog(null,  
                "HUMANO (fighter) - SAGITTARIUs\n\n"
                + "São arqueiros chamados de SAGITTARIUs\n"
                + "rapida velocidade e dependem da distancia.\n\n");
                // adicionar lore dos personagens

            }
                        else if(menu =="HUMANO(mago)-SORCERE"){
                // Exibir descrição para HUMANO(mago) - SORCERE
                JOptionPane.showMessageDialog(null, "HUMANO(mago) - SORCERE\n\n"
                + "Magos humanos sao dominadores de fogo, conhecidos como Sorcere's\n"
                + "Possuiem baixa resistencia fisica, mas compensa no dano\n\n");
            }
             else if(menu =="ORC(Fighter)-TITAN") {
                // Exibir descrição para ORC(Fighter) - TITAN
                 JOptionPane.showMessageDialog(null,
                "ORC(Fighter) - TITAN \n\n"
                + "ORCs são treinados desde pequeno na arte da luta\n"
                + "é a classe mais forte fisicamente dos Orc's é o Titan(Voce nao quer lutar corpo-a-corpo com esse cara)\n\n");
            }
             else if(menu == "ORC(Mago)-OVERLORD"){
                // Exibir descrição para ORC(Mago) - OVERLORD
                  JOptionPane.showMessageDialog(null, "ORC(Mago) - OVERLORD\n\n"
                + "Orc's se aperfeiçuaram na arte de roubar força vital(vida) e sao chamados de OVERLORD's\n"
                + "São macumbeiros, entao envenena seus inimigos em area\n"
                + "possui muita resistencia fisica e magica, mas são lentos\n\n");
            }else if(menu =="DARK ELFO(Fighter)-DUELISTA"){
                // Exibir descrição para DARK ELFO(Fighter) - DUELISTA
                JOptionPane.showMessageDialog(null,
                "DARK ELFO(Fighter) - DUELISTA\n\n"
                + "Os elfos negros lutadores sao rapidos chamados de DUELIST's dominadores de duas espadas\n"
                + "Usam o estilo corpo-a-corpo\n"
                + "Possui pouco dano, mas eles sao experientes em dar ataques mortais no seus inimigos.\n\n");
            }else if(menu =="DARK ELFO(Mago)-SPELHOOLER") {
                // Exibir descrição para DARK ELFO(Mago) - SPELHOOLER
                JOptionPane.showMessageDialog(null, "DARK ELFO(Mago) - SPELHOOLER\n\n"
                + "Elfos negros que dominam a magia negra são chamados de SPELHOLLER\n"
                + "Eles sao os magos que dominaram o vento graças ao conhecimento da deusa da floresta negra Merlin");
            }
            else if(menu =="SAIR"){
                continua = false;
            }else {
            continua = false; // O usuário clicou em cancelar
        }
            }
        
    }
       
}

    
                                ////OK////
       public static void statusDasALLClasses(personagem personHUMANO,personagem personElfo,personagem personOrc,
               personagem personHUMANO2,personagem persoElfo2,personagem personOrc2){
        ((sorcere) personHUMANO).StatusBaseMago();
        ((spelholer) personElfo).StatusBaseMago();
        ((overlord) personOrc).StatusBaseMago();
        // fighter abaixo..... magos acima
        ((Titan)personOrc2).StatusBaseFighter();
        ((sargittarius)personHUMANO2).StatusBaseFighter();
        ((Duelist)persoElfo2).StatusBaseFighter();

         
          boolean continua=true;
          while (continua){
             String[] opcoes = {"HUMANO(mago) - SORCERE" ,"DARK ELFO(Mago) - SPELHOOLER","ORC(Mago) - OVERLORD","HUMANO (fighter) - SAGITTARIUs",
           "ORC(Fighter) - TITAN",  "DARK ELFO(Fighter) - DUELISTA","\nSAIR"};
                   int menu = JOptionPane.showOptionDialog(null, "Escolha uma raça e classe:", "Escolha de Raça e Classe",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
              switch(menu){
                  
                  case 0->{
                        JOptionPane.showMessageDialog(null, "STATUS BASE DA CLASSE - MAGO - SORCERE\n\n"
                        + "Descrição: \n"+personHUMANO.descricao +"\n\n"
                                + "Magia: \n"+personHUMANO.magia);
                                
                  }
                  case 1->{
                        JOptionPane.showMessageDialog(null, "STATUS BASE DA CLASSE - MAGO - SPELHOLER\n\n"
                        + "Descrição: \n"+personElfo.descricao +"\n\n"
                                + "Magia: \n"+ personElfo.magia);
                      
                  }
                  case 2->{
                        JOptionPane.showMessageDialog(null, "STATUS BASE DA CLASSE - MAGO - OVERLORD\n\n"
                        + "Descrição: \n"+personOrc.descricao + "\n\n"
                                + "Magia: \n" +personOrc.magia );
                                       
                  }
                  case 3->{
                        JOptionPane.showMessageDialog(null, "STATUS BASE DA CLASSE - FIGHTER - SARGITTARIUS\n\n"
                        + "Descrição: \n"+personHUMANO2.descricao+ "\n\n"
                                + "Magia: "+ personHUMANO2.magia);
                      //humano fight
                  }
                  case 4->{
                        JOptionPane.showMessageDialog(null, "STATUS BASE DA CLASSE - FIGHTER - TITAN\n\n"
                        + "Descrição: \n"+personOrc2.descricao + "\n\n"
                                + "Magia: "+ personOrc2.magia);
                      //titan
                  }
                  case 5->{
                        JOptionPane.showMessageDialog(null, "STATUS BASE DA CLASSE - FIGHTER - DUELISTA\n\n"
                        + "Descrição: \n"+persoElfo2.descricao+ "\n\n"
                                + "Magia: "+ persoElfo2.magia);
                      //deusli
                  }
                  case 6->{
                      continua = false;
                  }
                  default ->{
                            JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente."
                                    + "", "AVISO",JOptionPane.ERROR_MESSAGE);

                      
                  }
                
                   
              }
              
          }
  
           
       } 

       
       //// OK
     public static void explicaoDoJogo (){
         JOptionPane.showMessageDialog(null, "OLÁ CAMPEÃO - SEJA BEM-VINDO\n"); // CRIAR UMA EXPLICAÇÃO MELHOR
         JOptionPane.showMessageDialog(null, "Neste mundo existem 3 raças\n"
                 + "Todas possuiem duas classe (MAGO e FIGHTER)"); 
         JOptionPane.showMessageDialog(null,"Parece confuso? vamos explicar melhor");
                 JOptionPane.showMessageDialog(null,"Funciona da seguinte maneira\n"
                + "MAGO>HUMANO = Sorcere\n"
                + "MAGO>DARK ELFO = SpelHoler\n"
                + "MAGO>ORC = Overlord\n\n"
                + "FIGHTER>HUMANO= Sargittarius\n"
                + "FIGHTER>DARK ELFO = Duelist\n"
                + "FIGHTER>ORC = Titan\n");
         ExplicaRaca();
     }
     
     
     // passando com
     public static void CadastraPersonagemMAGO(personagem personHUM, personagem personORC,personagem personElfo,
             ArrayList<personagem> listaPersonagem){
         // cria magos automaticos 
        
         
        String nome = JOptionPane.showInputDialog("Nome do personagem\n");
        
        int raca = Integer.parseInt (JOptionPane.showInputDialog("Qual a raça de mago deseja escolher?\n"
        + "1 - humano\n"
        + "2 - Dark Elfo\n"
        + "3 - Orc"));  

        // cadastra o sorcere.
        if (raca == 1){
            ((sorcere) personHUM).HUMANOsorcere(); // isso acessa os metodos especificos das classes filhas. serve para imprimir tambem.
            ((sorcere)personHUM).setNome(nome);
            listaPersonagem.add(personHUM);// adiciona no personagem a raça e o nome;
            JOptionPane.showMessageDialog(null,"voce é um: SORCERE\nRaça: Humano\nClasse: Mago\nRaça: "+personHUM.raca);
        }
        if(raca == 2){
           ((spelholer)personElfo).ElfoSpelholer();
           ((spelholer)personElfo).setNome(nome);
           listaPersonagem.add(personElfo);
           JOptionPane.showMessageDialog(null,"Você é um: SPELHOLER\nRaça: Dark Elfo\nClasse: Mago\nRaça: "+personElfo.raca);

        }
        if (raca == 3){
            ((overlord) personORC).ORCoverlord();// acessando do modo correto // o get chama a função
            ((overlord)personORC).setNome(nome);
            listaPersonagem.add(personORC);
            JOptionPane.showMessageDialog(null,"Você é um: OVERLORD\nRaça: Orc\nClasse: Mago\nRaça: "+personORC.raca);
        }
                    
               
     }
     public static void CadastraPersonagemFighter(personagem personHUMANO2,personagem persoElfo2,personagem personOrc2,
             ArrayList<personagem> listaPersonagem){
                 String nome = JOptionPane.showInputDialog("Nome do personagem\n");

        int raca = Integer.parseInt (JOptionPane.showInputDialog("Qual a raça de mago deseja escolher?\n"
        + "1 - humano\n"
        + "2 - Dark Elfo\n"
        + "3 - Orc"));  

        // cadastra o sorcere.
        if (raca == 1){
            ((sargittarius) personHUMANO2).HumanoSargittarius(); // isso acessa os metodos especificos das classes filhas. serve para imprimir tambem.
            ((sargittarius)personHUMANO2).setNome(nome);
            listaPersonagem.add(personHUMANO2);// adiciona no personagem a raça e o nome;
            JOptionPane.showMessageDialog(null,"Você é um: SARGITTARIUS\nRaça: Humano\nClasse: Fighter\nRaça: "+personHUMANO2.raca);
        }
        if(raca == 2){
           ((Duelist)persoElfo2).ElfoDueslit();
           ((Duelist)persoElfo2).setNome(nome);
           listaPersonagem.add(persoElfo2);
           JOptionPane.showMessageDialog(null,"Você é um: DUELISTA\nRaça: Dark Elfo\nClasse: Fighter\nRaça: "+persoElfo2.raca);

        }
        if (raca == 3){
            ((Titan) personOrc2).OrcTitan();// acessando do modo correto // o get chama a função
            ((Titan)personOrc2).setNome(nome);
            listaPersonagem.add(personOrc2);
            JOptionPane.showMessageDialog(null,"Você é um: TITAN\nRaça: Orc\nClasse: Fighter\nRaça: "+personOrc2.raca);
        }
         
     }
     
     
     public static void CriaPersonagensAUTO(personagem p1,personagem p2,personagem p3, personagem p4,personagem p5, personagem p6,
              ArrayList<personagem> listaPersonagemAUTO){
              String nome = "chatuba";
             ((sorcere) p1).HUMANOsorcere();
             ((sorcere)p1).setNome(nome);
             listaPersonagemAUTO.add(p1);
             
             ((overlord)p2).ORCoverlord();
             ((overlord)p2).setNome(nome);
             listaPersonagemAUTO.add(p2);

             ((spelholer) p3).ElfoSpelholer();
             ((spelholer)p3).setNome(nome);
             listaPersonagemAUTO.add(p3);
             
             ((sargittarius)p4).HumanoSargittarius();
             ((sargittarius)p4).setNome(nome);
             listaPersonagemAUTO.add(p4);
             
             ((Duelist)p5).ElfoDueslit();
             ((Duelist)p5).setNome(nome);
             listaPersonagemAUTO.add(p5);
             
             ((Titan) p6).OrcTitan();
             ((Titan)p6).setNome(nome);
             listaPersonagemAUTO.add(p6);

          
//            CriaPersonagensAUTO(personHUMANO,personOrc, personElfo,personHUMANO2,persoElfo2,personOrc2,listaPersonagemAUTO);

     }
     
     
     public static int GeraNumeroAleatorio(){
         Random random = new Random();
         return random.nextInt(1,6);
     }
     // passar dois personagens para batalha
     public static void batalha(ArrayList<personagem> listaPersonagemAUTO, ArrayList<personagem> listaPersonagem){

         int terreno = Integer.parseInt(JOptionPane.showInputDialog("Escolha o campo de batalha\n"
                 + "1 - campo aberto\n"
                 + "2 - caverna\n"
                 + "3 - floresta"));
         int indiceAleatorio = GeraNumeroAleatorio();
         String[] opcoes = new String[listaPersonagem.size()];
    
            for (int i = 0; i < listaPersonagem.size(); i++) {
                opcoes[i] = listaPersonagem.get(i).getNome();
            }

                int escolha = JOptionPane.showOptionDialog(null, "Escolha um personagem:", "Lista de Personagens", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
            
                personagem p1 = listaPersonagemAUTO.get(indiceAleatorio);
                personagem p2 = listaPersonagem.get(escolha);
                JOptionPane.showMessageDialog(null,"Raça aleatorio "+p1.raca);
                JOptionPane.showMessageDialog(null,"Raça usuario "+p2.raca);

           if(terreno == 1){
               if (p1.raca == 1&&(p2.raca==2 || p2.raca ==3|| p2.raca ==5|| p2.raca ==6)){
                    p1.incrementarVitoria();
                    p2.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p1.getNome() + " Ganhou!");                   
               }else if(p1.raca == 2 &&(p2.raca == 3||p2.raca==5||p2.raca==6)){
                    p1.incrementarVitoria();
                    p2.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p1.getNome() + " Ganhou!");
               }else if(p1.raca==3 &&(p2.raca==5||p2.raca==6)){
                   p1.incrementarVitoria();
                   p2.incrementarDerrota();
                   JOptionPane.showMessageDialog(null, "O personagem " + p1.getNome() + " Ganhou!");
               }else if (p1.raca==4&&(p2.raca==1||p2.raca==2||p2.raca==3||p2.raca==5||p2.raca==6)){
                   p1.incrementarVitoria();
                   p2.incrementarDerrota();
                   JOptionPane.showMessageDialog(null, "O personagem " + p1.getNome() + " Ganhou!");                   
               }else if(p1.raca==5&&p2.raca==6){
                   p1.incrementarVitoria();
                   p2.incrementarDerrota();
                   JOptionPane.showMessageDialog(null, "O personagem " + p1.getNome() + " Ganhou!");
               }else if(p2.raca == 1&&(p1.raca==2 || p1.raca ==3|| p1.raca ==5|| p1.raca ==6)){
                   p2.incrementarVitoria();
                   p1.incrementarDerrota();
                   JOptionPane.showMessageDialog(null, "O personagem " + p2.getNome() + " Ganhou!");                   
               }else if(p2.raca == 2 &&(p1.raca == 3||p1.raca==5||p1.raca==6)){
                    p2.incrementarVitoria();
                    p1.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p2.getNome() + " Ganhou!");
               }else if(p2.raca==3 &&(p1.raca==5||p1.raca==6)){
                   p2.incrementarVitoria();
                   p1.incrementarDerrota();
                   JOptionPane.showMessageDialog(null, "O personagem " + p2.getNome() + " Ganhou!");
               }else if (p2.raca==4&&(p1.raca==1||p1.raca==2||p1.raca==3||p1.raca==5||p1.raca==6)){
                   p2.incrementarVitoria();
                   p1.incrementarDerrota();
                   JOptionPane.showMessageDialog(null, "O personagem " + p2.getNome() + " Ganhou!");                   
               }else if(p2.raca==5&&p1.raca==6){
                   p2.incrementarVitoria();
                   p1.incrementarDerrota();
                   JOptionPane.showMessageDialog(null, "O personagem " + p2.getNome() + " Ganhou!");
               }else if(p2.raca == p1.raca || p1.raca== p2.raca){
                   JOptionPane.showMessageDialog(null,"AAaa, empate");
               }else{
                   JOptionPane.showMessageDialog(null,"Opa, sem confronto.. eles são iguais");
               }
                
            }

            if (terreno == 2) { // Caverna
                if (p1.raca == p2.raca){
                     JOptionPane.showMessageDialog(null,"EMPATE");
                }
                else if (p1.raca == 1 &&(p2.raca == 2 || p2.raca==4)) {
                    p1.incrementarVitoria();
                    p2.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p1.getNome() + " Ganhou!");
                } else if (p1.raca == 2 && p2.raca == 4) {
                    p1.incrementarVitoria();
                    p2.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p1.getNome() + " Ganhou!");
                } else if (p1.raca == 3 && (p2.raca == 2|| p2.raca==4|| p2.raca==1)) {
                    p1.incrementarVitoria();
                    p2.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p1.getNome() + " Ganhou!");
                } else if (p1.raca == 1|| p1.raca==2|| p1.raca==3 || p1.raca==5|| p1.raca==6 && (p1.raca==4)) {
                    p1.incrementarVitoria();
                    p2.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p1.getNome() + " Ganhou!");
                } else if (p1.raca == 5 && (p2.raca == 1 || p2.raca == 2 || p2.raca == 3|| p2.raca ==4)) {
                    p1.incrementarVitoria();
                    p2.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p1.getNome() + " Ganhou!");
                } else if (p1.raca == 6 && (p2.raca == 1 || p2.raca == 2 || p2.raca == 3 || p2.raca == 4 || p2.raca == 5)) {
                    p1.incrementarVitoria();
                    p2.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p1.getNome() + " Ganhou!");
                } else if (p2.raca == 6 && (p1.raca == 1 || p1.raca == 2 || p1.raca == 3 || p1.raca == 4 || p1.raca == 5)) {
                    p2.incrementarVitoria();
                    p1.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p2.getNome() + " Ganhou!");
                } else if (p2.raca == 1 &&(p1.raca == 2 || p1.raca==4)) {
                    p2.incrementarVitoria();
                    p1.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p2.getNome() + " Ganhou!");
                   
                } else if (p2.raca == 2 && p1.raca == 4)  {
                    p2.incrementarVitoria();
                    p1.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p2.getNome() + " Ganhou!");
                } else if (p2.raca == 3 && (p1.raca == 1||p1.raca==2||p1.raca==4)) {
                    p2.incrementarVitoria();
                    p1.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p2.getNome() + " Ganhou!");
                } else if (p2.raca == 1 || p1.raca ==2 || p1.raca == 3 || p1.raca == 5||p1.raca==6 && (p1.raca ==4)) {
                    p2.incrementarVitoria();
                    p1.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p2.getNome() + " Ganhou!");
                } else if (p2.raca == 4 && (p2.raca == 1 || p2.raca == 2 || p2.raca == 3 || p2.raca == 5 || p1.raca == 6)) {
                    p2.incrementarVitoria();
                    p1.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p2.getNome() + " Ganhou!");
                }else if (p2.raca==5 &&(p2.raca==1 || p2.raca==2 || p2.raca==3 ||p2.raca == 4)){
                    p2.incrementarVitoria();
                    p1.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p2.getNome() + " Ganhou!");
                    
                }else{
                    JOptionPane.showMessageDialog(null,"Nao houve batalha");
                }
                    
                
            }
            if (terreno == 3) { // Floresta
                if (p1.raca == 1 && (p2.raca == 3 || p2.raca == 6)) {
                    p1.incrementarVitoria();
                    p2.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p1.getNome() + " Ganhou!");
                } else if (p1.raca == 2 && (p2.raca == 1 || p2.raca == 3|| p2.raca == 4|| p2.raca == 5|| p2.raca == 6)) {
                    p1.incrementarVitoria();
                    p2.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p1.getNome() + " Ganhou!");
                } else if (p1.raca == 3 && (p2.raca == 4|| p2.raca == 6)) {
                    p1.incrementarVitoria();
                    p2.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p1.getNome() + " Ganhou!");
                } else if (p1.raca == 4 && (p2.raca == 1|| p2.raca == 6)) {
                    p1.incrementarVitoria();
                    p2.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p1.getNome() + " Ganhou!");
                } else if (p1.raca == 5 && (p2.raca == 3 || p2.raca == 3 || p2.raca == 4 || p2.raca == 1|| p2.raca == 6)) {
                    p1.incrementarVitoria();
                    p2.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p1.getNome() + " Ganhou!");    
                }else if (p1.raca ==1|| p1.raca == 2|| p1.raca == 3|| p1.raca == 4|| p1.raca == 5&&( p2.raca == 6)){
                    p1.incrementarVitoria();
                    p2.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p1.getNome() + " Ganhou!");
                }
                else if (p2.raca == 1 && (p1.raca == 3 || p1.raca == 6)){
                    p2.incrementarVitoria();
                    p1.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p2.getNome() + " Ganhou!");
                } else if (p2.raca == 2 && (p1.raca == 1 || p1.raca == 3|| p1.raca == 4|| p1.raca == 5|| p1.raca == 6)){
                    p2.incrementarVitoria();
                    p1.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p2.getNome() + " Ganhou!");
                } else if (p2.raca == 3 && (p1.raca == 4|| p1.raca == 6)){
                    p2.incrementarVitoria();
                    p1.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p2.getNome() + " Ganhou!");
                } else if (p2.raca == 4 && (p1.raca == 1|| p1.raca == 6)){
                    p2.incrementarVitoria();
                    p1.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p2.getNome() + " Ganhou!");
                } else if (p2.raca == 5 && (p1.raca == 3 || p1.raca == 3 || p1.raca == 4 || p1.raca == 1|| p1.raca == 6)){
                    p2.incrementarVitoria();
                    p1.incrementarDerrota();
                    JOptionPane.showMessageDialog(null, "O personagem " + p2.getNome() + " Ganhou!");

                }else if (p2.raca ==1|| p2.raca == 2|| p2.raca == 3|| p2.raca == 4|| p2.raca == 5&&( p1.raca == 6)){
                    JOptionPane.showMessageDialog(null, "Ops, eles decidiram não se enfrentar");
                }
            }

 }
     
     
     public static void excluiPersonagem( ArrayList<personagem> listaPersonagem){
        String[] opcoes = new String[listaPersonagem.size()];

        for (int i = 0; i < listaPersonagem.size(); i++) {
        opcoes[i] = listaPersonagem.get(i).getNome();
    }
        

    int escolha = JOptionPane.showOptionDialog(null, "Escolha um personagem:", "Lista de Personagens", 
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
    
         listaPersonagem.remove(escolha);
         //colocar no arquivo
          

     }
         
////////////////////////////////////////////////////////////////////////////////
                            // metodos especificios acima//
     ///////////////////////////////////////////////////////////////////////////
                           // main do programa abaixo//
     //////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
               
        ArrayList<personagem> listaPersonagem = new ArrayList<>();
        ArrayList<personagem> listaPersonagemAUTO = new ArrayList<>();
    
        
        
        
    
        
        boolean opcao= true;
        while (opcao){
            /// instanciei as classes de mago com valores genericos para serem alterados na propria classe filha
            // gerando um polimorfismo(mandando os valores alterados para a classe mae )
            personagem personElfo = new spelholer(0,78,0,0,""
                    ,0,0,0,2,"","",0,0);
            personagem personHUMANO = new sorcere(0,77,0,0,"",0,0,0,1,"","",0,0);
            personagem personOrc = new overlord(0,69,0,0,"",0,0,0,3,"","",0,0);
            personagem personHUMANO2 = new sargittarius(0,79,0,0,"",0,0,0,4,"","",0,0);
            personagem persoElfo2 = new Duelist(0,80,0,0,"",0,0,0,5,"","",0,0);
            personagem personOrc2 = new Titan(0,95,0,0,"",0,0,0,6,"","",0,0);
            

            // cria personagens automaticos
             

            CriaPersonagensAUTO(personHUMANO,personOrc, personElfo,personHUMANO2,persoElfo2,personOrc2,listaPersonagemAUTO);


            int menu = Integer.parseInt(JOptionPane.showInputDialog(
                    "BEM-VINDO AO RPG\n"
                    +"1 - Como funciona?\n" // explicar melhor o jogo
                    +"2 - JOGAR - CADASTRAR PERSONAGEM\n"
                    +"3 - Ver - > Status de batalha - Nivel de poder\n"
                   + "4 - BATALHAR\n"
                   + "5 - excluir um personagem\n"
                   + "6 - Descrição das classes/\n"
                    +"0 - Para encerrar o programa\n"));
            switch (menu){
                case 1 -> {

                          explicaoDoJogo();
                          
                        
                }
                case 4->{
                    //batalhar.. escolher terreno
                    batalha(listaPersonagemAUTO,listaPersonagem);
                }

                case 2 -> {
                    // criar cadastramento individual?// talvez seja a melhor opcao
                    int classe = Integer.parseInt(JOptionPane.showInputDialog("Qual classe gostaria de jogar?\n1 - MAGO\n2 - Fighter"));
                    if (classe == 1){
                            CadastraPersonagemMAGO(personHUMANO,personOrc, personElfo,listaPersonagem);
                    }else if (classe ==2){
                        CadastraPersonagemFighter(personHUMANO2,persoElfo2,personOrc2, listaPersonagem);
                    }
                    break;
                }
                case 3 ->{
                    imprimirPersonagem(listaPersonagem);
                    break;
                }
                case 5 ->{
                    excluiPersonagem(listaPersonagem);
                }
                case 6->{
                   statusDasALLClasses(personHUMANO, personElfo,personOrc,personHUMANO2,persoElfo2,personOrc2);

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




                        


