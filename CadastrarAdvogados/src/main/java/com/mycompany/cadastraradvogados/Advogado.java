package com.mycompany.cadastraradvogados;

/**
 *
 * @author Vinicius
 */
public class Advogado {

    public String nome;
    public int idade;
    private int cpf;
    private int oab;
    private String telefone;
    private String email;
    private String area;

    public Advogado(String nomeAdv, int idadeAdv) {
        nome = nomeAdv;
        idade = idadeAdv;
    }

    public void setInfoAdv(int cpff, int oabb, String tel, String mail, String areaa) {
        cpf = cpff;
        oab = oabb;
        telefone = tel;
        email = mail;
        area = areaa;
    }

    public String getInfoAdv() {
        return " CPF: " + cpf + " Número OAB: " + oab + " Telefone: " + telefone + " E-mail: " + email + " Área de atuação: " + area + "\n";
    }
}
