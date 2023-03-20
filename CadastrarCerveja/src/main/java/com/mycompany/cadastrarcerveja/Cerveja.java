package com.mycompany.cadastrarcerveja;

/**
 *
 * @author Vinicius
 */
public class Cerveja {
    public String marca;
    public double preco;
    public String validade;
    public int quantidade;
    private int codigo;
    private int lote;
    
    public Cerveja (int lotee) {
        lote = lotee;
    }
    
    public void setInfos (String marcaa, double precoo, String validadee, int quantidadee, int cod) {
        marca = marcaa;
        preco = precoo;
        validade = validadee;
        quantidade = quantidadee;
        codigo = cod;
    }
    
    public String getInfos () {
        return "\nMarca da cerveja: " + marca
                + "\nPreço: R$" + preco
                + "\nQuantidade: " + quantidade
                + "\nValidade: " + validade
                + "\nLote: " + lote
                + "\nCódigo: " + codigo;
    }
    
}
