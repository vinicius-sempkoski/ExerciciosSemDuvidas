package com.mycompany.cadastrarpacientes;

/**
 *
 * @author Vinicius
 */
public class Paciente {
     public String nomePaciente;
    public String cpfPaciente;
    public int idadePaciente;
    public double pesoPaciente;
    public boolean eDeficiente;

    public Paciente(String nome, String cpf, int idade, double peso, boolean deficiente) {
        nomePaciente = nome;
        cpfPaciente = cpf;
        idadePaciente = idade;
        pesoPaciente = peso;
        eDeficiente = deficiente;
    }

    public String getInfoClientes() {
        return "Nome do paciente: " + nomePaciente + " CPF do paciente: " + cpfPaciente + " Idade do paciente: "
                + idadePaciente + " Peso do paciente: " + pesoPaciente + " Deficiente? " + eDeficiente;
    }
}

