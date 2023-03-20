package com.mycompany.cadastraralunos;

/**
 *
 * @author Vinicius
 */
public class CadastrarAlunos {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Fernanda", 00227326);
        aluno1.setSexo('F');
        aluno1.setNota(10.0);
        aluno1.setPcd(false);
        
        Aluno aluno2 = new Aluno("Vinicius", 00231744);
        aluno2.setSexo('M');
        aluno2.setNota(10.0);
        aluno2.setPcd(false);
        
        Aluno aluno3 = new Aluno("Carlos", 00246754);
        aluno3.setSexo('M');
        aluno3.setNota(7.5);
        aluno3.setPcd(true);
        
        Turma turma1 = new Turma("ADS", 3, 40, aluno1);      
        if (turma1.getAluno() != null) {
            System.out.println("Aluno(a) " + aluno1.getNome() + " está cadastrado(a)");
        } else {
            System.out.println("Aluno(a) não está cadastrado(a)");
        }
        
        Turma turma2 = new Turma("Direito", 2, 45, aluno3);    
        if (turma2.getAluno() != null) {
            System.out.println("Aluno(a) " + aluno3.getNome() + " está cadastrado(a)");
        } else {
            System.out.println("Aluno(a) não está cadastrado(a)");
        }
        
    }
}
