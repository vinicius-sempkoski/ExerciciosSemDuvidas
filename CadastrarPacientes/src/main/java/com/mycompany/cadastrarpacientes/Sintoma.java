package com.mycompany.cadastrarpacientes;

/**
 *
 * @author Vinicius
 */
public class Sintoma {
     public String sintomaa;
    public boolean dorLocalizada;
    public int diasComSintoma;
    public double riscoInfeccao;
    public char tipoSanguineo;

    public Sintoma(String sintom, boolean dorLoc, int dias, double riscoi, char tiposangue) {
        sintomaa = sintom;
        dorLocalizada = dorLoc;
        diasComSintoma = dias;
        riscoInfeccao = riscoi;
        tipoSanguineo = tiposangue;
    }

    public String getInfoCadastro() {
        return "Sintoma informado: " + sintomaa + " Dor localizada: " + dorLocalizada + " Dias com sintoma: " + diasComSintoma
                + " tem risco de infeccao? " + riscoInfeccao + " tipo sanguineo: " + tipoSanguineo;
    }

}
