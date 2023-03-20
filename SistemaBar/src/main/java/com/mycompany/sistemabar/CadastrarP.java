package com.mycompany.sistemabar;

/**
 *
 * @author Vinicius
 */
public class CadastrarP {

    private String nomeC;
    private int nMesa;
    private String data;
    private double valor;
    private String pedido;

    public void setNomeP(String nome) {
        nomeC = nome;
    }

    public void setMesa(int num) {
        nMesa = num;
    }

    public void setPedido(String ped) {
        pedido = ped;
    }

    public void setDate(String date) {
        data = date;
    }

    public void setValor(double valorP) {
        valor = valorP;
    }

    public double getValor() {
        return valor;
    }
}
