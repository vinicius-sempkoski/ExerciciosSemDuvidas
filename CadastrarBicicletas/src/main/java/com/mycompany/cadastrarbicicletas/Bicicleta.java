package com.mycompany.cadastrarbicicletas;

/**
 *
 * @author Vinicius
 */
public class Bicicleta {

    public String marca;
    public String modelo;
    public String fabricante;
    private double precoBike;
    private String corBike;
    private int tam;
    private int marchas;

    public void corEpreco(String cor, double preco) {
        corBike = cor;
        precoBike = preco;
    }

    public void setMarchaeAro(int aro, int marcha) {
        tam = aro;
        marchas = marcha;
    }

    public String info() {
        return "Tamanho aro " + tam + " Quantidade marchas " + marchas + " Preço: " + precoBike + " Cor: "+corBike+" Marca: "+marca
                +" Modelo: "+ modelo+" Fabricante: "+ fabricante;
    }

    public Bicicleta(String mrc, String model, String fab) {
        marca = mrc;
        modelo = model;
        fabricante = fab;

    }

    public String getMarca() {
        return "Marca: " + marca;
    }
}
