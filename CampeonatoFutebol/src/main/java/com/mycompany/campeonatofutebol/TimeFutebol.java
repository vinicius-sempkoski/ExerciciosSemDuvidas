package com.mycompany.campeonatofutebol;

/**
 *
 * @author Vinicius
 */
public class TimeFutebol extends Jogador {
    public String nomeTime;
    public String corTime;
    public String tecnico;
    public int titulos;
    public Jogador jogadorTime;

    public TimeFutebol(String nome, int num, String posi, String tm, int idd, String nomeTm, String cor, String tecn, int ttls) {
        super(nome, num, posi, tm, idd);
        nomeTime = nomeTm;
        corTime = cor;
        tecnico = tecn;
        titulos = ttls;
    }
    
}
