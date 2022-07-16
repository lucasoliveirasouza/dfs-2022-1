package br.com.models;

import br.com.generics.PessoaAbstrata;

import java.util.Date;

public class Aluno extends PessoaAbstrata {
    private String matricula;

    public Aluno(String nome, String telefone, Date dataNascimento, String cpf, String matricula) {
        super(nome, telefone, dataNascimento, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
