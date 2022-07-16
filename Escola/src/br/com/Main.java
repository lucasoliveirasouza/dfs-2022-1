package br.com;

import br.com.generics.PessoaAbstrata;
import br.com.models.Aluno;
import br.com.models.Professor;
import br.com.models.Turma;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Lucas", "(62)99253-1601", new Date("k"), "190.000.000-00", "20225658");
        Aluno aluno2 = new Aluno("Vitor", "(62)98452-0852", new Date("k"), "191.000.000-00", "20225657");

        Professor professor = new Professor("Vitor", "(62)98452-0852", new Date("k"), "191.000.000-00", 6500);

        Turma turma1 = new Turma("2° ano B");
        turma1.setAlunos(aluno1);
        turma1.setAlunos(aluno2);

    }
}
