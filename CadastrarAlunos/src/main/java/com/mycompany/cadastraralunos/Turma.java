package com.mycompany.cadastraralunos;

/**
 *
 * @author Vinicius
 */
public class Turma {
    private String curso;
    private int periodo;
    private int qtdAlunos;
    private Aluno aluno;
    
    public Turma (String curso, int periodo, int qtdAlunos, Aluno aluno) {
        this.curso = curso;
        this.periodo = periodo;
        this.qtdAlunos = qtdAlunos;
        this.aluno = aluno;
    }
    
    public Aluno getAluno () {
        return aluno;
    }
}
