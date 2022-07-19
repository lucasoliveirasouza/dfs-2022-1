package br.com;

import br.com.generics.IAvaliacao;
import br.com.models.*;

public class Main {
    public static void main(String[] args) {

        //Criando endereco para então criar um aluno e associar esse endereço;
        Endereco endereco = new Endereco("Rua A20", "29", 1234, "Trindade", "GO", "75391952-25");
        Aluno aluno1 = new Aluno("Lucas", "(62)99253-1601", "M", "190.000.000-00","20225658");
        aluno1.setEndereco(endereco);
        endereco = new Endereco("Rua A20", "29", 1234, "Trindade", "GO", "75391952-25");
        Aluno aluno2 = new Aluno("Vitor", "(62)98452-0852", "M", "191.000.000-00", "20225657");
        aluno2.setEndereco(endereco);

        //Criando Professor com seu respectivo endereco
        endereco = new Endereco("Rua A20", "29", 1234, "Trindade", "GO", "75391952-25");
        Professor professor = new Professor("Maria", "(62)98140-5624", "F", "192.000.000-00", 6500);
        professor.setEndereco(endereco);

        //Criando turma e adicionando alunos a essa turma;
        Turma turma1 = new Turma("2° ano B");
        turma1.setAlunos(aluno1);
        turma1.setAlunos(aluno2);

        //Criando disciplina e associando o professor a ela
        Disciplina disciplina1 = new Disciplina("Matemática", 64);
        disciplina1.setProfessor(professor);

        //Associando disciplina a uma turma
        turma1.setDisciplinas(disciplina1);

        //Criando avaliações para uma disciplina
        IAvaliacao avaliacao = new Prova();
        disciplina1.setAvaliacoes(avaliacao);

        avaliacao = new Questionario();
        disciplina1.setAvaliacoes(avaliacao);

        avaliacao = new Prova();
        disciplina1.setAvaliacoes(avaliacao);

        avaliacao = new Prova();
        disciplina1.setAvaliacoes(avaliacao);

        double notaFinal = 0;

        //Cada avaliação vai calcular a nota conforme definido.
        notaFinal += disciplina1.getAvaliacoes().get(0).obterNota(8);
        notaFinal += disciplina1.getAvaliacoes().get(1).obterNota(10);
        notaFinal += disciplina1.getAvaliacoes().get(2).obterNota(6);
        notaFinal += disciplina1.getAvaliacoes().get(3).obterNota(5);

        System.out.println("A nota final é: " + notaFinal);







    }
}
