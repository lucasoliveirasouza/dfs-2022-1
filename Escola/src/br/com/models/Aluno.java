package br.com.models;

import br.com.generics.PessoaAbstrata;

import java.util.Date;

public class Aluno extends PessoaAbstrata {
    private String matricula;

    public Aluno(String nome, String telefone, String sexo, String cpf, Endereco endereco, String matricula) {
        super(nome, telefone, sexo, cpf, endereco);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
