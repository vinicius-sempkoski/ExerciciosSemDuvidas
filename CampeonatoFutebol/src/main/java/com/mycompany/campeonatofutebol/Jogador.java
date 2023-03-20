package com.mycompany.campeonatofutebol;

/**
 *
 * @author Vinicius
 */
public class Jogador {

    private String nomJog;
    private int numJog;
    private int idade;
    private String time;
    private String posicao;

    public void reserva() {
        if (idade >= 30) {
            System.out.println("Jogador reserva.");
        } else {
            System.out.println("Jogador escalado");
        }
    }

    public Jogador(String nomeJ, int numJ, String equipe, String pos, int anos) {
        nomJog = nomeJ;
        numJog = numJ;
        idade = anos;
        time = equipe;
        posicao = pos;
    }
}
