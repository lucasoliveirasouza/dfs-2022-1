package br.com;

import br.com.models.Aluno;
import br.com.models.Endereco;
import br.com.models.Professor;
import br.com.models.Turma;

public class Main {
    public static void main(String[] args) {

        //Criando endereco para então criar um aluno e associar esse endereço;
        Endereco endereco = new Endereco("Rua A20", "29", 1234, "Trindade", "GO", "75391952-25");
        Aluno aluno1 = new Aluno("Lucas", "(62)99253-1601", "M", "190.000.000-00", endereco,"20225658");
        endereco = new Endereco("Rua A20", "29", 1234, "Trindade", "GO", "75391952-25");
        Aluno aluno2 = new Aluno("Vitor", "(62)98452-0852", "M", "191.000.000-00",endereco, "20225657");

        //Criando Professor com seu respectivo endereco
        endereco = new Endereco("Rua A20", "29", 1234, "Trindade", "GO", "75391952-25");
        Professor professor = new Professor("Maria", "(62)98140-5624", "F", "192.000.000-00",endereco, 6500);

        //Criando turma e adicionando alunos a essa turma;
        Turma turma1 = new Turma("2° ano B");
        turma1.setAlunos(aluno1);
        turma1.setAlunos(aluno2);



    }
}
