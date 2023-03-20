package com.mycompany.campeonatofutebol;

/**
 *
 * @author Vinicius
 */
public class CampeonatoFutebol {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("José Urubu", 12, "Goleiro", "Internacional", 19);
        Jogador jogador2 = new Jogador("Luanzinho", 10, "Atacante", "Palmeiras", 17);
        Jogador jogador3 = new Jogador("Bananinha", 5, "Zagueiro", "Internacional", 22);
        Jogador jogador4 = new Jogador("Otavio Luiz", 8, "Lateral", "Internacional", 30);
        Jogador jogador5 = new Jogador("Marco Antonio", 18, "Volante", "Palmeiras", 26);
        
        TimeFutebol time1 = new TimeFutebol("Camilo", 23, "Meio", "Palmeiras", 24, "Palmeiras Clube", "Verde", "Mario", 5);
        TimeFutebol time2 = new TimeFutebol("Daniel", 38, "Meio", "Internacional", 20, "Internacional Clube", "Vermelho", "Dino", 8);
        
        System.out.println("Jogo de hoje é " + time1.nomeTime + " com a camisa " + time1.corTime + " com tecnico " + time1.tecnico +  " vs " + time2.nomeTime + " com a camisa " + time2.corTime + " com tecnico " + time2.tecnico );
    }
}
